package com.forbitbd.sultantracker.models;

import java.io.Serializable;
import java.util.Date;

public class Alert implements Serializable {

    private String _id;
    private String title;
    private String message;
    private Date date;

    public Alert(String _id, String title, String message, Date date) {
        this._id = _id;
        this.title = title;
        this.message = message;
        this.date = date;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
