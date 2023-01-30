package com.example.vaccinesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // 1. AdapterView : RecyclerView
    RecyclerView recyclerView;

    //2. Data Source;
    VaccineModel[] myListData;

    //3. Adapter
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        myListData = new VaccineModel[]{
                new VaccineModel("Hepatitis B Vaccine", R.drawable.img),
                new VaccineModel("Tetanus", R.drawable.img),
                new VaccineModel("Pneumococcal Vaccine", R.drawable.img),
                new VaccineModel("Rotavirus Vaccine", R.drawable.img),
                new VaccineModel("Measles Virus", R.drawable.img),
                new VaccineModel("Cholera Virus", R.drawable.img),
                new VaccineModel("Covid=19 Virus", R.drawable.img)

        };

        //Adapter
        adapter  = new MyAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}