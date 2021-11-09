package com.forbitbd.sultantracker.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VehicleStatus implements Serializable {

    private long startTime;
    private long endTime;

    private String status;
    private List<Location> locationList;


    public VehicleStatus() {
        this.locationList = new ArrayList<>();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addLocation(Location location){
        this.locationList.add(location);
    }

    public List<Location> getLocationList(){
        return this.locationList;
    }

    public void reset(){
        this.locationList=new ArrayList<>();
        if(this.status.equals("OFF")){
            this.setStatus("ON");
        }else{
            this.setStatus("OFF");
        }
    }
}
