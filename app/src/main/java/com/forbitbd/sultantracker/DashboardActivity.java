package com.forbitbd.sultantracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.forbitbd.sultantracker.ui.viewall.AllInMapFragment;
import com.forbitbd.sultantracker.ui.home.HomeFragment;
import com.forbitbd.sultantracker.ui.notification.NotificationFragment;
import com.forbitbd.sultantracker.ui.settings.SettingsFragment;
import com.forbitbd.sultantracker.utils.BaseActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Locale;

public class DashboardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        loadLocale();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadFragment(new HomeFragment());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    loadFragment(new HomeFragment());
                    return true;
                } else if (id == R.id.viewall) {
                    loadFragment(new AllInMapFragment());
                    return true;
                } else if (id == R.id.notification) {
                    loadFragment(new NotificationFragment());
                    return true;
                } else if (id == R.id.settings) {
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