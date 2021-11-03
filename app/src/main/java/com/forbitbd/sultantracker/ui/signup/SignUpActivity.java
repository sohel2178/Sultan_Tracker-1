package com.forbitbd.sultantracker.ui.signup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.main.SliderAdapter;

import java.util.Timer;
import java.util.TimerTask;

public class SignUpActivity extends AppCompatActivity {

    ViewPager viewPager;
    int images[] = {R.drawable.car,R.drawable.scooty,R.drawable.cng};
    int currentPageCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        viewPager = findViewById(R.id.slideview);
        viewPager.setAdapter(new SliderAdapter(images, SignUpActivity.this));
        final Handler handler = new Handler();
        final Runnable update = new Runnable() {
            @Override
            public void run() {
                if (currentPageCounter == images.length) {
                    currentPageCounter = 0;
                }
                viewPager.setCurrentItem(currentPageCounter++, true);
            }
        };

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        }, 2000, 2000);
    }
}