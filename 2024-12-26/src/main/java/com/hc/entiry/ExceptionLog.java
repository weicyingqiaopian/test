package com.hc.entiry;

import java.util.Date;

public class ExceptionLog {
    private Long id;

    private Long equipmentId;

    private Date exceptionTime;

    private Byte exceptionStatus;

    private Date fixTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Date getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(Date exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

    public Byte getExceptionStatus() {
        return exceptionStatus;
    }

    public void setExceptionStatus(Byte exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
    }

    public Date getFixTime() {
        return fixTime;
    }

    public void setFixTime(Date fixTime) {
        this.fixTime = fixTime;
    }
}