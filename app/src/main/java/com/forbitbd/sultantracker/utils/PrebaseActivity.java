package com.forbitbd.sultantracker.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;

import com.forbitbd.sultantracker.R;

public class PrebaseActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private FragmentManager manager;
//    private NavigationDrawer drawerFragment;


    public ProgressDialog mProgressDialog;

    private TextView tvTitle;
    private Toolbar toolbar;


    //private UserLocalStore userLocalStore;








    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    public void setupToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

    }

    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this,R.style.MyTheme);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setProgressStyle(android.R.style.Widget_ProgressBar_Large_Inverse);
            mProgressDialog.setIndeterminate(true);
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }





//    public void openCropImageActivity(boolean square){
//
//        if(square){
//            CropImage.activity()
//                    .setGuidelines(CropImageView.Guidelines.ON)
//                    .setAspectRatio(1,1)
//                    .start(this);
//        }else{
//            CropImage.activity()
//                    .setGuidelines(CropImageView.Guidelines.ON)
//                    .setAspectRatio(4,3)
//                    .start(this);
//        }


//    }

    /*public void openImagePicker(){
        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.OFF)
                .start(this);
    }*/



    public boolean isOnline() {
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return (networkInfo != null && networkInfo.isConnected());
    }



    public int getScreenWidth(){

        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        //int height = metrics.heightPixels;
        return width;
    }

    public int getScreenHeight(){

        WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int height = metrics.heightPixels;
        //int height = metrics.heightPixels;

        return height;
    }

    public void hideSoftKeyboard() {
        if(getCurrentFocus()!=null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
        }
    }

    public void showSoftKeyboard(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, 0);
    }


    public void hideKey(View view){
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    @Override
    public void onStop() {
        super.onStop();
        hideProgressDialog();
    }


//    public void showDialog(String content){
//        InfoDialog infoDialog = InfoDialog.getInstance();
//
//    }
//
//    public void showSuccessDialog(String message) {
//        InfoDialog infoDialog =InfoDialog.getInstance();
//        Bundle bundle = new Bundle();
//        bundle.putString(Constant.CONTENT,message);
//        infoDialog.setArguments(bundle);
//        infoDialog.show(getSupportFragmentManager(),"HHHH");
//    }
//
//    public void showErrorDialog(String message) {
//        InfoDialog infoDialog =InfoDialog.getInstance();
//        Bundle bundle = new Bundle();
//        bundle.putString(Constant.CONTENT,message);
//        bundle.putBoolean(Constant.ERROR,true);
//        infoDialog.setArguments(bundle);
//        infoDialog.show(getSupportFragmentManager(),"HHHH");
//    }
}
