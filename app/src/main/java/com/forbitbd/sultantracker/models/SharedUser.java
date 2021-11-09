package com.forbitbd.sultantracker.models;

import java.io.Serializable;

public class SharedUser implements Serializable {

    private String _id;
    private String device;
    private User user;

    public SharedUser() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
