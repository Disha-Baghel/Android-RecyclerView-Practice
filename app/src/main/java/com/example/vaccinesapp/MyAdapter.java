package com.example.vaccinesapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {
    //1.Data Source
    private VaccineModel[] listData;

    public MyAdapter(VaccineModel[] listData){
        this.listData = listData;
    }

    // 2. View Holder Class :
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imageView = itemView.findViewById(R.id.imageView);
            this.textView = itemView.findViewById(R.id.textView);

        }
    }

    //3. Implementing the methods


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.recyclerview_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final VaccineModel myListData = listData[position];
        holder.textView.setText((listData[position].getTitle()));
        holder.imageView.setImageResource(listData[position].getImage());
    }
   @Override
    public int getItemCount() {
        return listData.length;
    }
}
