package com.forbitbd.sultantracker.ui.login;

public class LoginPresenter implements LoginContract.Presenter{

    private LoginContract.View mView;

    public LoginPresenter(LoginContract.View mView) {
        this.mView = mView;
    }
}
