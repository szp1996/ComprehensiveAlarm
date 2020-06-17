package com.comprehensiveAlarm.po;

import java.util.Date;

public class DOutdeviceinfo {
    private String ID;

    private String DEVICEID;

    private String DEVICENAME;

    private String MANUFACTURER;

    private String MODEL;

    private String OWNER;

    private String PASSWORD;

    private String CIVILCODE;

    private String BLOCK;

    private Double LONGITUDE;

    private Double LATITUDE;

    private String ADDRESS;

    private String PARENTID;

    private Integer SAFETYWAY;

    private Integer REGISTERWAY;

    private String CERTNUM;

    private Integer CERTIFIABLE;

    private Integer ERRCODE;

    private Date ENDTIME;

    private Integer SECRECY;

    private String DEVICETYPE;

    private String DESCRIPTION;

    private String STATUS;

    private String SOURCECENTER;

    private String ISWITHCHILD;

    private String CAMERATYPE;

    private String PTZTYPE;

    private String POSITIONTYPE;

    private String ROOMTYPE;

    private String USETYPE;

    private String SUPPLYLIGHTTYPE;

    private String DIRECTIONTYPE;

    private String IP;

    private String STREAMENCRYPT;

    private String ISCOLLECTED;

    private String OFFLINE_TIME;

    private byte[] CERTIFICATE;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getDEVICEID() {
        return DEVICEID;
    }

    public void setDEVICEID(String DEVICEID) {
        this.DEVICEID = DEVICEID == null ? null : DEVICEID.trim();
    }

    public String getDEVICENAME() {
        return DEVICENAME;
    }

    public void setDEVICENAME(String DEVICENAME) {
        this.DEVICENAME = DEVICENAME == null ? null : DEVICENAME.trim();
    }

    public String getMANUFACTURER() {
        return MANUFACTURER;
    }

    public void setMANUFACTURER(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER == null ? null : MANUFACTURER.trim();
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL == null ? null : MODEL.trim();
    }

    public String getOWNER() {
        return OWNER;
    }

    public void setOWNER(String OWNER) {
        this.OWNER = OWNER == null ? null : OWNER.trim();
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD == null ? null : PASSWORD.trim();
    }

    public String getCIVILCODE() {
        return CIVILCODE;
    }

    public void setCIVILCODE(String CIVILCODE) {
        this.CIVILCODE = CIVILCODE == null ? null : CIVILCODE.trim();
    }

    public String getBLOCK() {
        return BLOCK;
    }

    public void setBLOCK(String BLOCK) {
        this.BLOCK = BLOCK == null ? null : BLOCK.trim();
    }

    public Double getLONGITUDE() {
        return LONGITUDE;
    }

    public void setLONGITUDE(Double LONGITUDE) {
        this.LONGITUDE = LONGITUDE;
    }

    public Double getLATITUDE() {
        return LATITUDE;
    }

    public void setLATITUDE(Double LATITUDE) {
        this.LATITUDE = LATITUDE;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS == null ? null : ADDRESS.trim();
    }

    public String getPARENTID() {
        return PARENTID;
    }

    public void setPARENTID(String PARENTID) {
        this.PARENTID = PARENTID == null ? null : PARENTID.trim();
    }

    public Integer getSAFETYWAY() {
        return SAFETYWAY;
    }

    public void setSAFETYWAY(Integer SAFETYWAY) {
        this.SAFETYWAY = SAFETYWAY;
    }

    public Integer getREGISTERWAY() {
        return REGISTERWAY;
    }

    public void setREGISTERWAY(Integer REGISTERWAY) {
        this.REGISTERWAY = REGISTERWAY;
    }

    public String getCERTNUM() {
        return CERTNUM;
    }

    public void setCERTNUM(String CERTNUM) {
        this.CERTNUM = CERTNUM == null ? null : CERTNUM.trim();
    }

    public Integer getCERTIFIABLE() {
        return CERTIFIABLE;
    }

    public void setCERTIFIABLE(Integer CERTIFIABLE) {
        this.CERTIFIABLE = CERTIFIABLE;
    }

    public Integer getERRCODE() {
        return ERRCODE;
    }

    public void setERRCODE(Integer ERRCODE) {
        this.ERRCODE = ERRCODE;
    }

    public Date getENDTIME() {
        return ENDTIME;
    }

    public void setENDTIME(Date ENDTIME) {
        this.ENDTIME = ENDTIME;
    }

    public Integer getSECRECY() {
        return SECRECY;
    }

    public void setSECRECY(Integer SECRECY) {
        this.SECRECY = SECRECY;
    }

    public String getDEVICETYPE() {
        return DEVICETYPE;
    }

    public void setDEVICETYPE(String DEVICETYPE) {
        this.DEVICETYPE = DEVICETYPE == null ? null : DEVICETYPE.trim();
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION == null ? null : DESCRIPTION.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getSOURCECENTER() {
        return SOURCECENTER;
    }

    public void setSOURCECENTER(String SOURCECENTER) {
        this.SOURCECENTER = SOURCECENTER == null ? null : SOURCECENTER.trim();
    }

    public String getISWITHCHILD() {
        return ISWITHCHILD;
    }

    public void setISWITHCHILD(String ISWITHCHILD) {
        this.ISWITHCHILD = ISWITHCHILD == null ? null : ISWITHCHILD.trim();
    }

    public String getCAMERATYPE() {
        return CAMERATYPE;
    }

    public void setCAMERATYPE(String CAMERATYPE) {
        this.CAMERATYPE = CAMERATYPE == null ? null : CAMERATYPE.trim();
    }

    public String getPTZTYPE() {
        return PTZTYPE;
    }

    public void setPTZTYPE(String PTZTYPE) {
        this.PTZTYPE = PTZTYPE == null ? null : PTZTYPE.trim();
    }

    public String getPOSITIONTYPE() {
        return POSITIONTYPE;
    }

    public void setPOSITIONTYPE(String POSITIONTYPE) {
        this.POSITIONTYPE = POSITIONTYPE == null ? null : POSITIONTYPE.trim();
    }

    public String getROOMTYPE() {
        return ROOMTYPE;
    }

    public void setROOMTYPE(String ROOMTYPE) {
        this.ROOMTYPE = ROOMTYPE == null ? null : ROOMTYPE.trim();
    }

    public String getUSETYPE() {
        return USETYPE;
    }

    public void setUSETYPE(String USETYPE) {
        this.USETYPE = USETYPE == null ? null : USETYPE.trim();
    }

    public String getSUPPLYLIGHTTYPE() {
        return SUPPLYLIGHTTYPE;
    }

    public void setSUPPLYLIGHTTYPE(String SUPPLYLIGHTTYPE) {
        this.SUPPLYLIGHTTYPE = SUPPLYLIGHTTYPE == null ? null : SUPPLYLIGHTTYPE.trim();
    }

    public String getDIRECTIONTYPE() {
        return DIRECTIONTYPE;
    }

    public void setDIRECTIONTYPE(String DIRECTIONTYPE) {
        this.DIRECTIONTYPE = DIRECTIONTYPE == null ? null : DIRECTIONTYPE.trim();
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP == null ? null : IP.trim();
    }

    public String getSTREAMENCRYPT() {
        return STREAMENCRYPT;
    }

    public void setSTREAMENCRYPT(String STREAMENCRYPT) {
        this.STREAMENCRYPT = STREAMENCRYPT == null ? null : STREAMENCRYPT.trim();
    }

    public String getISCOLLECTED() {
        return ISCOLLECTED;
    }

    public void setISCOLLECTED(String ISCOLLECTED) {
        this.ISCOLLECTED = ISCOLLECTED == null ? null : ISCOLLECTED.trim();
    }

    public String getOFFLINE_TIME() {
        return OFFLINE_TIME;
    }

    public void setOFFLINE_TIME(String OFFLINE_TIME) {
        this.OFFLINE_TIME = OFFLINE_TIME == null ? null : OFFLINE_TIME.trim();
    }

    public byte[] getCERTIFICATE() {
        return CERTIFICATE;
    }

    public void setCERTIFICATE(byte[] CERTIFICATE) {
        this.CERTIFICATE = CERTIFICATE;
    }
}