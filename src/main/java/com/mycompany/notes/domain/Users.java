package com.mycompany.notes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Users {
    @Id
    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Date createTime;

    @Column
    private Date updateTime;

    private Users(){}

    public Users(String username, String password, Date createTime, Date updateTime){
        this.username = username;
        this.password = password;
        this.updateTime = updateTime;
        this.createTime = createTime;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
