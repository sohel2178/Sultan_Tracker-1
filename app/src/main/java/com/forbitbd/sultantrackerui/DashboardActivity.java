package com.forbitbd.sultantrackerui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

import com.forbitbd.sultantrackerui.fragment.AllInMapFragment;
import com.forbitbd.sultantrackerui.fragment.ProfileFragment;
import com.forbitbd.sultantrackerui.fragment.HomeFragment;
import com.forbitbd.sultantrackerui.fragment.NotificationFragment;
import com.forbitbd.sultantrackerui.fragment.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

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
                } else if (id == R.id.profile) {
                    loadFragment(new ProfileFragment());
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
        AlertDialog alertDialog = new AlertDialog.Builder(DashboardActivity.this)
                .setIcon(R.drawable.stlogo)
                .setMessage("Did you want to close the application?")
                .setCancelable(true)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                })
                .setNeutralButton(R.string.common_google_play_services_update_title, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setNegativeButton(android.R.string.no, null).show();
    }
}