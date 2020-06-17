package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.List;

public class AlarmCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmCodeExample() {
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

        public Criteria andAlarm_code_nameIsNull() {
            addCriterion("alarm_code_name is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameIsNotNull() {
            addCriterion("alarm_code_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameEqualTo(String value) {
            addCriterion("alarm_code_name =", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameNotEqualTo(String value) {
            addCriterion("alarm_code_name <>", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameGreaterThan(String value) {
            addCriterion("alarm_code_name >", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_code_name >=", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameLessThan(String value) {
            addCriterion("alarm_code_name <", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameLessThanOrEqualTo(String value) {
            addCriterion("alarm_code_name <=", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameLike(String value) {
            addCriterion("alarm_code_name like", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameNotLike(String value) {
            addCriterion("alarm_code_name not like", value, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameIn(List<String> values) {
            addCriterion("alarm_code_name in", values, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameNotIn(List<String> values) {
            addCriterion("alarm_code_name not in", values, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameBetween(String value1, String value2) {
            addCriterion("alarm_code_name between", value1, value2, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andAlarm_code_nameNotBetween(String value1, String value2) {
            addCriterion("alarm_code_name not between", value1, value2, "alarm_code_name");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(String value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(String value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(String value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(String value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(String value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(String value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLike(String value) {
            addCriterion("level like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotLike(String value) {
            addCriterion("level not like", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<String> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<String> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(String value1, String value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(String value1, String value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdIsNull() {
            addCriterion("min_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdIsNotNull() {
            addCriterion("min_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdEqualTo(Integer value) {
            addCriterion("min_threshold =", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdNotEqualTo(Integer value) {
            addCriterion("min_threshold <>", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdGreaterThan(Integer value) {
            addCriterion("min_threshold >", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_threshold >=", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdLessThan(Integer value) {
            addCriterion("min_threshold <", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdLessThanOrEqualTo(Integer value) {
            addCriterion("min_threshold <=", value, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdIn(List<Integer> values) {
            addCriterion("min_threshold in", values, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdNotIn(List<Integer> values) {
            addCriterion("min_threshold not in", values, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdBetween(Integer value1, Integer value2) {
            addCriterion("min_threshold between", value1, value2, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMin_thresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("min_threshold not between", value1, value2, "min_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdIsNull() {
            addCriterion("max_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdIsNotNull() {
            addCriterion("max_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdEqualTo(Integer value) {
            addCriterion("max_threshold =", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdNotEqualTo(Integer value) {
            addCriterion("max_threshold <>", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdGreaterThan(Integer value) {
            addCriterion("max_threshold >", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_threshold >=", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdLessThan(Integer value) {
            addCriterion("max_threshold <", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdLessThanOrEqualTo(Integer value) {
            addCriterion("max_threshold <=", value, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdIn(List<Integer> values) {
            addCriterion("max_threshold in", values, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdNotIn(List<Integer> values) {
            addCriterion("max_threshold not in", values, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdBetween(Integer value1, Integer value2) {
            addCriterion("max_threshold between", value1, value2, "max_threshold");
            return (Criteria) this;
        }

        public Criteria andMax_thresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("max_threshold not between", value1, value2, "max_threshold");
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