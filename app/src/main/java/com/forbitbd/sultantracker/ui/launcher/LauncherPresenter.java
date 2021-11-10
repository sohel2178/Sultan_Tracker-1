package com.forbitbd.sultantracker.ui.launcher;

public class LauncherPresenter implements LauncherContract.Presenter {


    private LauncherContract.View mView;

    public LauncherPresenter(LauncherContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void getPermissionForLocation() {
        mView.getPermissionForLocation();
    }
}
