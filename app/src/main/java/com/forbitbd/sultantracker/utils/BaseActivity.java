package com.forbitbd.sultantracker.utils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class BaseActivity extends AppCompatActivity {


//
//    public void setLanguage(Activity activity, String language){
//        Locale locale = new Locale(language);
//        Resources resources = activity.getResources();
//        Configuration configuration = resources.getConfiguration();
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
//            configuration.setLocale(locale);
//        }
//        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
//
//    }

    public void setLocale(String language){
       Locale locale = new Locale(language);
       Locale.setDefault(locale);
       Configuration configuration = new Configuration();
       getBaseContext().getResources().updateConfiguration(configuration,getBaseContext().getResources().getDisplayMetrics());
       SharedPreferences.Editor editor = getSharedPreferences("setting",MODE_PRIVATE).edit();
       editor.putString("mylang", language);
       editor.apply();
    }

    public void loadLocale(){
        SharedPreferences preferences = getSharedPreferences("setting", Activity.MODE_PRIVATE);
        String language = preferences.getString("mylang", "");
        setLocale(language);
    }
}
