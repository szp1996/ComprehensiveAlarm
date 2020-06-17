package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.List;

public class AlarmBussinessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmBussinessExample() {
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

        public Criteria andAlarm_bussiness_idIsNull() {
            addCriterion("alarm_bussiness_id is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idIsNotNull() {
            addCriterion("alarm_bussiness_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idEqualTo(String value) {
            addCriterion("alarm_bussiness_id =", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idNotEqualTo(String value) {
            addCriterion("alarm_bussiness_id <>", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idGreaterThan(String value) {
            addCriterion("alarm_bussiness_id >", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_bussiness_id >=", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idLessThan(String value) {
            addCriterion("alarm_bussiness_id <", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idLessThanOrEqualTo(String value) {
            addCriterion("alarm_bussiness_id <=", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idLike(String value) {
            addCriterion("alarm_bussiness_id like", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idNotLike(String value) {
            addCriterion("alarm_bussiness_id not like", value, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idIn(List<String> values) {
            addCriterion("alarm_bussiness_id in", values, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idNotIn(List<String> values) {
            addCriterion("alarm_bussiness_id not in", values, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idBetween(String value1, String value2) {
            addCriterion("alarm_bussiness_id between", value1, value2, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_idNotBetween(String value1, String value2) {
            addCriterion("alarm_bussiness_id not between", value1, value2, "alarm_bussiness_id");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameIsNull() {
            addCriterion("alarm_bussiness_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameIsNotNull() {
            addCriterion("alarm_bussiness_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameEqualTo(String value) {
            addCriterion("alarm_bussiness_name =", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameNotEqualTo(String value) {
            addCriterion("alarm_bussiness_name <>", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameGreaterThan(String value) {
            addCriterion("alarm_bussiness_name >", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_bussiness_name >=", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameLessThan(String value) {
            addCriterion("alarm_bussiness_name <", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameLessThanOrEqualTo(String value) {
            addCriterion("alarm_bussiness_name <=", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameLike(String value) {
            addCriterion("alarm_bussiness_name like", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameNotLike(String value) {
            addCriterion("alarm_bussiness_name not like", value, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameIn(List<String> values) {
            addCriterion("alarm_bussiness_name in", values, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameNotIn(List<String> values) {
            addCriterion("alarm_bussiness_name not in", values, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameBetween(String value1, String value2) {
            addCriterion("alarm_bussiness_name between", value1, value2, "alarm_bussiness_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_bussiness_nameNotBetween(String value1, String value2) {
            addCriterion("alarm_bussiness_name not between", value1, value2, "alarm_bussiness_name");
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