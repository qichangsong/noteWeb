package com.cloud.www.entity;

public class NoteContent {
    Integer id;
    Integer type;
    String content;
    Integer isfix;

    public Integer getId() {
        return id;
    }

    public Integer getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public Integer getIsfix() {
        return isfix;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIsfix(Integer isfix) {
        this.isfix = isfix;
    }

    @Override
    public String toString() {
        return "NoteContent{" +
                "id=" + id +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", isfix=" + isfix +
                '}';
    }
}
