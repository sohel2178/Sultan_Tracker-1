package com.forbitbd.sultantracker.models;

import java.io.Serializable;

public class Boundary implements Serializable {

    private String _id;
    private String boundary_name;
    private String device_id;
    private double center_x=0;
    private double center_y=0;
    private double radius;
    private boolean is_inside;

    public Boundary() {
    }

    public String getBoundary_name() {
        return boundary_name;
    }

    public void setBoundary_name(String boundary_name) {
        this.boundary_name = boundary_name;
    }

    public double getCenter_x() {
        return center_x;
    }

    public void setCenter_x(double center_x) {
        this.center_x = center_x;
    }

    public double getCenter_y() {
        return center_y;
    }

    public void setCenter_y(double center_y) {
        this.center_y = center_y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public boolean isIs_inside() {
        return is_inside;
    }

    public void setIs_inside(boolean is_inside) {
        this.is_inside = is_inside;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
