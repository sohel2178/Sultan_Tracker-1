package com.forbitbd.sultantracker.ui.listview;

import com.forbitbd.sultantracker.models.Device;

public interface ListViewClickListener {

    void OnMoreClick(int adapterPosition);

    void OnDetailClick(int adapterPosition);

    void OnCommandClick(int adapterPosition);

    void OnMapClick(int adapterPosition);
}
