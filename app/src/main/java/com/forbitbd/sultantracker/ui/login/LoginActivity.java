package com.forbitbd.sultantracker.ui.login;

import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.forbitbd.sultantracker.R;
import com.forbitbd.sultantracker.ui.main.MainActivity;
import com.forbitbd.sultantracker.ui.signup.SignUpActivity;
import com.forbitbd.sultantracker.ui.main.SliderAdapter;
import com.forbitbd.sultantracker.utils.BaseActivity;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.button.MaterialButton;

import java.util.Timer;
import java.util.TimerTask;

public class LoginActivity extends BaseActivity implements LoginContract.View, View.OnClickListener {

    private ViewPager viewPager;
    int images[] = {R.drawable.car,R.drawable.scooty,R.drawable.cng};
    int currentPageCounter = 0;

    private SignInButton btngoogle;
    private MaterialButton btnlogin;
    private TextView btnsignup, btnforgot;
    private LoginPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mPresenter = new LoginPresenter(this);
        btnlogin = findViewById(R.id.login);
        btngoogle = findViewById(R.id.google);
        btnsignup = findViewById(R.id.signup);
        btnforgot = findViewById(R.id.forgot_password);


        btnlogin.setOnClickListener(this);
        btngoogle.setOnClickListener(this);
        btnsignup.setOnClickListener(this);
        btnforgot.setOnClickListener(this);

        viewPager = findViewById(R.id.slideview);
        viewPager.setAdapter(new SliderAdapter(images, LoginActivity.this));
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
        }, 3000, 3000);
    }

    @Override
    public void onBackPressed() {
        finishAffinity();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.login){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        }else if(id == R.id.google){

        }else if(id == R.id.signup){
            startActivity(new Intent(LoginActivity.this,SignUpActivity.class));
        }else if (id == R.id.forgot_password){

        }
    }
}