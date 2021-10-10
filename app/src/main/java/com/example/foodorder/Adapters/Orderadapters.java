package com.example.foodorder.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorder.Models.Ordermodels;
import com.example.foodorder.R;

import java.util.ArrayList;

public class Orderadapters extends RecyclerView.Adapter<Orderadapters.viewholder> {


    ArrayList<Ordermodels>list;
    Context context;

    public Orderadapters(ArrayList<Ordermodels> list, Context context){
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view=LayoutInflater.from(context).inflate(R.layout.order_sample,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position){
        final Ordermodels ordermodels=list.get(position);
        holder.orderimage.setImageResource(ordermodels.getOrderImage());
        holder.solditemname.setText(ordermodels.getSoldItemName());
        holder.ordernumber.setText(ordermodels.getOrdernumber());
        holder.price.setText(ordermodels.getPrice());

    }

    @Override
    public int getItemCount(){
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        ImageView orderimage;
        TextView solditemname,ordernumber,price;


        public viewholder(@NonNull View itemView){
            super(itemView);

            orderimage=itemView.findViewById(R.id.orderimgid);
            solditemname=itemView.findViewById(R.id.orderItemnameid);
            ordernumber=itemView.findViewById(R.id.orderserial);
            price=itemView.findViewById(R.id.orderpricevalue);
//here might be confusion by id
        }
    }

}
