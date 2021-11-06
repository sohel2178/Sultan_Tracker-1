package com.forbitbd.sultantracker.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.alerts.AlertsFragment;
import com.forbitbd.sultantracker.ui.listview.ListViewFragment;
import com.forbitbd.sultantracker.ui.notification.NotificationFragment;
import com.forbitbd.sultantracker.ui.settings.SettingsFragment;
import com.forbitbd.sultantracker.ui.mapview.MapViewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new ListViewFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    loadFragment(new ListViewFragment());
                    return true;
                } else if (id == R.id.viewall) {
                    loadFragment(new MapViewFragment());
                    return true;
                } else if (id == R.id.alert) {
                    loadFragment(new AlertsFragment());
                    return true;
                } else if (id == R.id.notification) {
                    loadFragment(new NotificationFragment());
                    return true;
                }else if (id == R.id.settings) {
                    loadFragment(new SettingsFragment());
                    return true;
                }
                return false;
            }
        });
    }

    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
    }
}