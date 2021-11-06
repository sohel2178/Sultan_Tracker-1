package com.forbitbd.sultantracker.ui.settings.language;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.launcher.LauncherActivity;
import com.forbitbd.sultantracker.utils.AppPreference;
import com.forbitbd.sultantracker.utils.BaseActivity;

public class LanguageSettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {

    private Switch sw1, sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_setting);

        sw1 = findViewById(R.id.english);
        sw2 = findViewById(R.id.bangla);

        if(AppPreference.getInstance(this).getLanguage().equals("EN")){
            sw1.setChecked(true);
        }else {
            sw2.setChecked(true);
        }

        sw1.setOnCheckedChangeListener(this);
        sw2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(buttonView==sw1){
            if(isChecked){
                AppPreference.getInstance(getApplicationContext()).setLanguage("EN");
                setLocale("en");
                RestartApp();
            }
        }else {
            if(isChecked){
                AppPreference.getInstance(getApplicationContext()).setLanguage("BN");
                setLocale("bn");
                RestartApp();
            }
        }
    }

    private void RestartApp() {
        startActivity(new Intent(this, LauncherActivity.class));
    }
}

