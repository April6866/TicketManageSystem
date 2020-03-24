package com.example.ticketmanagesystem.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ticketmanagesystem.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class manage_concert_adapter extends RecyclerView.Adapter<manage_concert_adapter.ViewHolder>
implements View.OnClickListener,View.OnLongClickListener{
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    public manage_concert_adapter(Context mContext) {
        this.mContext = mContext;
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(this);
        holder.itemView.setOnLongClickListener(this);
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

    @Override
    public boolean onLongClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(view, (int) view.getTag());
        }
        return false;
    }

    public void removeData(int position) {
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
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
