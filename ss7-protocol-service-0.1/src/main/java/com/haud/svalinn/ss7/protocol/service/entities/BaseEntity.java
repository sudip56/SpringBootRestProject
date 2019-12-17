package com.haud.svalinn.ss7.protocol.service.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private String createdBy;

    @Column(updatable = false)
    private Date createdDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;

    @Column(name = "deleted", nullable = false, columnDefinition = "TINYINT(1) default 0")
    private int deleted;


    public String getCreatedBy() {
        return createdBy;
    }

    public BaseEntity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public BaseEntity setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public BaseEntity setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public BaseEntity setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public int getDeleted() {
        return deleted;
    }

    public BaseEntity setDeleted(int deleted) {
        this.deleted = deleted;
        return this;
    }

    @PrePersist
    public void onCreate() {

        this.createdDate = new Date();
    }

    @PreUpdate
    public void onUpdate() {

        this.lastModifiedDate = new Date();
    }

}