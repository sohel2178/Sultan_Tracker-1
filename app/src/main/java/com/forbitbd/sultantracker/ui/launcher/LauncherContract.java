package com.forbitbd.sultantracker.ui.launcher;

public interface LauncherContract {

    interface Presenter{

        void getPermissionForLocation();

    }

    interface View{
        void getPermissionForLocation();
    }
}
