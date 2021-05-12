package com.charan.springboot.CustomerLog.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logmodel")
public class Logmodel {

    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;

    @Column(name="logtype")
    private String logtype;
    @Column(name="date")
    private String date;
    @Column(name="time")
    private String time;
    public Logmodel() {
    }
    public Logmodel(String name, String logtype, String date, String time) {
        this.name = name;
        this.logtype = logtype;
        this.date = date;
        this.time = time;
    }
    @Override
    public String toString() {
        return "Logmodel [id=" + id + ", name=" + name + ", logtype=" + logtype + ", date=" + date + ", time=" + time
                + "]";
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLogtype() {
        return logtype;
    }
    public void setLogtype(String logtype) {
        this.logtype = logtype;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }


}
