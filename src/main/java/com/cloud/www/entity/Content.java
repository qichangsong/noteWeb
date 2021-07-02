package com.cloud.www.entity;

import java.util.Date;

public class Content {
    Integer id;
    Integer type;
    Integer system;
    String detail;
    String createtime;
    String modifitime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifitime() {
        return modifitime;
    }

    public void setModifitime(String modifitime) {
        this.modifitime = modifitime;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", type=" + type +
                ", system=" + system +
                ", detail=" + detail +
                ", createtime=" + createtime +
                ", modifitime=" + modifitime +
                '}';
    }
}
