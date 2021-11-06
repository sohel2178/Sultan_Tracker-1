package com.forbitbd.sultantracker.ui.listview;

public class ListViewPresenter implements ListViewContract.Presenter {

    private ListViewContract.View mView;

    public ListViewPresenter(ListViewContract.View mView) {
        this.mView = mView;
    }
}
