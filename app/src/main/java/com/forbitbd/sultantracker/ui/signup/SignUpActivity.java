package com.forbitbd.sultantracker.ui.signup;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.main.SliderAdapter;
import com.forbitbd.sultantracker.utils.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SignUpActivity extends BaseActivity implements SignUpContract.View {

    ViewPager viewPager;
    int images[] = {R.drawable.car,R.drawable.scooty,R.drawable.cng};
    int currentPageCounter = 0;
    private SignUpPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mPresenter = new SignUpPresenter(this);

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
        }, 2000, 1000);
    }
}