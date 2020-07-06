package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.List;

public class WorkorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkorderExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesIsNull() {
            addCriterion("alarm_codes is null");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesIsNotNull() {
            addCriterion("alarm_codes is not null");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesEqualTo(String value) {
            addCriterion("alarm_codes =", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesNotEqualTo(String value) {
            addCriterion("alarm_codes <>", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesGreaterThan(String value) {
            addCriterion("alarm_codes >", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesGreaterThanOrEqualTo(String value) {
            addCriterion("alarm_codes >=", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesLessThan(String value) {
            addCriterion("alarm_codes <", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesLessThanOrEqualTo(String value) {
            addCriterion("alarm_codes <=", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesLike(String value) {
            addCriterion("alarm_codes like", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesNotLike(String value) {
            addCriterion("alarm_codes not like", value, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesIn(List<String> values) {
            addCriterion("alarm_codes in", values, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesNotIn(List<String> values) {
            addCriterion("alarm_codes not in", values, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesBetween(String value1, String value2) {
            addCriterion("alarm_codes between", value1, value2, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andAlarm_codesNotBetween(String value1, String value2) {
            addCriterion("alarm_codes not between", value1, value2, "alarm_codes");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andContact_orgIsNull() {
            addCriterion("contact_org is null");
            return (Criteria) this;
        }

        public Criteria andContact_orgIsNotNull() {
            addCriterion("contact_org is not null");
            return (Criteria) this;
        }

        public Criteria andContact_orgEqualTo(String value) {
            addCriterion("contact_org =", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgNotEqualTo(String value) {
            addCriterion("contact_org <>", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgGreaterThan(String value) {
            addCriterion("contact_org >", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgGreaterThanOrEqualTo(String value) {
            addCriterion("contact_org >=", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgLessThan(String value) {
            addCriterion("contact_org <", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgLessThanOrEqualTo(String value) {
            addCriterion("contact_org <=", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgLike(String value) {
            addCriterion("contact_org like", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgNotLike(String value) {
            addCriterion("contact_org not like", value, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgIn(List<String> values) {
            addCriterion("contact_org in", values, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgNotIn(List<String> values) {
            addCriterion("contact_org not in", values, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgBetween(String value1, String value2) {
            addCriterion("contact_org between", value1, value2, "contact_org");
            return (Criteria) this;
        }

        public Criteria andContact_orgNotBetween(String value1, String value2) {
            addCriterion("contact_org not between", value1, value2, "contact_org");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idIsNull() {
            addCriterion("knowledge_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idIsNotNull() {
            addCriterion("knowledge_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idEqualTo(String value) {
            addCriterion("knowledge_id =", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idNotEqualTo(String value) {
            addCriterion("knowledge_id <>", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idGreaterThan(String value) {
            addCriterion("knowledge_id >", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idGreaterThanOrEqualTo(String value) {
            addCriterion("knowledge_id >=", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idLessThan(String value) {
            addCriterion("knowledge_id <", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idLessThanOrEqualTo(String value) {
            addCriterion("knowledge_id <=", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idLike(String value) {
            addCriterion("knowledge_id like", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idNotLike(String value) {
            addCriterion("knowledge_id not like", value, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idIn(List<String> values) {
            addCriterion("knowledge_id in", values, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idNotIn(List<String> values) {
            addCriterion("knowledge_id not in", values, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idBetween(String value1, String value2) {
            addCriterion("knowledge_id between", value1, value2, "knowledge_id");
            return (Criteria) this;
        }

        public Criteria andKnowledge_idNotBetween(String value1, String value2) {
            addCriterion("knowledge_id not between", value1, value2, "knowledge_id");
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