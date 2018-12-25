package com.example.saiful.nearbyhospital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class NearbyHospitalsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HospitalRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_hospitals);
    }
}
