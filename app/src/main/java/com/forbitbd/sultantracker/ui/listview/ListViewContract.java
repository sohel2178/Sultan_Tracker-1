package com.forbitbd.sultantracker.ui.listview;

import com.forbitbd.sultantracker.models.Device;

public interface ListViewContract {

    interface Presenter{

    }

    interface View{
        void OnMoreClick(Device device);
    }
}
