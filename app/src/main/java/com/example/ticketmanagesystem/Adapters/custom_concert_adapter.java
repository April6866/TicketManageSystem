package com.example.ticketmanagesystem.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ticketmanagesystem.DataHelper;
import com.example.ticketmanagesystem.R;
import com.example.ticketmanagesystem.data.Concert;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class custom_concert_adapter extends RecyclerView.Adapter<custom_concert_adapter.ViewHolder>
        implements View.OnClickListener{
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    private List<Concert> list;
    DataHelper helper;
    public custom_concert_adapter(Context mContext) {
        this.mContext = mContext;

    }

    public List<Concert> getList() {
        return list;
    }

    public void setList(List<Concert> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.concert_item_two, parent, false);
        custom_concert_adapter.ViewHolder viewHolder = new custom_concert_adapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getConcertName());
        holder.tv2.setText(list.get(position).getShowTime());
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(view, (int) view.getTag());
        }
    }
    //自定义点击事件
    public interface OnItemClickListener {
        //条目的点击事件
        void onItemClick(View view, int position);



    }

    public void setOnItemClickListener(custom_concert_adapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = (OnItemClickListener) mOnItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        TextView tv2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            tv2=itemView.findViewById(R.id.tv2);
        }
    }

}
