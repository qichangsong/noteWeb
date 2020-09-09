package com.cloud.www.entity;

public class DefectRecord {
    Integer id;
    String  ownSystem;
    String  description;
    Integer isRepair;
    String  createTime;

    public Integer getId() {
        return id;
    }

    public String getOwnSystem() {
        return ownSystem;
    }

    public String getDescription() {
        return description;
    }

    public Integer getIsRepair() {
        return isRepair;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOwnSystem(String ownSystem) {
        this.ownSystem = ownSystem;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsRepair(Integer isRepair) {
        this.isRepair = isRepair;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DefectRecord{" +
                "id=" + id +
                ", ownSystem='" + ownSystem + '\'' +
                ", description='" + description + '\'' +
                ", isRepair=" + isRepair +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
