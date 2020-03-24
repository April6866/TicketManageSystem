package com.example.ticketmanagesystem.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ticketmanagesystem.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class custom_concert_adapter extends RecyclerView.Adapter<custom_concert_adapter.ViewHolder>
        implements View.OnClickListener{
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    public custom_concert_adapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.concert_item, parent, false);
        custom_concert_adapter.ViewHolder viewHolder = new custom_concert_adapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return 10;
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
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
