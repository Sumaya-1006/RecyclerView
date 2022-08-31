package com.example.recyclerview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private Context mContext;
    private List<Book> mData;

    public RecyclerViewAdapter(Context mContext, List<Book> mData){

        this.mContext = mContext;
        this.mData = mData;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //passing data from book activity

                Intent intent = new Intent (mContext,Book_Activity.class);
                Intent title = intent.putExtra("Title", mData.get(position).getTitle());
                Intent description = intent.putExtra("Description", mData.get(position).getDescription());
                Intent thumbnail = intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                //start activity

                mContext.startActivity(intent);


            }


        });

    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_book_title;
        ImageView img_book_thumbnail;
        CardView cardView;

       public MyViewHolder( View itemView) {
           super(itemView);

           tv_book_title = itemView.findViewById(R.id.book_title_id);
           img_book_thumbnail = itemView.findViewById(R.id.book_image_id);
           cardView = itemView.findViewById(R.id.cardView_id);
       }


    }
}
