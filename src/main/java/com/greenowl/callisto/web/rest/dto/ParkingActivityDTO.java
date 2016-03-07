package com.greenowl.callisto.web.rest.dto;

import com.greenowl.callisto.domain.ParkingActivity;
import com.greenowl.callisto.domain.User;
import org.joda.time.DateTimeZone;

public class ParkingActivityDTO {

    private Long id;

    private Long lotId;

    private String userEmail;

    private String userPhoneNumber;

    private String userPlateNumber;

    private String type;

    private Long saleId;

    private Long entryDateTime;

    private Long exitDateTime;

    private String parkingStatus;

    private String exceptionFlag;

    private Long createdDate;

    private String deviceInfo;

    public ParkingActivityDTO() {

    }

    public ParkingActivityDTO(ParkingActivity activity, User user) {
        this.id = activity.getId();
        this.lotId = activity.getId();
        this.userEmail = user.getLogin();
        this.userPhoneNumber = user.getMobileNumber();
        this.userPlateNumber = user.getLicensePlate();
        this.type = activity.getType();
        this.saleId = activity.getSaleId();
        this.deviceInfo = activity.getDeviceInfo();
        if (activity.getEntryDatetime() != null) {
            this.entryDateTime = activity.getEntryDatetime().withZone(DateTimeZone.UTC).getMillis();
        }
        if (activity.getExitDatetime() != null) {
            this.exitDateTime = activity.getExitDatetime().withZone(DateTimeZone.UTC).getMillis();
        }
        this.parkingStatus = activity.getParkingStatus();
        this.exceptionFlag = activity.getExceptionFlag();
        if (activity.getCreatedDate() != null) {
            this.createdDate = activity.getCreatedDate().withZone(DateTimeZone.UTC).getMillis();
        }
    }

    public ParkingActivityDTO(Long id, Long lotId, String userEmail, String userPhoneNumber, String userPlateNumber, String type,
                              Long saleId, Long entryDateTime, Long exitDateTime, String parkingStatus, String exceptionFlag, Long createdDate) {
        this.id = id;
        this.lotId = lotId;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
        this.userPlateNumber = userPlateNumber;
        this.type = type;
        this.saleId = saleId;
        this.entryDateTime = entryDateTime;
        this.exitDateTime = exitDateTime;
        this.parkingStatus = parkingStatus;
        this.exceptionFlag = exceptionFlag;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLotId() {
        return lotId;
    }

    public void setLotId(Long lotId) {
        this.lotId = lotId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPlateNumber() {
        return userPlateNumber;
    }

    public void setUserPlateNumber(String userPlateNumber) {
        this.userPlateNumber = userPlateNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSaleId() {
        return saleId;
    }

    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }

    public Long getEntryDateTime() {
        return entryDateTime;
    }

    public void setEntryDateTime(Long entryDateTime) {
        this.entryDateTime = entryDateTime;
    }

    public Long getExitDateTime() {
        return exitDateTime;
    }

    public void setExitDateTime(Long exitDateTime) {
        this.exitDateTime = exitDateTime;
    }

    public String getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(String parkingStatus) {
        this.parkingStatus = parkingStatus;
    }

    public String getExceptionFlag() {
        return exceptionFlag;
    }

    public void setExceptionFlag(String exceptionFlag) {
        this.exceptionFlag = exceptionFlag;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    @Override
    public String toString() {
        return "ParkingActivityDTO{" +
                "createdDate=" + createdDate +
                ", id=" + id +
                ", lotId=" + lotId +
                ", userEmail='" + userEmail + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userPlateNumber='" + userPlateNumber + '\'' +
                ", type='" + type + '\'' +
                ", saleId=" + saleId +
                ", entryDateTime=" + entryDateTime +
                ", exitDateTime=" + exitDateTime +
                ", parkingStatus='" + parkingStatus + '\'' +
                ", exceptionFlag='" + exceptionFlag + '\'' +
                '}';
    }
}
