package com.forbitbd.sultantracker.ui.listview.command;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.models.Command;
import com.forbitbd.sultantracker.models.Settings;
import com.forbitbd.sultantracker.ui.profile.ProfileActivity;
import com.forbitbd.sultantracker.ui.settings.SettignsClickListener;
import com.forbitbd.sultantracker.ui.settings.SettingsAdapter;
import com.forbitbd.sultantracker.ui.settings.alertsetting.AlertSettingActivity;
import com.forbitbd.sultantracker.ui.settings.company.CompanyInfoActivity;
import com.forbitbd.sultantracker.ui.settings.customerservice.CustomerServiceActivity;
import com.forbitbd.sultantracker.ui.settings.expense.ExpenseActivity;
import com.forbitbd.sultantracker.ui.settings.language.LanguageSettingActivity;
import com.forbitbd.sultantracker.ui.settings.payment.PaymentActivity;
import com.forbitbd.sultantracker.ui.settings.sharedvehicle.SharedVehicleActivity;

import java.util.ArrayList;

public class CommandActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Command> commandList;
    private CommandAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        commandList = new ArrayList<>();
        commandList.add(new Command("POWER ON",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("POWER OFF",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("POWER ON SMS",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("POWER OFF SMS",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("GET LOCATION SMS",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("VIBRATION ALARM ON",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("VIBRATION ALARM OFF",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("SET TIME ZONE",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("RESTRICT BOUNDARY",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("BOUNDARIES",R.drawable.ic_baseline_settings_24));
        commandList.add(new Command("CREATE ROUTE",R.drawable.ic_baseline_settings_24));

        adapter = new CommandAdapter(commandList, new CommandClickListener() {
            @Override
            public void ItemClick(int adapterPosition) {

            }
        });

        recyclerView.setAdapter(adapter);
    }
}