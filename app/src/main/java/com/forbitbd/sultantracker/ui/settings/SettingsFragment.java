package com.forbitbd.sultantracker.ui.settings;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.settings.alertsetting.AlertSettingActivity;
import com.forbitbd.sultantracker.ui.settings.company.CompanyInfoActivity;
import com.forbitbd.sultantracker.ui.settings.customerservice.CustomerServiceActivity;
import com.forbitbd.sultantracker.ui.profile.ProfileActivity;
import com.forbitbd.sultantracker.ui.settings.expense.ExpenseActivity;
import com.forbitbd.sultantracker.ui.settings.language.LanguageSettingActivity;
import com.forbitbd.sultantracker.ui.settings.payment.PaymentActivity;
import com.forbitbd.sultantracker.ui.settings.sharedvehicle.SharedVehicleActivity;

import java.util.ArrayList;

public class SettingsFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Settings> settingsList;
    private SettingsAdapter adapter;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        settingsList = new ArrayList<>();
        settingsList.add(new Settings(getString(R.string.profile),R.drawable.ic_baseline_share_24));
        settingsList.add(new Settings(getString(R.string.shared_vehicles),R.drawable.ic_baseline_person_24));
        settingsList.add(new Settings(getString(R.string.alert_setting),R.drawable.ic_baseline_bus_alert_24));
        settingsList.add(new Settings(getString(R.string.payment_guide),R.drawable.ic_baseline_payment_24));
        settingsList.add(new Settings(getString(R.string.language),R.drawable.ic_baseline_language_24));
        settingsList.add(new Settings(getString(R.string.expenses),R.drawable.ic_baseline_attach_money_24));
        settingsList.add(new Settings(getString(R.string.company_info),R.drawable.ic_baseline_perm_contact_calendar_24));
        settingsList.add(new Settings(getString(R.string.customer_service),R.drawable.ic_baseline_person_24));
        settingsList.add(new Settings(getString(R.string.logout),R.drawable.ic_baseline_login_24));

        adapter = new SettingsAdapter(settingsList, new SettignsClickListener() {
            @Override
            public void ItemClick(int adapterPosition) {
                if (adapterPosition == 0 ){
                    startActivity(new Intent(getContext(), ProfileActivity.class));
                }else if (adapterPosition == 1){
                    startActivity(new Intent(getContext(), SharedVehicleActivity.class));
                }else if (adapterPosition == 2){
                    startActivity(new Intent(getContext(), AlertSettingActivity.class));
                }else if (adapterPosition == 3){
                    startActivity(new Intent(getContext(), PaymentActivity.class));
                }else if (adapterPosition == 4){
                    startActivity(new Intent(getContext(), LanguageSettingActivity.class));
                }else if (adapterPosition == 5){
                    startActivity(new Intent(getContext(), ExpenseActivity.class));
                }else if (adapterPosition == 6){
                    startActivity(new Intent(getContext(), CompanyInfoActivity.class));
                }else if (adapterPosition == 7){
                    startActivity(new Intent(getContext(), CustomerServiceActivity.class));
                }else if (adapterPosition == 8){
//                    startActivity(new Intent(getContext(), SharedVehicleActivity.class));
                }
            }
        });

        recyclerView.setAdapter(adapter);
        return view;
    }
}