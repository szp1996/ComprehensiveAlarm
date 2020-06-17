package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmInfoExample() {
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

        public Criteria andAlarm_idIsNull() {
            addCriterion("alarm_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_idIsNotNull() {
            addCriterion("alarm_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_idEqualTo(String value) {
            addCriterion("alarm_id =", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idNotEqualTo(String value) {
            addCriterion("alarm_id <>", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idGreaterThan(String value) {
            addCriterion("alarm_id >", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_id >=", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idLessThan(String value) {
            addCriterion("alarm_id <", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idLessThanOrEqualTo(String value) {
            addCriterion("alarm_id <=", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idLike(String value) {
            addCriterion("alarm_id like", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idNotLike(String value) {
            addCriterion("alarm_id not like", value, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idIn(List<String> values) {
            addCriterion("alarm_id in", values, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idNotIn(List<String> values) {
            addCriterion("alarm_id not in", values, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idBetween(String value1, String value2) {
            addCriterion("alarm_id between", value1, value2, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_idNotBetween(String value1, String value2) {
            addCriterion("alarm_id not between", value1, value2, "alarm_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleIsNull() {
            addCriterion("alarm_title is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleIsNotNull() {
            addCriterion("alarm_title is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleEqualTo(String value) {
            addCriterion("alarm_title =", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleNotEqualTo(String value) {
            addCriterion("alarm_title <>", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleGreaterThan(String value) {
            addCriterion("alarm_title >", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_title >=", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleLessThan(String value) {
            addCriterion("alarm_title <", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleLessThanOrEqualTo(String value) {
            addCriterion("alarm_title <=", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleLike(String value) {
            addCriterion("alarm_title like", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleNotLike(String value) {
            addCriterion("alarm_title not like", value, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleIn(List<String> values) {
            addCriterion("alarm_title in", values, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleNotIn(List<String> values) {
            addCriterion("alarm_title not in", values, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleBetween(String value1, String value2) {
            addCriterion("alarm_title between", value1, value2, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_titleNotBetween(String value1, String value2) {
            addCriterion("alarm_title not between", value1, value2, "alarm_title");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeIsNull() {
            addCriterion("alarm_time is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeIsNotNull() {
            addCriterion("alarm_time is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeEqualTo(Date value) {
            addCriterion("alarm_time =", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeNotEqualTo(Date value) {
            addCriterion("alarm_time <>", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeGreaterThan(Date value) {
            addCriterion("alarm_time >", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarm_time >=", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeLessThan(Date value) {
            addCriterion("alarm_time <", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeLessThanOrEqualTo(Date value) {
            addCriterion("alarm_time <=", value, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeIn(List<Date> values) {
            addCriterion("alarm_time in", values, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeNotIn(List<Date> values) {
            addCriterion("alarm_time not in", values, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeBetween(Date value1, Date value2) {
            addCriterion("alarm_time between", value1, value2, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_timeNotBetween(Date value1, Date value2) {
            addCriterion("alarm_time not between", value1, value2, "alarm_time");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idIsNull() {
            addCriterion("alarm_code_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idIsNotNull() {
            addCriterion("alarm_code_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idEqualTo(String value) {
            addCriterion("alarm_code_id =", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idNotEqualTo(String value) {
            addCriterion("alarm_code_id <>", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idGreaterThan(String value) {
            addCriterion("alarm_code_id >", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_code_id >=", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idLessThan(String value) {
            addCriterion("alarm_code_id <", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idLessThanOrEqualTo(String value) {
            addCriterion("alarm_code_id <=", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idLike(String value) {
            addCriterion("alarm_code_id like", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idNotLike(String value) {
            addCriterion("alarm_code_id not like", value, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idIn(List<String> values) {
            addCriterion("alarm_code_id in", values, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idNotIn(List<String> values) {
            addCriterion("alarm_code_id not in", values, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idBetween(String value1, String value2) {
            addCriterion("alarm_code_id between", value1, value2, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_idNotBetween(String value1, String value2) {
            addCriterion("alarm_code_id not between", value1, value2, "alarm_code_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusIsNull() {
            addCriterion("alarm_status is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusIsNotNull() {
            addCriterion("alarm_status is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusEqualTo(String value) {
            addCriterion("alarm_status =", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusNotEqualTo(String value) {
            addCriterion("alarm_status <>", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusGreaterThan(String value) {
            addCriterion("alarm_status >", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_status >=", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusLessThan(String value) {
            addCriterion("alarm_status <", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusLessThanOrEqualTo(String value) {
            addCriterion("alarm_status <=", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusLike(String value) {
            addCriterion("alarm_status like", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusNotLike(String value) {
            addCriterion("alarm_status not like", value, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusIn(List<String> values) {
            addCriterion("alarm_status in", values, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusNotIn(List<String> values) {
            addCriterion("alarm_status not in", values, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusBetween(String value1, String value2) {
            addCriterion("alarm_status between", value1, value2, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andAlarm_statusNotBetween(String value1, String value2) {
            addCriterion("alarm_status not between", value1, value2, "alarm_status");
            return (Criteria) this;
        }

        public Criteria andScene_idIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andScene_idIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andScene_idEqualTo(String value) {
            addCriterion("scene_id =", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idNotEqualTo(String value) {
            addCriterion("scene_id <>", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idGreaterThan(String value) {
            addCriterion("scene_id >", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idGreaterThanOrEqualTo(String value) {
            addCriterion("scene_id >=", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idLessThan(String value) {
            addCriterion("scene_id <", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idLessThanOrEqualTo(String value) {
            addCriterion("scene_id <=", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idLike(String value) {
            addCriterion("scene_id like", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idNotLike(String value) {
            addCriterion("scene_id not like", value, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idIn(List<String> values) {
            addCriterion("scene_id in", values, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idNotIn(List<String> values) {
            addCriterion("scene_id not in", values, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idBetween(String value1, String value2) {
            addCriterion("scene_id between", value1, value2, "scene_id");
            return (Criteria) this;
        }

        public Criteria andScene_idNotBetween(String value1, String value2) {
            addCriterion("scene_id not between", value1, value2, "scene_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idIsNull() {
            addCriterion("workorder_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idIsNotNull() {
            addCriterion("workorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idEqualTo(String value) {
            addCriterion("workorder_id =", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idNotEqualTo(String value) {
            addCriterion("workorder_id <>", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idGreaterThan(String value) {
            addCriterion("workorder_id >", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idGreaterThanOrEqualTo(String value) {
            addCriterion("workorder_id >=", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idLessThan(String value) {
            addCriterion("workorder_id <", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idLessThanOrEqualTo(String value) {
            addCriterion("workorder_id <=", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idLike(String value) {
            addCriterion("workorder_id like", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idNotLike(String value) {
            addCriterion("workorder_id not like", value, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idIn(List<String> values) {
            addCriterion("workorder_id in", values, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idNotIn(List<String> values) {
            addCriterion("workorder_id not in", values, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idBetween(String value1, String value2) {
            addCriterion("workorder_id between", value1, value2, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andWorkorder_idNotBetween(String value1, String value2) {
            addCriterion("workorder_id not between", value1, value2, "workorder_id");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeIsNull() {
            addCriterion("monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeIsNotNull() {
            addCriterion("monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeEqualTo(String value) {
            addCriterion("monitor_type =", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeNotEqualTo(String value) {
            addCriterion("monitor_type <>", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeGreaterThan(String value) {
            addCriterion("monitor_type >", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_type >=", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeLessThan(String value) {
            addCriterion("monitor_type <", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeLessThanOrEqualTo(String value) {
            addCriterion("monitor_type <=", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeLike(String value) {
            addCriterion("monitor_type like", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeNotLike(String value) {
            addCriterion("monitor_type not like", value, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeIn(List<String> values) {
            addCriterion("monitor_type in", values, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeNotIn(List<String> values) {
            addCriterion("monitor_type not in", values, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeBetween(String value1, String value2) {
            addCriterion("monitor_type between", value1, value2, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andMonitor_typeNotBetween(String value1, String value2) {
            addCriterion("monitor_type not between", value1, value2, "monitor_type");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
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