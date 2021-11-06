package com.forbitbd.sultantracker.ui.alerts;

public class AlertsPresenter implements AlertsContract.Presenter{

    private AlertsContract.View mView;

    public AlertsPresenter(AlertsContract.View mView) {
        this.mView = mView;
    }
}
