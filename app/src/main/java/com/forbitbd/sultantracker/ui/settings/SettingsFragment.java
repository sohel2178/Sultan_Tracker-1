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
        settingsList.add(new Settings("Profile",R.drawable.ic_baseline_share_24));
        settingsList.add(new Settings("Shared Vehicles",R.drawable.ic_baseline_person_24));
        settingsList.add(new Settings("Alert",R.drawable.ic_baseline_bus_alert_24));
        settingsList.add(new Settings("Payment",R.drawable.ic_baseline_payment_24));
        settingsList.add(new Settings("Contact",R.drawable.ic_baseline_perm_contact_calendar_24));
        settingsList.add(new Settings("Language",R.drawable.ic_baseline_language_24));
        settingsList.add(new Settings("Expenses",R.drawable.ic_baseline_attach_money_24));
        settingsList.add(new Settings("Customer Service",R.drawable.ic_baseline_person_24));
        settingsList.add(new Settings("Logout",R.drawable.ic_baseline_login_24));

        adapter = new SettingsAdapter(settingsList, new SettignsClickListener() {
            @Override
            public void ItemClick(Settings settings) {
                int id = view.getId();
                if (id == 0 ){
//                    startActivity(new Intent(getContext(),ProfileActivity.class));
                }
            }
        });
        recyclerView.setAdapter(adapter);
        return view;
    }
}