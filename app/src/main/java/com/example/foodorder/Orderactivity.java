package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodorder.Adapters.Orderadapters;
import com.example.foodorder.Models.Ordermodels;
import com.example.foodorder.databinding.ActivityOrderactivityBinding;

import java.util.ArrayList;

public class Orderactivity extends AppCompatActivity {

    ActivityOrderactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        binding=ActivityOrderactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<Ordermodels>list=new ArrayList<>();
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));
        list.add(new Ordermodels(R.drawable.bronx1,"cheeseburger","8","1210234"));

        Orderadapters adapter=new Orderadapters(list,this);
        binding.orderrecVIEW.setAdapter(adapter);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        binding.orderrecVIEW.setLayoutManager(layoutManager);


    }
}