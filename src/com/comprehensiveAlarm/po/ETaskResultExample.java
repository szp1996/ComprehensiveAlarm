package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ETaskResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ETaskResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDIsNull() {
            addCriterion("DEVICEID is null");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDIsNotNull() {
            addCriterion("DEVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDEqualTo(String value) {
            addCriterion("DEVICEID =", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDNotEqualTo(String value) {
            addCriterion("DEVICEID <>", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDGreaterThan(String value) {
            addCriterion("DEVICEID >", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICEID >=", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDLessThan(String value) {
            addCriterion("DEVICEID <", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDLessThanOrEqualTo(String value) {
            addCriterion("DEVICEID <=", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDLike(String value) {
            addCriterion("DEVICEID like", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDNotLike(String value) {
            addCriterion("DEVICEID not like", value, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDIn(List<String> values) {
            addCriterion("DEVICEID in", values, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDNotIn(List<String> values) {
            addCriterion("DEVICEID not in", values, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDBetween(String value1, String value2) {
            addCriterion("DEVICEID between", value1, value2, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICEIDNotBetween(String value1, String value2) {
            addCriterion("DEVICEID not between", value1, value2, "DEVICEID");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEIsNull() {
            addCriterion("DEVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEIsNotNull() {
            addCriterion("DEVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEEqualTo(String value) {
            addCriterion("DEVICENAME =", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMENotEqualTo(String value) {
            addCriterion("DEVICENAME <>", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEGreaterThan(String value) {
            addCriterion("DEVICENAME >", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENAME >=", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMELessThan(String value) {
            addCriterion("DEVICENAME <", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMELessThanOrEqualTo(String value) {
            addCriterion("DEVICENAME <=", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMELike(String value) {
            addCriterion("DEVICENAME like", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMENotLike(String value) {
            addCriterion("DEVICENAME not like", value, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEIn(List<String> values) {
            addCriterion("DEVICENAME in", values, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMENotIn(List<String> values) {
            addCriterion("DEVICENAME not in", values, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMEBetween(String value1, String value2) {
            addCriterion("DEVICENAME between", value1, value2, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDEVICENAMENotBetween(String value1, String value2) {
            addCriterion("DEVICENAME not between", value1, value2, "DEVICENAME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEIsNull() {
            addCriterion("DIAGTIME is null");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEIsNotNull() {
            addCriterion("DIAGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEEqualTo(Date value) {
            addCriterion("DIAGTIME =", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMENotEqualTo(Date value) {
            addCriterion("DIAGTIME <>", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEGreaterThan(Date value) {
            addCriterion("DIAGTIME >", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("DIAGTIME >=", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMELessThan(Date value) {
            addCriterion("DIAGTIME <", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMELessThanOrEqualTo(Date value) {
            addCriterion("DIAGTIME <=", value, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEIn(List<Date> values) {
            addCriterion("DIAGTIME in", values, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMENotIn(List<Date> values) {
            addCriterion("DIAGTIME not in", values, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMEBetween(Date value1, Date value2) {
            addCriterion("DIAGTIME between", value1, value2, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andDIAGTIMENotBetween(Date value1, Date value2) {
            addCriterion("DIAGTIME not between", value1, value2, "DIAGTIME");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEIsNull() {
            addCriterion("VQDSTATE is null");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEIsNotNull() {
            addCriterion("VQDSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEEqualTo(String value) {
            addCriterion("VQDSTATE =", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATENotEqualTo(String value) {
            addCriterion("VQDSTATE <>", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEGreaterThan(String value) {
            addCriterion("VQDSTATE >", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEGreaterThanOrEqualTo(String value) {
            addCriterion("VQDSTATE >=", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATELessThan(String value) {
            addCriterion("VQDSTATE <", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATELessThanOrEqualTo(String value) {
            addCriterion("VQDSTATE <=", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATELike(String value) {
            addCriterion("VQDSTATE like", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATENotLike(String value) {
            addCriterion("VQDSTATE not like", value, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEIn(List<String> values) {
            addCriterion("VQDSTATE in", values, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATENotIn(List<String> values) {
            addCriterion("VQDSTATE not in", values, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATEBetween(String value1, String value2) {
            addCriterion("VQDSTATE between", value1, value2, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andVQDSTATENotBetween(String value1, String value2) {
            addCriterion("VQDSTATE not between", value1, value2, "VQDSTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEIsNull() {
            addCriterion("ONLINESTATE is null");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEIsNotNull() {
            addCriterion("ONLINESTATE is not null");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEEqualTo(String value) {
            addCriterion("ONLINESTATE =", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATENotEqualTo(String value) {
            addCriterion("ONLINESTATE <>", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEGreaterThan(String value) {
            addCriterion("ONLINESTATE >", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINESTATE >=", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATELessThan(String value) {
            addCriterion("ONLINESTATE <", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATELessThanOrEqualTo(String value) {
            addCriterion("ONLINESTATE <=", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATELike(String value) {
            addCriterion("ONLINESTATE like", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATENotLike(String value) {
            addCriterion("ONLINESTATE not like", value, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEIn(List<String> values) {
            addCriterion("ONLINESTATE in", values, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATENotIn(List<String> values) {
            addCriterion("ONLINESTATE not in", values, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATEBetween(String value1, String value2) {
            addCriterion("ONLINESTATE between", value1, value2, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andONLINESTATENotBetween(String value1, String value2) {
            addCriterion("ONLINESTATE not between", value1, value2, "ONLINESTATE");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDIsNull() {
            addCriterion("ISMODIFIED is null");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDIsNotNull() {
            addCriterion("ISMODIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDEqualTo(Integer value) {
            addCriterion("ISMODIFIED =", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDNotEqualTo(Integer value) {
            addCriterion("ISMODIFIED <>", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDGreaterThan(Integer value) {
            addCriterion("ISMODIFIED >", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISMODIFIED >=", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDLessThan(Integer value) {
            addCriterion("ISMODIFIED <", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDLessThanOrEqualTo(Integer value) {
            addCriterion("ISMODIFIED <=", value, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDIn(List<Integer> values) {
            addCriterion("ISMODIFIED in", values, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDNotIn(List<Integer> values) {
            addCriterion("ISMODIFIED not in", values, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDBetween(Integer value1, Integer value2) {
            addCriterion("ISMODIFIED between", value1, value2, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andISMODIFIEDNotBetween(Integer value1, Integer value2) {
            addCriterion("ISMODIFIED not between", value1, value2, "ISMODIFIED");
            return (Criteria) this;
        }

        public Criteria andTASKIDIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTASKIDIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTASKIDEqualTo(String value) {
            addCriterion("TASKID =", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDNotEqualTo(String value) {
            addCriterion("TASKID <>", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDGreaterThan(String value) {
            addCriterion("TASKID >", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDGreaterThanOrEqualTo(String value) {
            addCriterion("TASKID >=", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDLessThan(String value) {
            addCriterion("TASKID <", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDLessThanOrEqualTo(String value) {
            addCriterion("TASKID <=", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDLike(String value) {
            addCriterion("TASKID like", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDNotLike(String value) {
            addCriterion("TASKID not like", value, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDIn(List<String> values) {
            addCriterion("TASKID in", values, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDNotIn(List<String> values) {
            addCriterion("TASKID not in", values, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDBetween(String value1, String value2) {
            addCriterion("TASKID between", value1, value2, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKIDNotBetween(String value1, String value2) {
            addCriterion("TASKID not between", value1, value2, "TASKID");
            return (Criteria) this;
        }

        public Criteria andTASKNOIsNull() {
            addCriterion("TASKNO is null");
            return (Criteria) this;
        }

        public Criteria andTASKNOIsNotNull() {
            addCriterion("TASKNO is not null");
            return (Criteria) this;
        }

        public Criteria andTASKNOEqualTo(Integer value) {
            addCriterion("TASKNO =", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNONotEqualTo(Integer value) {
            addCriterion("TASKNO <>", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOGreaterThan(Integer value) {
            addCriterion("TASKNO >", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASKNO >=", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOLessThan(Integer value) {
            addCriterion("TASKNO <", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOLessThanOrEqualTo(Integer value) {
            addCriterion("TASKNO <=", value, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOIn(List<Integer> values) {
            addCriterion("TASKNO in", values, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNONotIn(List<Integer> values) {
            addCriterion("TASKNO not in", values, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNOBetween(Integer value1, Integer value2) {
            addCriterion("TASKNO between", value1, value2, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andTASKNONotBetween(Integer value1, Integer value2) {
            addCriterion("TASKNO not between", value1, value2, "TASKNO");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMIsNull() {
            addCriterion("CURREPEATNUM is null");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMIsNotNull() {
            addCriterion("CURREPEATNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMEqualTo(Integer value) {
            addCriterion("CURREPEATNUM =", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMNotEqualTo(Integer value) {
            addCriterion("CURREPEATNUM <>", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMGreaterThan(Integer value) {
            addCriterion("CURREPEATNUM >", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURREPEATNUM >=", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMLessThan(Integer value) {
            addCriterion("CURREPEATNUM <", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMLessThanOrEqualTo(Integer value) {
            addCriterion("CURREPEATNUM <=", value, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMIn(List<Integer> values) {
            addCriterion("CURREPEATNUM in", values, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMNotIn(List<Integer> values) {
            addCriterion("CURREPEATNUM not in", values, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMBetween(Integer value1, Integer value2) {
            addCriterion("CURREPEATNUM between", value1, value2, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCURREPEATNUMNotBetween(Integer value1, Integer value2) {
            addCriterion("CURREPEATNUM not between", value1, value2, "CURREPEATNUM");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEIsNull() {
            addCriterion("CIVILCODE is null");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEIsNotNull() {
            addCriterion("CIVILCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEEqualTo(String value) {
            addCriterion("CIVILCODE =", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODENotEqualTo(String value) {
            addCriterion("CIVILCODE <>", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEGreaterThan(String value) {
            addCriterion("CIVILCODE >", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CIVILCODE >=", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODELessThan(String value) {
            addCriterion("CIVILCODE <", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODELessThanOrEqualTo(String value) {
            addCriterion("CIVILCODE <=", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODELike(String value) {
            addCriterion("CIVILCODE like", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODENotLike(String value) {
            addCriterion("CIVILCODE not like", value, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEIn(List<String> values) {
            addCriterion("CIVILCODE in", values, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODENotIn(List<String> values) {
            addCriterion("CIVILCODE not in", values, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODEBetween(String value1, String value2) {
            addCriterion("CIVILCODE between", value1, value2, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andCIVILCODENotBetween(String value1, String value2) {
            addCriterion("CIVILCODE not between", value1, value2, "CIVILCODE");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYIsNull() {
            addCriterion("SIPDELAY is null");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYIsNotNull() {
            addCriterion("SIPDELAY is not null");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYEqualTo(Integer value) {
            addCriterion("SIPDELAY =", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYNotEqualTo(Integer value) {
            addCriterion("SIPDELAY <>", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYGreaterThan(Integer value) {
            addCriterion("SIPDELAY >", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIPDELAY >=", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYLessThan(Integer value) {
            addCriterion("SIPDELAY <", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYLessThanOrEqualTo(Integer value) {
            addCriterion("SIPDELAY <=", value, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYIn(List<Integer> values) {
            addCriterion("SIPDELAY in", values, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYNotIn(List<Integer> values) {
            addCriterion("SIPDELAY not in", values, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYBetween(Integer value1, Integer value2) {
            addCriterion("SIPDELAY between", value1, value2, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSIPDELAYNotBetween(Integer value1, Integer value2) {
            addCriterion("SIPDELAY not between", value1, value2, "SIPDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYIsNull() {
            addCriterion("STREAMDELAY is null");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYIsNotNull() {
            addCriterion("STREAMDELAY is not null");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYEqualTo(Integer value) {
            addCriterion("STREAMDELAY =", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYNotEqualTo(Integer value) {
            addCriterion("STREAMDELAY <>", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYGreaterThan(Integer value) {
            addCriterion("STREAMDELAY >", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYGreaterThanOrEqualTo(Integer value) {
            addCriterion("STREAMDELAY >=", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYLessThan(Integer value) {
            addCriterion("STREAMDELAY <", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYLessThanOrEqualTo(Integer value) {
            addCriterion("STREAMDELAY <=", value, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYIn(List<Integer> values) {
            addCriterion("STREAMDELAY in", values, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYNotIn(List<Integer> values) {
            addCriterion("STREAMDELAY not in", values, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYBetween(Integer value1, Integer value2) {
            addCriterion("STREAMDELAY between", value1, value2, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andSTREAMDELAYNotBetween(Integer value1, Integer value2) {
            addCriterion("STREAMDELAY not between", value1, value2, "STREAMDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYIsNull() {
            addCriterion("IFRAMEDELAY is null");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYIsNotNull() {
            addCriterion("IFRAMEDELAY is not null");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYEqualTo(Integer value) {
            addCriterion("IFRAMEDELAY =", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYNotEqualTo(Integer value) {
            addCriterion("IFRAMEDELAY <>", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYGreaterThan(Integer value) {
            addCriterion("IFRAMEDELAY >", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYGreaterThanOrEqualTo(Integer value) {
            addCriterion("IFRAMEDELAY >=", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYLessThan(Integer value) {
            addCriterion("IFRAMEDELAY <", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYLessThanOrEqualTo(Integer value) {
            addCriterion("IFRAMEDELAY <=", value, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYIn(List<Integer> values) {
            addCriterion("IFRAMEDELAY in", values, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYNotIn(List<Integer> values) {
            addCriterion("IFRAMEDELAY not in", values, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYBetween(Integer value1, Integer value2) {
            addCriterion("IFRAMEDELAY between", value1, value2, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andIFRAMEDELAYNotBetween(Integer value1, Integer value2) {
            addCriterion("IFRAMEDELAY not between", value1, value2, "IFRAMEDELAY");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDIsNull() {
            addCriterion("PLATFORMID is null");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDIsNotNull() {
            addCriterion("PLATFORMID is not null");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDEqualTo(String value) {
            addCriterion("PLATFORMID =", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDNotEqualTo(String value) {
            addCriterion("PLATFORMID <>", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDGreaterThan(String value) {
            addCriterion("PLATFORMID >", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORMID >=", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDLessThan(String value) {
            addCriterion("PLATFORMID <", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDLessThanOrEqualTo(String value) {
            addCriterion("PLATFORMID <=", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDLike(String value) {
            addCriterion("PLATFORMID like", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDNotLike(String value) {
            addCriterion("PLATFORMID not like", value, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDIn(List<String> values) {
            addCriterion("PLATFORMID in", values, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDNotIn(List<String> values) {
            addCriterion("PLATFORMID not in", values, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDBetween(String value1, String value2) {
            addCriterion("PLATFORMID between", value1, value2, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andPLATFORMIDNotBetween(String value1, String value2) {
            addCriterion("PLATFORMID not between", value1, value2, "PLATFORMID");
            return (Criteria) this;
        }

        public Criteria andCAPPICIsNull() {
            addCriterion("CAPPIC is null");
            return (Criteria) this;
        }

        public Criteria andCAPPICIsNotNull() {
            addCriterion("CAPPIC is not null");
            return (Criteria) this;
        }

        public Criteria andCAPPICEqualTo(String value) {
            addCriterion("CAPPIC =", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICNotEqualTo(String value) {
            addCriterion("CAPPIC <>", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICGreaterThan(String value) {
            addCriterion("CAPPIC >", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICGreaterThanOrEqualTo(String value) {
            addCriterion("CAPPIC >=", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICLessThan(String value) {
            addCriterion("CAPPIC <", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICLessThanOrEqualTo(String value) {
            addCriterion("CAPPIC <=", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICLike(String value) {
            addCriterion("CAPPIC like", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICNotLike(String value) {
            addCriterion("CAPPIC not like", value, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICIn(List<String> values) {
            addCriterion("CAPPIC in", values, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICNotIn(List<String> values) {
            addCriterion("CAPPIC not in", values, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICBetween(String value1, String value2) {
            addCriterion("CAPPIC between", value1, value2, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andCAPPICNotBetween(String value1, String value2) {
            addCriterion("CAPPIC not between", value1, value2, "CAPPIC");
            return (Criteria) this;
        }

        public Criteria andERRCODEIsNull() {
            addCriterion("ERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andERRCODEIsNotNull() {
            addCriterion("ERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andERRCODEEqualTo(String value) {
            addCriterion("ERRCODE =", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotEqualTo(String value) {
            addCriterion("ERRCODE <>", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEGreaterThan(String value) {
            addCriterion("ERRCODE >", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEGreaterThanOrEqualTo(String value) {
            addCriterion("ERRCODE >=", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODELessThan(String value) {
            addCriterion("ERRCODE <", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODELessThanOrEqualTo(String value) {
            addCriterion("ERRCODE <=", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODELike(String value) {
            addCriterion("ERRCODE like", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotLike(String value) {
            addCriterion("ERRCODE not like", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEIn(List<String> values) {
            addCriterion("ERRCODE in", values, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotIn(List<String> values) {
            addCriterion("ERRCODE not in", values, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEBetween(String value1, String value2) {
            addCriterion("ERRCODE between", value1, value2, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotBetween(String value1, String value2) {
            addCriterion("ERRCODE not between", value1, value2, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andVQDRESIsNull() {
            addCriterion("VQDRES is null");
            return (Criteria) this;
        }

        public Criteria andVQDRESIsNotNull() {
            addCriterion("VQDRES is not null");
            return (Criteria) this;
        }

        public Criteria andVQDRESEqualTo(String value) {
            addCriterion("VQDRES =", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESNotEqualTo(String value) {
            addCriterion("VQDRES <>", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESGreaterThan(String value) {
            addCriterion("VQDRES >", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESGreaterThanOrEqualTo(String value) {
            addCriterion("VQDRES >=", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESLessThan(String value) {
            addCriterion("VQDRES <", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESLessThanOrEqualTo(String value) {
            addCriterion("VQDRES <=", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESLike(String value) {
            addCriterion("VQDRES like", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESNotLike(String value) {
            addCriterion("VQDRES not like", value, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESIn(List<String> values) {
            addCriterion("VQDRES in", values, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESNotIn(List<String> values) {
            addCriterion("VQDRES not in", values, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESBetween(String value1, String value2) {
            addCriterion("VQDRES between", value1, value2, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andVQDRESNotBetween(String value1, String value2) {
            addCriterion("VQDRES not between", value1, value2, "VQDRES");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1IsNull() {
            addCriterion("PRESERVING1 is null");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1IsNotNull() {
            addCriterion("PRESERVING1 is not null");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1EqualTo(String value) {
            addCriterion("PRESERVING1 =", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1NotEqualTo(String value) {
            addCriterion("PRESERVING1 <>", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1GreaterThan(String value) {
            addCriterion("PRESERVING1 >", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1GreaterThanOrEqualTo(String value) {
            addCriterion("PRESERVING1 >=", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1LessThan(String value) {
            addCriterion("PRESERVING1 <", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1LessThanOrEqualTo(String value) {
            addCriterion("PRESERVING1 <=", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1Like(String value) {
            addCriterion("PRESERVING1 like", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1NotLike(String value) {
            addCriterion("PRESERVING1 not like", value, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1In(List<String> values) {
            addCriterion("PRESERVING1 in", values, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1NotIn(List<String> values) {
            addCriterion("PRESERVING1 not in", values, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1Between(String value1, String value2) {
            addCriterion("PRESERVING1 between", value1, value2, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING1NotBetween(String value1, String value2) {
            addCriterion("PRESERVING1 not between", value1, value2, "PRESERVING1");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2IsNull() {
            addCriterion("PRESERVING2 is null");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2IsNotNull() {
            addCriterion("PRESERVING2 is not null");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2EqualTo(String value) {
            addCriterion("PRESERVING2 =", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2NotEqualTo(String value) {
            addCriterion("PRESERVING2 <>", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2GreaterThan(String value) {
            addCriterion("PRESERVING2 >", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2GreaterThanOrEqualTo(String value) {
            addCriterion("PRESERVING2 >=", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2LessThan(String value) {
            addCriterion("PRESERVING2 <", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2LessThanOrEqualTo(String value) {
            addCriterion("PRESERVING2 <=", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2Like(String value) {
            addCriterion("PRESERVING2 like", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2NotLike(String value) {
            addCriterion("PRESERVING2 not like", value, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2In(List<String> values) {
            addCriterion("PRESERVING2 in", values, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2NotIn(List<String> values) {
            addCriterion("PRESERVING2 not in", values, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2Between(String value1, String value2) {
            addCriterion("PRESERVING2 between", value1, value2, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andPRESERVING2NotBetween(String value1, String value2) {
            addCriterion("PRESERVING2 not between", value1, value2, "PRESERVING2");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEIsNull() {
            addCriterion("ALARM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEIsNotNull() {
            addCriterion("ALARM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEEqualTo(String value) {
            addCriterion("ALARM_CODE =", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODENotEqualTo(String value) {
            addCriterion("ALARM_CODE <>", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEGreaterThan(String value) {
            addCriterion("ALARM_CODE >", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("ALARM_CODE >=", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODELessThan(String value) {
            addCriterion("ALARM_CODE <", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODELessThanOrEqualTo(String value) {
            addCriterion("ALARM_CODE <=", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODELike(String value) {
            addCriterion("ALARM_CODE like", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODENotLike(String value) {
            addCriterion("ALARM_CODE not like", value, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEIn(List<String> values) {
            addCriterion("ALARM_CODE in", values, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODENotIn(List<String> values) {
            addCriterion("ALARM_CODE not in", values, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODEBetween(String value1, String value2) {
            addCriterion("ALARM_CODE between", value1, value2, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andALARM_CODENotBetween(String value1, String value2) {
            addCriterion("ALARM_CODE not between", value1, value2, "ALARM_CODE");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEIsNull() {
            addCriterion("OFFLINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEIsNotNull() {
            addCriterion("OFFLINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEEqualTo(Integer value) {
            addCriterion("OFFLINE_TIME =", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotEqualTo(Integer value) {
            addCriterion("OFFLINE_TIME <>", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEGreaterThan(Integer value) {
            addCriterion("OFFLINE_TIME >", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_TIME >=", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMELessThan(Integer value) {
            addCriterion("OFFLINE_TIME <", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMELessThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_TIME <=", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEIn(List<Integer> values) {
            addCriterion("OFFLINE_TIME in", values, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotIn(List<Integer> values) {
            addCriterion("OFFLINE_TIME not in", values, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_TIME between", value1, value2, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_TIME not between", value1, value2, "OFFLINE_TIME");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}