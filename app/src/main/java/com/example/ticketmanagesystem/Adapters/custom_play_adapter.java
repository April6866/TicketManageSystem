package com.example.ticketmanagesystem.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ticketmanagesystem.DataHelper;
import com.example.ticketmanagesystem.R;
import com.example.ticketmanagesystem.data.Movie;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class custom_play_adapter  extends RecyclerView.Adapter<custom_play_adapter.ViewHolder>
implements View.OnClickListener{
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    private View view;

    private List<Movie> list;
    public custom_play_adapter(Context mContext) {
        this.mContext = mContext;

    }

    public custom_play_adapter(List<Movie> list,Context mContext) {
        this.list = list;
        this.mContext=mContext;
    }
    public void setData(List<Movie> list){
          this.list=list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_item, parent, false);
       custom_play_adapter.ViewHolder viewHolder = new custom_play_adapter.ViewHolder(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        list.get(position);
        holder.tva.setText(list.get(position).getMovieName());
        holder.tvd.setText(list.get(position).getAuthor());
        holder.im.setImageResource(list.get(position).getImgId());
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

    public void setOnItemClickListener(custom_play_adapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tva;
        TextView tvd;
        ImageView im;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                tva=itemView.findViewById(R.id.tva);
                tvd=itemView.findViewById(R.id.tvd);
                im=itemView.findViewById(R.id.iv);
            }
    }
}
