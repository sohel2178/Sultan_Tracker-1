package com.forbitbd.sultantracker.ui.signup;

public class SignUpPresenter implements SignUpContract.Presenter{

    private SignUpContract.View mView;

    public SignUpPresenter(SignUpContract.View mView) {
        this.mView = mView;
    }
}
