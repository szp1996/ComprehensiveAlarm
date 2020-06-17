package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DOutdeviceinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DOutdeviceinfoExample() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
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

        public Criteria andMANUFACTURERIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andMANUFACTUREREqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERLike(String value) {
            addCriterion("MANUFACTURER like", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMANUFACTURERNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "MANUFACTURER");
            return (Criteria) this;
        }

        public Criteria andMODELIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andMODELIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andMODELEqualTo(String value) {
            addCriterion("MODEL =", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELGreaterThan(String value) {
            addCriterion("MODEL >", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELLessThan(String value) {
            addCriterion("MODEL <", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELLike(String value) {
            addCriterion("MODEL like", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELNotLike(String value) {
            addCriterion("MODEL not like", value, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELIn(List<String> values) {
            addCriterion("MODEL in", values, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "MODEL");
            return (Criteria) this;
        }

        public Criteria andMODELNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "MODEL");
            return (Criteria) this;
        }

        public Criteria andOWNERIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOWNERIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOWNEREqualTo(String value) {
            addCriterion("OWNER =", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERGreaterThan(String value) {
            addCriterion("OWNER >", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERLessThan(String value) {
            addCriterion("OWNER <", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERLike(String value) {
            addCriterion("OWNER like", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERNotLike(String value) {
            addCriterion("OWNER not like", value, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERIn(List<String> values) {
            addCriterion("OWNER in", values, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "OWNER");
            return (Criteria) this;
        }

        public Criteria andOWNERNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "OWNER");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
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

        public Criteria andBLOCKIsNull() {
            addCriterion("BLOCK is null");
            return (Criteria) this;
        }

        public Criteria andBLOCKIsNotNull() {
            addCriterion("BLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andBLOCKEqualTo(String value) {
            addCriterion("BLOCK =", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKNotEqualTo(String value) {
            addCriterion("BLOCK <>", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKGreaterThan(String value) {
            addCriterion("BLOCK >", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKGreaterThanOrEqualTo(String value) {
            addCriterion("BLOCK >=", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKLessThan(String value) {
            addCriterion("BLOCK <", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKLessThanOrEqualTo(String value) {
            addCriterion("BLOCK <=", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKLike(String value) {
            addCriterion("BLOCK like", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKNotLike(String value) {
            addCriterion("BLOCK not like", value, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKIn(List<String> values) {
            addCriterion("BLOCK in", values, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKNotIn(List<String> values) {
            addCriterion("BLOCK not in", values, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKBetween(String value1, String value2) {
            addCriterion("BLOCK between", value1, value2, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andBLOCKNotBetween(String value1, String value2) {
            addCriterion("BLOCK not between", value1, value2, "BLOCK");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDENotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDELessThan(Double value) {
            addCriterion("LONGITUDE <", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDELessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDENotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDEBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLONGITUDENotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "LONGITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDEIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLATITUDEIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLATITUDEEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDENotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDEGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDEGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDELessThan(Double value) {
            addCriterion("LATITUDE <", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDELessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDEIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDENotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDEBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andLATITUDENotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "LATITUDE");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andADDRESSIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andADDRESSEqualTo(String value) {
            addCriterion("ADDRESS =", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThan(String value) {
            addCriterion("ADDRESS <", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSLike(String value) {
            addCriterion("ADDRESS like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotLike(String value) {
            addCriterion("ADDRESS not like", value, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSIn(List<String> values) {
            addCriterion("ADDRESS in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andADDRESSNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPARENTIDIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andPARENTIDIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPARENTIDEqualTo(String value) {
            addCriterion("PARENTID =", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDGreaterThan(String value) {
            addCriterion("PARENTID >", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLessThan(String value) {
            addCriterion("PARENTID <", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDLike(String value) {
            addCriterion("PARENTID like", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotLike(String value) {
            addCriterion("PARENTID not like", value, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDIn(List<String> values) {
            addCriterion("PARENTID in", values, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andPARENTIDNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "PARENTID");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYIsNull() {
            addCriterion("SAFETYWAY is null");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYIsNotNull() {
            addCriterion("SAFETYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYEqualTo(Integer value) {
            addCriterion("SAFETYWAY =", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYNotEqualTo(Integer value) {
            addCriterion("SAFETYWAY <>", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYGreaterThan(Integer value) {
            addCriterion("SAFETYWAY >", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAFETYWAY >=", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYLessThan(Integer value) {
            addCriterion("SAFETYWAY <", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYLessThanOrEqualTo(Integer value) {
            addCriterion("SAFETYWAY <=", value, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYIn(List<Integer> values) {
            addCriterion("SAFETYWAY in", values, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYNotIn(List<Integer> values) {
            addCriterion("SAFETYWAY not in", values, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYBetween(Integer value1, Integer value2) {
            addCriterion("SAFETYWAY between", value1, value2, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andSAFETYWAYNotBetween(Integer value1, Integer value2) {
            addCriterion("SAFETYWAY not between", value1, value2, "SAFETYWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYIsNull() {
            addCriterion("REGISTERWAY is null");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYIsNotNull() {
            addCriterion("REGISTERWAY is not null");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYEqualTo(Integer value) {
            addCriterion("REGISTERWAY =", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYNotEqualTo(Integer value) {
            addCriterion("REGISTERWAY <>", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYGreaterThan(Integer value) {
            addCriterion("REGISTERWAY >", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGISTERWAY >=", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYLessThan(Integer value) {
            addCriterion("REGISTERWAY <", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYLessThanOrEqualTo(Integer value) {
            addCriterion("REGISTERWAY <=", value, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYIn(List<Integer> values) {
            addCriterion("REGISTERWAY in", values, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYNotIn(List<Integer> values) {
            addCriterion("REGISTERWAY not in", values, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYBetween(Integer value1, Integer value2) {
            addCriterion("REGISTERWAY between", value1, value2, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andREGISTERWAYNotBetween(Integer value1, Integer value2) {
            addCriterion("REGISTERWAY not between", value1, value2, "REGISTERWAY");
            return (Criteria) this;
        }

        public Criteria andCERTNUMIsNull() {
            addCriterion("CERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCERTNUMIsNotNull() {
            addCriterion("CERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCERTNUMEqualTo(String value) {
            addCriterion("CERTNUM =", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMNotEqualTo(String value) {
            addCriterion("CERTNUM <>", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMGreaterThan(String value) {
            addCriterion("CERTNUM >", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMGreaterThanOrEqualTo(String value) {
            addCriterion("CERTNUM >=", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMLessThan(String value) {
            addCriterion("CERTNUM <", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMLessThanOrEqualTo(String value) {
            addCriterion("CERTNUM <=", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMLike(String value) {
            addCriterion("CERTNUM like", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMNotLike(String value) {
            addCriterion("CERTNUM not like", value, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMIn(List<String> values) {
            addCriterion("CERTNUM in", values, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMNotIn(List<String> values) {
            addCriterion("CERTNUM not in", values, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMBetween(String value1, String value2) {
            addCriterion("CERTNUM between", value1, value2, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTNUMNotBetween(String value1, String value2) {
            addCriterion("CERTNUM not between", value1, value2, "CERTNUM");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEIsNull() {
            addCriterion("CERTIFIABLE is null");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEIsNotNull() {
            addCriterion("CERTIFIABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEEqualTo(Integer value) {
            addCriterion("CERTIFIABLE =", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLENotEqualTo(Integer value) {
            addCriterion("CERTIFIABLE <>", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEGreaterThan(Integer value) {
            addCriterion("CERTIFIABLE >", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERTIFIABLE >=", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLELessThan(Integer value) {
            addCriterion("CERTIFIABLE <", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLELessThanOrEqualTo(Integer value) {
            addCriterion("CERTIFIABLE <=", value, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEIn(List<Integer> values) {
            addCriterion("CERTIFIABLE in", values, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLENotIn(List<Integer> values) {
            addCriterion("CERTIFIABLE not in", values, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLEBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFIABLE between", value1, value2, "CERTIFIABLE");
            return (Criteria) this;
        }

        public Criteria andCERTIFIABLENotBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFIABLE not between", value1, value2, "CERTIFIABLE");
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

        public Criteria andERRCODEEqualTo(Integer value) {
            addCriterion("ERRCODE =", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotEqualTo(Integer value) {
            addCriterion("ERRCODE <>", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEGreaterThan(Integer value) {
            addCriterion("ERRCODE >", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERRCODE >=", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODELessThan(Integer value) {
            addCriterion("ERRCODE <", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODELessThanOrEqualTo(Integer value) {
            addCriterion("ERRCODE <=", value, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEIn(List<Integer> values) {
            addCriterion("ERRCODE in", values, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotIn(List<Integer> values) {
            addCriterion("ERRCODE not in", values, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODEBetween(Integer value1, Integer value2) {
            addCriterion("ERRCODE between", value1, value2, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andERRCODENotBetween(Integer value1, Integer value2) {
            addCriterion("ERRCODE not between", value1, value2, "ERRCODE");
            return (Criteria) this;
        }

        public Criteria andENDTIMEIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andENDTIMEIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andENDTIMEEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMENotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMEGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMELessThan(Date value) {
            addCriterion("ENDTIME <", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMELessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMEIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMENotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMEBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andENDTIMENotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "ENDTIME");
            return (Criteria) this;
        }

        public Criteria andSECRECYIsNull() {
            addCriterion("SECRECY is null");
            return (Criteria) this;
        }

        public Criteria andSECRECYIsNotNull() {
            addCriterion("SECRECY is not null");
            return (Criteria) this;
        }

        public Criteria andSECRECYEqualTo(Integer value) {
            addCriterion("SECRECY =", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYNotEqualTo(Integer value) {
            addCriterion("SECRECY <>", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYGreaterThan(Integer value) {
            addCriterion("SECRECY >", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECRECY >=", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYLessThan(Integer value) {
            addCriterion("SECRECY <", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYLessThanOrEqualTo(Integer value) {
            addCriterion("SECRECY <=", value, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYIn(List<Integer> values) {
            addCriterion("SECRECY in", values, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYNotIn(List<Integer> values) {
            addCriterion("SECRECY not in", values, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYBetween(Integer value1, Integer value2) {
            addCriterion("SECRECY between", value1, value2, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andSECRECYNotBetween(Integer value1, Integer value2) {
            addCriterion("SECRECY not between", value1, value2, "SECRECY");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEIsNull() {
            addCriterion("DEVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEIsNotNull() {
            addCriterion("DEVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEEqualTo(String value) {
            addCriterion("DEVICETYPE =", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPENotEqualTo(String value) {
            addCriterion("DEVICETYPE <>", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEGreaterThan(String value) {
            addCriterion("DEVICETYPE >", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE >=", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPELessThan(String value) {
            addCriterion("DEVICETYPE <", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPELessThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE <=", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPELike(String value) {
            addCriterion("DEVICETYPE like", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPENotLike(String value) {
            addCriterion("DEVICETYPE not like", value, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEIn(List<String> values) {
            addCriterion("DEVICETYPE in", values, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPENotIn(List<String> values) {
            addCriterion("DEVICETYPE not in", values, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPEBetween(String value1, String value2) {
            addCriterion("DEVICETYPE between", value1, value2, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDEVICETYPENotBetween(String value1, String value2) {
            addCriterion("DEVICETYPE not between", value1, value2, "DEVICETYPE");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONLike(String value) {
            addCriterion("DESCRIPTION like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andDESCRIPTIONNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "DESCRIPTION");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(String value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(String value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(String value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLike(String value) {
            addCriterion("STATUS like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotLike(String value) {
            addCriterion("STATUS not like", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<String> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERIsNull() {
            addCriterion("SOURCECENTER is null");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERIsNotNull() {
            addCriterion("SOURCECENTER is not null");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTEREqualTo(String value) {
            addCriterion("SOURCECENTER =", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERNotEqualTo(String value) {
            addCriterion("SOURCECENTER <>", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERGreaterThan(String value) {
            addCriterion("SOURCECENTER >", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCECENTER >=", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERLessThan(String value) {
            addCriterion("SOURCECENTER <", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERLessThanOrEqualTo(String value) {
            addCriterion("SOURCECENTER <=", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERLike(String value) {
            addCriterion("SOURCECENTER like", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERNotLike(String value) {
            addCriterion("SOURCECENTER not like", value, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERIn(List<String> values) {
            addCriterion("SOURCECENTER in", values, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERNotIn(List<String> values) {
            addCriterion("SOURCECENTER not in", values, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERBetween(String value1, String value2) {
            addCriterion("SOURCECENTER between", value1, value2, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andSOURCECENTERNotBetween(String value1, String value2) {
            addCriterion("SOURCECENTER not between", value1, value2, "SOURCECENTER");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDIsNull() {
            addCriterion("ISWITHCHILD is null");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDIsNotNull() {
            addCriterion("ISWITHCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDEqualTo(String value) {
            addCriterion("ISWITHCHILD =", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDNotEqualTo(String value) {
            addCriterion("ISWITHCHILD <>", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDGreaterThan(String value) {
            addCriterion("ISWITHCHILD >", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDGreaterThanOrEqualTo(String value) {
            addCriterion("ISWITHCHILD >=", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDLessThan(String value) {
            addCriterion("ISWITHCHILD <", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDLessThanOrEqualTo(String value) {
            addCriterion("ISWITHCHILD <=", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDLike(String value) {
            addCriterion("ISWITHCHILD like", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDNotLike(String value) {
            addCriterion("ISWITHCHILD not like", value, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDIn(List<String> values) {
            addCriterion("ISWITHCHILD in", values, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDNotIn(List<String> values) {
            addCriterion("ISWITHCHILD not in", values, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDBetween(String value1, String value2) {
            addCriterion("ISWITHCHILD between", value1, value2, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andISWITHCHILDNotBetween(String value1, String value2) {
            addCriterion("ISWITHCHILD not between", value1, value2, "ISWITHCHILD");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEIsNull() {
            addCriterion("CAMERATYPE is null");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEIsNotNull() {
            addCriterion("CAMERATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEEqualTo(String value) {
            addCriterion("CAMERATYPE =", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPENotEqualTo(String value) {
            addCriterion("CAMERATYPE <>", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEGreaterThan(String value) {
            addCriterion("CAMERATYPE >", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CAMERATYPE >=", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPELessThan(String value) {
            addCriterion("CAMERATYPE <", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPELessThanOrEqualTo(String value) {
            addCriterion("CAMERATYPE <=", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPELike(String value) {
            addCriterion("CAMERATYPE like", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPENotLike(String value) {
            addCriterion("CAMERATYPE not like", value, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEIn(List<String> values) {
            addCriterion("CAMERATYPE in", values, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPENotIn(List<String> values) {
            addCriterion("CAMERATYPE not in", values, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPEBetween(String value1, String value2) {
            addCriterion("CAMERATYPE between", value1, value2, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andCAMERATYPENotBetween(String value1, String value2) {
            addCriterion("CAMERATYPE not between", value1, value2, "CAMERATYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEIsNull() {
            addCriterion("PTZTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEIsNotNull() {
            addCriterion("PTZTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEEqualTo(String value) {
            addCriterion("PTZTYPE =", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPENotEqualTo(String value) {
            addCriterion("PTZTYPE <>", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEGreaterThan(String value) {
            addCriterion("PTZTYPE >", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PTZTYPE >=", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPELessThan(String value) {
            addCriterion("PTZTYPE <", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPELessThanOrEqualTo(String value) {
            addCriterion("PTZTYPE <=", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPELike(String value) {
            addCriterion("PTZTYPE like", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPENotLike(String value) {
            addCriterion("PTZTYPE not like", value, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEIn(List<String> values) {
            addCriterion("PTZTYPE in", values, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPENotIn(List<String> values) {
            addCriterion("PTZTYPE not in", values, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPEBetween(String value1, String value2) {
            addCriterion("PTZTYPE between", value1, value2, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPTZTYPENotBetween(String value1, String value2) {
            addCriterion("PTZTYPE not between", value1, value2, "PTZTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEIsNull() {
            addCriterion("POSITIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEIsNotNull() {
            addCriterion("POSITIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEEqualTo(String value) {
            addCriterion("POSITIONTYPE =", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPENotEqualTo(String value) {
            addCriterion("POSITIONTYPE <>", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEGreaterThan(String value) {
            addCriterion("POSITIONTYPE >", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("POSITIONTYPE >=", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPELessThan(String value) {
            addCriterion("POSITIONTYPE <", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPELessThanOrEqualTo(String value) {
            addCriterion("POSITIONTYPE <=", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPELike(String value) {
            addCriterion("POSITIONTYPE like", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPENotLike(String value) {
            addCriterion("POSITIONTYPE not like", value, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEIn(List<String> values) {
            addCriterion("POSITIONTYPE in", values, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPENotIn(List<String> values) {
            addCriterion("POSITIONTYPE not in", values, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPEBetween(String value1, String value2) {
            addCriterion("POSITIONTYPE between", value1, value2, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andPOSITIONTYPENotBetween(String value1, String value2) {
            addCriterion("POSITIONTYPE not between", value1, value2, "POSITIONTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEIsNull() {
            addCriterion("ROOMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEIsNotNull() {
            addCriterion("ROOMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEEqualTo(String value) {
            addCriterion("ROOMTYPE =", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPENotEqualTo(String value) {
            addCriterion("ROOMTYPE <>", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEGreaterThan(String value) {
            addCriterion("ROOMTYPE >", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMTYPE >=", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPELessThan(String value) {
            addCriterion("ROOMTYPE <", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPELessThanOrEqualTo(String value) {
            addCriterion("ROOMTYPE <=", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPELike(String value) {
            addCriterion("ROOMTYPE like", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPENotLike(String value) {
            addCriterion("ROOMTYPE not like", value, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEIn(List<String> values) {
            addCriterion("ROOMTYPE in", values, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPENotIn(List<String> values) {
            addCriterion("ROOMTYPE not in", values, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPEBetween(String value1, String value2) {
            addCriterion("ROOMTYPE between", value1, value2, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andROOMTYPENotBetween(String value1, String value2) {
            addCriterion("ROOMTYPE not between", value1, value2, "ROOMTYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPEIsNull() {
            addCriterion("USETYPE is null");
            return (Criteria) this;
        }

        public Criteria andUSETYPEIsNotNull() {
            addCriterion("USETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUSETYPEEqualTo(String value) {
            addCriterion("USETYPE =", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPENotEqualTo(String value) {
            addCriterion("USETYPE <>", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPEGreaterThan(String value) {
            addCriterion("USETYPE >", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPEGreaterThanOrEqualTo(String value) {
            addCriterion("USETYPE >=", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPELessThan(String value) {
            addCriterion("USETYPE <", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPELessThanOrEqualTo(String value) {
            addCriterion("USETYPE <=", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPELike(String value) {
            addCriterion("USETYPE like", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPENotLike(String value) {
            addCriterion("USETYPE not like", value, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPEIn(List<String> values) {
            addCriterion("USETYPE in", values, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPENotIn(List<String> values) {
            addCriterion("USETYPE not in", values, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPEBetween(String value1, String value2) {
            addCriterion("USETYPE between", value1, value2, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andUSETYPENotBetween(String value1, String value2) {
            addCriterion("USETYPE not between", value1, value2, "USETYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEIsNull() {
            addCriterion("SUPPLYLIGHTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEIsNotNull() {
            addCriterion("SUPPLYLIGHTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE =", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPENotEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE <>", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEGreaterThan(String value) {
            addCriterion("SUPPLYLIGHTTYPE >", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE >=", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPELessThan(String value) {
            addCriterion("SUPPLYLIGHTTYPE <", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPELessThanOrEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE <=", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPELike(String value) {
            addCriterion("SUPPLYLIGHTTYPE like", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPENotLike(String value) {
            addCriterion("SUPPLYLIGHTTYPE not like", value, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEIn(List<String> values) {
            addCriterion("SUPPLYLIGHTTYPE in", values, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPENotIn(List<String> values) {
            addCriterion("SUPPLYLIGHTTYPE not in", values, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPEBetween(String value1, String value2) {
            addCriterion("SUPPLYLIGHTTYPE between", value1, value2, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andSUPPLYLIGHTTYPENotBetween(String value1, String value2) {
            addCriterion("SUPPLYLIGHTTYPE not between", value1, value2, "SUPPLYLIGHTTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEIsNull() {
            addCriterion("DIRECTIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEIsNotNull() {
            addCriterion("DIRECTIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEEqualTo(String value) {
            addCriterion("DIRECTIONTYPE =", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPENotEqualTo(String value) {
            addCriterion("DIRECTIONTYPE <>", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEGreaterThan(String value) {
            addCriterion("DIRECTIONTYPE >", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTIONTYPE >=", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPELessThan(String value) {
            addCriterion("DIRECTIONTYPE <", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPELessThanOrEqualTo(String value) {
            addCriterion("DIRECTIONTYPE <=", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPELike(String value) {
            addCriterion("DIRECTIONTYPE like", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPENotLike(String value) {
            addCriterion("DIRECTIONTYPE not like", value, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEIn(List<String> values) {
            addCriterion("DIRECTIONTYPE in", values, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPENotIn(List<String> values) {
            addCriterion("DIRECTIONTYPE not in", values, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPEBetween(String value1, String value2) {
            addCriterion("DIRECTIONTYPE between", value1, value2, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andDIRECTIONTYPENotBetween(String value1, String value2) {
            addCriterion("DIRECTIONTYPE not between", value1, value2, "DIRECTIONTYPE");
            return (Criteria) this;
        }

        public Criteria andIPIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIPIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIPEqualTo(String value) {
            addCriterion("IP =", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotEqualTo(String value) {
            addCriterion("IP <>", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThan(String value) {
            addCriterion("IP >", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThan(String value) {
            addCriterion("IP <", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPLike(String value) {
            addCriterion("IP like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotLike(String value) {
            addCriterion("IP not like", value, "IP");
            return (Criteria) this;
        }

        public Criteria andIPIn(List<String> values) {
            addCriterion("IP in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotIn(List<String> values) {
            addCriterion("IP not in", values, "IP");
            return (Criteria) this;
        }

        public Criteria andIPBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andIPNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "IP");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTIsNull() {
            addCriterion("STREAMENCRYPT is null");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTIsNotNull() {
            addCriterion("STREAMENCRYPT is not null");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTEqualTo(String value) {
            addCriterion("STREAMENCRYPT =", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTNotEqualTo(String value) {
            addCriterion("STREAMENCRYPT <>", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTGreaterThan(String value) {
            addCriterion("STREAMENCRYPT >", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMENCRYPT >=", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTLessThan(String value) {
            addCriterion("STREAMENCRYPT <", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTLessThanOrEqualTo(String value) {
            addCriterion("STREAMENCRYPT <=", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTLike(String value) {
            addCriterion("STREAMENCRYPT like", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTNotLike(String value) {
            addCriterion("STREAMENCRYPT not like", value, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTIn(List<String> values) {
            addCriterion("STREAMENCRYPT in", values, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTNotIn(List<String> values) {
            addCriterion("STREAMENCRYPT not in", values, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTBetween(String value1, String value2) {
            addCriterion("STREAMENCRYPT between", value1, value2, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andSTREAMENCRYPTNotBetween(String value1, String value2) {
            addCriterion("STREAMENCRYPT not between", value1, value2, "STREAMENCRYPT");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDIsNull() {
            addCriterion("ISCOLLECTED is null");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDIsNotNull() {
            addCriterion("ISCOLLECTED is not null");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDEqualTo(String value) {
            addCriterion("ISCOLLECTED =", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDNotEqualTo(String value) {
            addCriterion("ISCOLLECTED <>", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDGreaterThan(String value) {
            addCriterion("ISCOLLECTED >", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOLLECTED >=", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDLessThan(String value) {
            addCriterion("ISCOLLECTED <", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDLessThanOrEqualTo(String value) {
            addCriterion("ISCOLLECTED <=", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDLike(String value) {
            addCriterion("ISCOLLECTED like", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDNotLike(String value) {
            addCriterion("ISCOLLECTED not like", value, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDIn(List<String> values) {
            addCriterion("ISCOLLECTED in", values, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDNotIn(List<String> values) {
            addCriterion("ISCOLLECTED not in", values, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDBetween(String value1, String value2) {
            addCriterion("ISCOLLECTED between", value1, value2, "ISCOLLECTED");
            return (Criteria) this;
        }

        public Criteria andISCOLLECTEDNotBetween(String value1, String value2) {
            addCriterion("ISCOLLECTED not between", value1, value2, "ISCOLLECTED");
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

        public Criteria andOFFLINE_TIMEEqualTo(String value) {
            addCriterion("OFFLINE_TIME =", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotEqualTo(String value) {
            addCriterion("OFFLINE_TIME <>", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEGreaterThan(String value) {
            addCriterion("OFFLINE_TIME >", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEGreaterThanOrEqualTo(String value) {
            addCriterion("OFFLINE_TIME >=", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMELessThan(String value) {
            addCriterion("OFFLINE_TIME <", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMELessThanOrEqualTo(String value) {
            addCriterion("OFFLINE_TIME <=", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMELike(String value) {
            addCriterion("OFFLINE_TIME like", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotLike(String value) {
            addCriterion("OFFLINE_TIME not like", value, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEIn(List<String> values) {
            addCriterion("OFFLINE_TIME in", values, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotIn(List<String> values) {
            addCriterion("OFFLINE_TIME not in", values, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMEBetween(String value1, String value2) {
            addCriterion("OFFLINE_TIME between", value1, value2, "OFFLINE_TIME");
            return (Criteria) this;
        }

        public Criteria andOFFLINE_TIMENotBetween(String value1, String value2) {
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