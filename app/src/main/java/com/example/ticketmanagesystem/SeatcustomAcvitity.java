package com.example.ticketmanagesystem;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ticketmanagesystem.entity.SeatEntity;
import com.example.ticketmanagesystem.util.JSONUtils;
import com.example.ticketmanagesystem.util.TxtUtils;
import com.example.ticketmanagesystem.view.SeatTable;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatcustomAcvitity extends AppCompatActivity {
    private SeatTable mSearchView;

    List<SeatEntity.ColumnsFieldBean> columnsField;
    List<SeatEntity.RowsFieldBean> rowsField;
    //    List<String> lie = new ArrayList<String>();
    Map<String, String> lie = new HashMap();
    ArrayList<String> ccList = new ArrayList<String>();
    int rowStartNumberField;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seat_custom);
        mSearchView = findViewById(R.id.mSearchView);

         SeatTable.SeatChecker seatChecker = new SeatTable.SeatChecker() {

            @Override
            public boolean isValidSeat(int row, int column) {
                lie.clear();
                if (columnsField.get(column).getDescriptionField() == 2) {
                    lie.put("" + column, columnsField.get(column).getCodeField());
                    return false;
                } else {
                    lie.put("" + column, columnsField.get(column).getCodeField());
                    return true;
                }


            }

            @Override
            public boolean isSold(int row, int column) {
                //行 row
                // 列column  a c d
                //第几行的座位
                SeatEntity.RowsFieldBean rowsFieldBean = rowsField.get(row);
                //第几行的所有座位
                List<SeatEntity.RowsFieldBean.SeatsFieldBean> seatsField = rowsFieldBean.getSeatsField();
                //第0个的第A座
//               String codeField = seatsField.get(column).getCodeField();
                String s1 = lie.get("" + column);
                //ACD 只显示正常的座位

                for (int i = 0; i < seatsField.size(); i++) {
                    if (seatsField.get(i).getCodeField().equals(s1)) {
                        if (seatsField.get(i).isIsAvailField()) {
                            return false;
                        }
                    }
                }
                return true;

//                    if (row == 6 && column == 6) {
//                        return true;
//                    }
//                    return false;
            }

            @Override
            public void checked(int row, int column) {

                String s1 = lie.get("" + column);

            }

            @Override
            public void unCheck(int row, int column) {

            }

            @Override
            public String[] checkedSeatTxt(int row, int column) {
                return null;
            }

        };

        String s = TxtUtils.readAssetsTxt(SeatcustomAcvitity.this, "vv");

        Type type = new TypeToken<ArrayList<SeatEntity>>() {   }.getType();

        final ArrayList<SeatEntity> jsOn = JSONUtils.parseJSONArray(s, type);
        //多少列
        SeatEntity jsOn1 = jsOn.get(0);
        columnsField = jsOn1.getColumnsField();
        rowsField = jsOn1.getRowsField();
        rowStartNumberField = jsOn1.getRowStartNumberField();
        int rowEndNumberField = jsOn1.getRowEndNumberField();
        for (int i = rowStartNumberField; i < rowEndNumberField; i++) {
            ccList.add("" + i);
        }
        mSearchView.setScreenName("xxx");//设置屏幕名称
        mSearchView.setMaxSelected(43);//设置最多选中
        mSearchView.setLineNumbers(ccList);
        mSearchView.setSeatChecker(seatChecker);
        mSearchView.setData(rowsField.size(), columnsField.size());


    }
}
