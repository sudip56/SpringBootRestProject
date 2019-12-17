package com.haud.svalinn.ss7.protocol.service.dto;

import java.util.Date;

public class BaseDTO {

    private int deleted = 0;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;


    public int getDeleted() {
        return deleted;
    }

    public BaseDTO setDeleted(int deleted) {
        this.deleted = deleted;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public BaseDTO setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public BaseDTO setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public BaseDTO setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public BaseDTO setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }
}
