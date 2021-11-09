package com.forbitbd.sultantracker.models;

import java.io.Serializable;
import java.util.List;

public class RawFData implements Serializable {
    private static RawFData instance;
    private List<RData> data = null;


    protected RawFData() {

    }

    public static RawFData getInstance() {
        if (instance == null) {
            instance = new RawFData();
        }
        return instance;
    }


    public List<RData> getData() { return data; }
    public void setData(List<RData> data) { this.data = data; }
}
