package com.forbitbd.sultantracker.ui.listview;

import com.forbitbd.sultantracker.models.Device;

public interface ListViewClickListener {


    void OnMapClick(Device device);

    void OnCommandClick(Device device);

    void OnDetailClick(Device device);

    void OnMoreClick(Device device);
}
