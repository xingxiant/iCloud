package com.xxt.po;

import java.util.Date;

public class File {
    private Integer id;

    private Integer user;

    private String filename;

    private String filesize;

    private Date createtime;

    private Integer canshare;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize == null ? null : filesize.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCanshare() {
        return canshare;
    }

    public void setCanshare(Integer canshare) {
        this.canshare = canshare;
    }
}