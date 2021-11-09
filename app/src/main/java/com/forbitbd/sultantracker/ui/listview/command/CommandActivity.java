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
        commandList.add(new Command(getString(R.string.power_on),R.drawable.power));
        commandList.add(new Command(getString(R.string.power_off),R.drawable.power));
        commandList.add(new Command(getString(R.string.power_on_sms),R.drawable.power));
        commandList.add(new Command(getString(R.string.power_off_sms),R.drawable.power));
        commandList.add(new Command(getString(R.string.get_location_sms),R.drawable.location));
        commandList.add(new Command(getString(R.string.vibration_alarm_on),R.drawable.vibrate));
        commandList.add(new Command(getString(R.string.vibration_alarm_off),R.drawable.vibrate));
        commandList.add(new Command(getString(R.string.set_time_zone),R.drawable.time_zone));
        commandList.add(new Command(getString(R.string.restrict_boundary),R.drawable.fence));
        commandList.add(new Command(getString(R.string.boundaries),R.drawable.fence));
        commandList.add(new Command(getString(R.string.create_route),R.drawable.route));

        adapter = new CommandAdapter(commandList, new CommandClickListener() {
            @Override
            public void ItemClick(int adapterPosition) {

            }
        });

        recyclerView.setAdapter(adapter);
    }
}