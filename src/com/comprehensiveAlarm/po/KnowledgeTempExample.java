package com.comprehensiveAlarm.po;

import java.util.ArrayList;
import java.util.List;

public class KnowledgeTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KnowledgeTempExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andAbandonIsNull() {
            addCriterion("abandon is null");
            return (Criteria) this;
        }

        public Criteria andAbandonIsNotNull() {
            addCriterion("abandon is not null");
            return (Criteria) this;
        }

        public Criteria andAbandonEqualTo(Integer value) {
            addCriterion("abandon =", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotEqualTo(Integer value) {
            addCriterion("abandon <>", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonGreaterThan(Integer value) {
            addCriterion("abandon >", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonGreaterThanOrEqualTo(Integer value) {
            addCriterion("abandon >=", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonLessThan(Integer value) {
            addCriterion("abandon <", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonLessThanOrEqualTo(Integer value) {
            addCriterion("abandon <=", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonIn(List<Integer> values) {
            addCriterion("abandon in", values, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotIn(List<Integer> values) {
            addCriterion("abandon not in", values, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonBetween(Integer value1, Integer value2) {
            addCriterion("abandon between", value1, value2, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotBetween(Integer value1, Integer value2) {
            addCriterion("abandon not between", value1, value2, "abandon");
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