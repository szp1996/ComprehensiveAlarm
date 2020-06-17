package com.comprehensiveAlarm.po;

import java.util.Date;

public class ETaskResult {
    private Integer id;

    private String DEVICEID;

    private String DEVICENAME;

    private Date DIAGTIME;

    private String VQDSTATE;

    private String ONLINESTATE;

    private Integer ISMODIFIED;

    private String TASKID;

    private Integer TASKNO;

    private Integer CURREPEATNUM;

    private String CIVILCODE;

    private Integer SIPDELAY;

    private Integer STREAMDELAY;

    private Integer IFRAMEDELAY;

    private String PLATFORMID;

    private String CAPPIC;

    private String ERRCODE;

    private String VQDRES;

    private String PRESERVING1;

    private String PRESERVING2;

    private String ALARM_CODE;

    private Integer OFFLINE_TIME;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDIAGTIME() {
        return DIAGTIME;
    }

    public void setDIAGTIME(Date DIAGTIME) {
        this.DIAGTIME = DIAGTIME;
    }

    public String getVQDSTATE() {
        return VQDSTATE;
    }

    public void setVQDSTATE(String VQDSTATE) {
        this.VQDSTATE = VQDSTATE == null ? null : VQDSTATE.trim();
    }

    public String getONLINESTATE() {
        return ONLINESTATE;
    }

    public void setONLINESTATE(String ONLINESTATE) {
        this.ONLINESTATE = ONLINESTATE == null ? null : ONLINESTATE.trim();
    }

    public Integer getISMODIFIED() {
        return ISMODIFIED;
    }

    public void setISMODIFIED(Integer ISMODIFIED) {
        this.ISMODIFIED = ISMODIFIED;
    }

    public String getTASKID() {
        return TASKID;
    }

    public void setTASKID(String TASKID) {
        this.TASKID = TASKID == null ? null : TASKID.trim();
    }

    public Integer getTASKNO() {
        return TASKNO;
    }

    public void setTASKNO(Integer TASKNO) {
        this.TASKNO = TASKNO;
    }

    public Integer getCURREPEATNUM() {
        return CURREPEATNUM;
    }

    public void setCURREPEATNUM(Integer CURREPEATNUM) {
        this.CURREPEATNUM = CURREPEATNUM;
    }

    public String getCIVILCODE() {
        return CIVILCODE;
    }

    public void setCIVILCODE(String CIVILCODE) {
        this.CIVILCODE = CIVILCODE == null ? null : CIVILCODE.trim();
    }

    public Integer getSIPDELAY() {
        return SIPDELAY;
    }

    public void setSIPDELAY(Integer SIPDELAY) {
        this.SIPDELAY = SIPDELAY;
    }

    public Integer getSTREAMDELAY() {
        return STREAMDELAY;
    }

    public void setSTREAMDELAY(Integer STREAMDELAY) {
        this.STREAMDELAY = STREAMDELAY;
    }

    public Integer getIFRAMEDELAY() {
        return IFRAMEDELAY;
    }

    public void setIFRAMEDELAY(Integer IFRAMEDELAY) {
        this.IFRAMEDELAY = IFRAMEDELAY;
    }

    public String getPLATFORMID() {
        return PLATFORMID;
    }

    public void setPLATFORMID(String PLATFORMID) {
        this.PLATFORMID = PLATFORMID == null ? null : PLATFORMID.trim();
    }

    public String getCAPPIC() {
        return CAPPIC;
    }

    public void setCAPPIC(String CAPPIC) {
        this.CAPPIC = CAPPIC == null ? null : CAPPIC.trim();
    }

    public String getERRCODE() {
        return ERRCODE;
    }

    public void setERRCODE(String ERRCODE) {
        this.ERRCODE = ERRCODE == null ? null : ERRCODE.trim();
    }

    public String getVQDRES() {
        return VQDRES;
    }

    public void setVQDRES(String VQDRES) {
        this.VQDRES = VQDRES == null ? null : VQDRES.trim();
    }

    public String getPRESERVING1() {
        return PRESERVING1;
    }

    public void setPRESERVING1(String PRESERVING1) {
        this.PRESERVING1 = PRESERVING1 == null ? null : PRESERVING1.trim();
    }

    public String getPRESERVING2() {
        return PRESERVING2;
    }

    public void setPRESERVING2(String PRESERVING2) {
        this.PRESERVING2 = PRESERVING2 == null ? null : PRESERVING2.trim();
    }

    public String getALARM_CODE() {
        return ALARM_CODE;
    }

    public void setALARM_CODE(String ALARM_CODE) {
        this.ALARM_CODE = ALARM_CODE == null ? null : ALARM_CODE.trim();
    }

    public Integer getOFFLINE_TIME() {
        return OFFLINE_TIME;
    }

    public void setOFFLINE_TIME(Integer OFFLINE_TIME) {
        this.OFFLINE_TIME = OFFLINE_TIME;
    }
}