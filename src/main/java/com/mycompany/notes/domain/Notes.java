package com.mycompany.notes.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Notes {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNote;

    @Column
    private String username;

    @Column
    private String title;

    @Column
    private String note;

    @Column
    private Date createTime;

    @Column
    private Date updateTime;

    private Notes(){}

    public Notes(Long idNote, String username, String title, String note,Date createTime, Date updateTime){
        this.idNote = idNote;
        this.username = username;
        this.title = title;
        this.note = note;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public void setIdNote(Long idNote) {
        this.idNote = idNote;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getIdNote() {
        return idNote;
    }

    public String getUsername() {
        return username;
    }

    public String getTitle() {
        return title;
    }

    public String getNote() {
        return note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
