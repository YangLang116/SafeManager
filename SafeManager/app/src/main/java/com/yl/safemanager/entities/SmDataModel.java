package com.yl.safemanager.entities;

import cn.bmob.v3.BmobObject;

/**
 * Created by YL on 2017/3/12.
 */

public class SmDataModel extends BmobObject{

    private String useid;
    private String savetime;
    private String title;
    private String content;
    private int position;

    public SmDataModel() {
    }

    public SmDataModel(String useid, String savetime, String title, String content) {
        setTableName(SmDataModel.class.getSimpleName());
        this.useid = useid;
        this.savetime = savetime;
        this.title = title;
        this.content = content;
    }

    public String getUseid() {
        return useid;
    }

    public void setUseid(String useid) {
        this.useid = useid;
    }

    public String getSavetime() {
        return savetime;
    }

    public void setSavetime(String savetime) {
        this.savetime = savetime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "SmDataModel{" +
                "useid='" + useid + '\'' +
                ", savetime='" + savetime + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
