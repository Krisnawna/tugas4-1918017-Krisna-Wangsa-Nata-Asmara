package com.example.pertemuan4_prak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MotorAdapter adapter;
    private ArrayList<Motor> motorArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recyclerView);
        adapter = new MotorAdapter(motorArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData()
    {
        motorArrayList = new ArrayList<>();
        motorArrayList.add(new Motor("Custom Honda Cub", "Jenis : Santuy", "110.",R.drawable.bebekretro));
        motorArrayList.add((new Motor("Custom Honda GL ","Jenis : Balap", "300.",R.drawable.customcub)));
        motorArrayList.add((new Motor("Custom Astrea Legenda", "Jenis : Santuy", "140.",R.drawable.customdewe)));
        motorArrayList.add((new Motor("Custom Yamaha","Jenis : Balap", "200.",R.drawable.customgl)));
        motorArrayList.add((new Motor("Custom Suzuki sv650", "Jenis : Balap", "380.", R.drawable.davidson)));
        motorArrayList.add((new Motor("Custom Harley Davidson", "Jenis : Balap", "500.", R.drawable.suzuki_sv650)));
    }
}
