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
import com.example.ticketmanagesystem.data.play;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class manager_play_adapter extends RecyclerView.Adapter<manager_play_adapter.ViewHolder> implements
        View.OnClickListener, View.OnLongClickListener {
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    private View view;
    DataHelper dataHelper;
    private List<Movie> list;
    public manager_play_adapter(Context mContext) {
        this.mContext = mContext;
        dataHelper =new DataHelper(mContext);
        list= dataHelper.queryAllMovieData();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //View item = LayoutInflater.from(mContext).inflate(R.layout.manager , parent ,false);
        //return new ViewHolder(item);
        //return null;
        // return new manager_play_adapter.ViewHolder(LayoutInflater.from(mContext).
        //inflate(R.layout.mana_item,parent,false));
        View view = LayoutInflater.from(mContext).inflate(R.layout.mana_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        list.get(position);
        holder.tva.setText(list.get(position).getMovieName());
        holder.tvd.setText(list.get(position).getAuthor());
        holder.im.setImageResource(list.get(position).getImgId());
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener( this);
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
   //需要实现删除逻辑
    public void removeData(int position) {

    }

    @Override
    public boolean onLongClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(view, (int) view.getTag());
        }
        return false;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tva;
        TextView tvd;
        ImageView im;
        public ViewHolder(@NonNull View view) {

            super(view);
            tva=itemView.findViewById(R.id.tva);
            tvd=itemView.findViewById(R.id.tvd);
            im=itemView.findViewById(R.id.iv);
        }
    }

    //自定义点击事件
    public interface OnItemClickListener {
        //条目的点击事件
        void onItemClick(View view, int position);

        //长按点击事件
        void onItemLongClick(View view, int position);

    }

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    //资源ID
    /**private int ResourseId;
     public manager_play_adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull play[] objects) {
     super(context, resource, textViewResourceId, objects);
     ResourseId=textViewResourceId;
     }
     public View getView(int position, View convertView, ViewGroup parent) {
     play mplay=getItem(position);
     View view;
     //此处简单的优化了下程序
     //manager_play_adapter 的 getView()方法，每次都将布局重新加载一遍。
     //convertView 参数，用于将之前加载好的布局进行缓存，以便之后可以重用。
     if(convertView == null){
     //LayoutInflater 来为这个子项加载我们传入的布局
     view = LayoutInflater.from(getContext()).inflate(ResourseId, parent,false);
     }else{
     view = convertView;
     }
     return view;
     }*/

}
