package com.example.ticketmanagesystem.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ticketmanagesystem.R;
import com.example.ticketmanagesystem.changeConcertActivity;
import com.example.ticketmanagesystem.data.Concert;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class manage_concert_adapter extends RecyclerView.Adapter<manage_concert_adapter.ViewHolder>
implements View.OnClickListener,View.OnLongClickListener{
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    private List<Concert> list;
    public manage_concert_adapter(Context mContext) {
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
        View view = LayoutInflater.from(mContext).inflate(R.layout.concert_item, parent,
                false);
        manage_concert_adapter.ViewHolder viewHolder = new manage_concert_adapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {


        holder.tv.setText(list.get(position).getConcertName());
        holder.tv2.setText(list.get(position).getShowTime());
        holder.btn_changeConcert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, changeConcertActivity.class);
                intent.putExtra("id",list.get(position).get_ID());
                intent.putExtra("concertName",list.get(position).getConcertName());
                mContext.startActivity(intent);
            }
        });
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(this);
        holder.itemView.setOnLongClickListener(this);
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

    @Override
    public boolean onLongClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(view, (int) view.getTag());
        }
        return false;
    }

    public void removeData(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }
    //添加数据
    public void addData(int position,Concert concert){
        list.add(position,concert);
        notifyItemInserted(position);
    }

    //修改数据
    public void changeData(int position,Concert concert){
        list.remove(position);
        list.add(position,concert);
        notifyItemChanged(position);
    }

    //自定义点击事件
    public interface OnItemClickListener {
        //条目的点击事件
        void onItemClick(View view, int position);

        //长按点击事件
        void onItemLongClick(View view, int position);


    }

    public void setOnItemClickListener(manage_concert_adapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = (manage_concert_adapter.OnItemClickListener) mOnItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv;
        TextView tv2;
        Button btn_changeConcert;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv=itemView.findViewById(R.id.tv);
            tv2=itemView.findViewById(R.id.tv2);
            btn_changeConcert=itemView.findViewById(R.id.btn_changeConcert);
        }
    }
}
