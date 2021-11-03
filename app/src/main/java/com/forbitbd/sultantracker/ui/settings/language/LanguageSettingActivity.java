package com.forbitbd.sultantracker.ui.settings.language;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.forbitbd.sultantracker.DashboardActivity;
import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.utils.BaseActivity;

public class LanguageSettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    private Switch sw1, sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_setting);

        loadLocale();

        sw1 = findViewById(R.id.english);
        sw2 = findViewById(R.id.bangla);

        sw1.setOnCheckedChangeListener(this);
        sw2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (sw1.isChecked()) {
            sw2.setChecked(false);
//            setLanguage(this, "en");
            setLocale("en");
            finish();
            RestartApp();
        } else {
            sw2.setChecked(true);
        }
        if (sw2.isChecked()) {
            sw1.setChecked(false);
            setLocale("bn");
//            setLanguage(this, "bn");
            finish();
            RestartApp();
        } else {
            sw1.setChecked(true);
        }
    }

    private void RestartApp() {
        startActivity(new Intent(this, DashboardActivity.class));
    }
}

