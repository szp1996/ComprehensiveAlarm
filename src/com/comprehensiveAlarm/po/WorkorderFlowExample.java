package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkorderFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkorderFlowExample() {
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

        public Criteria andContact_personIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContact_personIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContact_personEqualTo(String value) {
            addCriterion("contact_person =", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personGreaterThan(String value) {
            addCriterion("contact_person >", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personLessThan(String value) {
            addCriterion("contact_person <", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personLike(String value) {
            addCriterion("contact_person like", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personNotLike(String value) {
            addCriterion("contact_person not like", value, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personIn(List<String> values) {
            addCriterion("contact_person in", values, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contact_person");
            return (Criteria) this;
        }

        public Criteria andContact_personNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contact_person");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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