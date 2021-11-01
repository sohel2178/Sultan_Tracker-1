package com.forbitbd.sultantracker.ui.home;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String regNo, vehicleType, mileage, status, location, drivername, driverphone;

    public Vehicle(String regNo, String vehicleType, String mileage, String status, String location, String drivername, String driverphone) {
        this.regNo = regNo;
        this.vehicleType = vehicleType;
        this.mileage = mileage;
        this.status = status;
        this.location = location;
        this.drivername = drivername;
        this.driverphone = driverphone;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone;
    }
}
