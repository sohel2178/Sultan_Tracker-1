package com.forbitbd.sultantracker.ui.settings.payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.models.Step;

import java.util.ArrayList;

public class PaymentActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StepAdapter adapter;
    private ArrayList<Step> stepList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        stepList = new ArrayList<>();
        adapter = new StepAdapter(this,stepList);
        recyclerView.setAdapter(adapter);
    }
}