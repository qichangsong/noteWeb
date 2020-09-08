package com.cloud.demo.entity;

public class AreasEntity {
    private Integer aid;
    private String  atitle;
    private Integer pid;

    public int getAid() {
        return aid;
    }

    public String getAtitle() {
        return atitle;
    }

    public int getPid() {
        return pid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Areas{" +
                "aid=" + aid +
                ", atitle='" + atitle + '\'' +
                ", pid=" + pid +
                '}';
    }

    public AreasEntity() {
    }
}
