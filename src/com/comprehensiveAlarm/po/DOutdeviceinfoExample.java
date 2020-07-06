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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNull() {
            addCriterion("DEVICEID is null");
            return (Criteria) this;
        }

        public Criteria andDeviceidIsNotNull() {
            addCriterion("DEVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceidEqualTo(String value) {
            addCriterion("DEVICEID =", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotEqualTo(String value) {
            addCriterion("DEVICEID <>", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThan(String value) {
            addCriterion("DEVICEID >", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICEID >=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThan(String value) {
            addCriterion("DEVICEID <", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLessThanOrEqualTo(String value) {
            addCriterion("DEVICEID <=", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidLike(String value) {
            addCriterion("DEVICEID like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotLike(String value) {
            addCriterion("DEVICEID not like", value, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidIn(List<String> values) {
            addCriterion("DEVICEID in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotIn(List<String> values) {
            addCriterion("DEVICEID not in", values, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidBetween(String value1, String value2) {
            addCriterion("DEVICEID between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDeviceidNotBetween(String value1, String value2) {
            addCriterion("DEVICEID not between", value1, value2, "deviceid");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("DEVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("DEVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("DEVICENAME =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("DEVICENAME <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("DEVICENAME >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENAME >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("DEVICENAME <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("DEVICENAME <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("DEVICENAME like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("DEVICENAME not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("DEVICENAME in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("DEVICENAME not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("DEVICENAME between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("DEVICENAME not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("MODEL is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("MODEL =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("MODEL <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("MODEL >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("MODEL <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("MODEL <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("MODEL like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("MODEL not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("MODEL in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("MODEL not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("MODEL between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("MODEL not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCivilcodeIsNull() {
            addCriterion("CIVILCODE is null");
            return (Criteria) this;
        }

        public Criteria andCivilcodeIsNotNull() {
            addCriterion("CIVILCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilcodeEqualTo(String value) {
            addCriterion("CIVILCODE =", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeNotEqualTo(String value) {
            addCriterion("CIVILCODE <>", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeGreaterThan(String value) {
            addCriterion("CIVILCODE >", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIVILCODE >=", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeLessThan(String value) {
            addCriterion("CIVILCODE <", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeLessThanOrEqualTo(String value) {
            addCriterion("CIVILCODE <=", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeLike(String value) {
            addCriterion("CIVILCODE like", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeNotLike(String value) {
            addCriterion("CIVILCODE not like", value, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeIn(List<String> values) {
            addCriterion("CIVILCODE in", values, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeNotIn(List<String> values) {
            addCriterion("CIVILCODE not in", values, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeBetween(String value1, String value2) {
            addCriterion("CIVILCODE between", value1, value2, "civilcode");
            return (Criteria) this;
        }

        public Criteria andCivilcodeNotBetween(String value1, String value2) {
            addCriterion("CIVILCODE not between", value1, value2, "civilcode");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("BLOCK is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("BLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(String value) {
            addCriterion("BLOCK =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(String value) {
            addCriterion("BLOCK <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(String value) {
            addCriterion("BLOCK >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(String value) {
            addCriterion("BLOCK >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(String value) {
            addCriterion("BLOCK <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(String value) {
            addCriterion("BLOCK <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLike(String value) {
            addCriterion("BLOCK like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotLike(String value) {
            addCriterion("BLOCK not like", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<String> values) {
            addCriterion("BLOCK in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<String> values) {
            addCriterion("BLOCK not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(String value1, String value2) {
            addCriterion("BLOCK between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(String value1, String value2) {
            addCriterion("BLOCK not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("PARENTID is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("PARENTID is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("PARENTID =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("PARENTID <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("PARENTID >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTID >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("PARENTID <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("PARENTID <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("PARENTID like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("PARENTID not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("PARENTID in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("PARENTID not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("PARENTID between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("PARENTID not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andSafetywayIsNull() {
            addCriterion("SAFETYWAY is null");
            return (Criteria) this;
        }

        public Criteria andSafetywayIsNotNull() {
            addCriterion("SAFETYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andSafetywayEqualTo(Integer value) {
            addCriterion("SAFETYWAY =", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayNotEqualTo(Integer value) {
            addCriterion("SAFETYWAY <>", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayGreaterThan(Integer value) {
            addCriterion("SAFETYWAY >", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAFETYWAY >=", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayLessThan(Integer value) {
            addCriterion("SAFETYWAY <", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayLessThanOrEqualTo(Integer value) {
            addCriterion("SAFETYWAY <=", value, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayIn(List<Integer> values) {
            addCriterion("SAFETYWAY in", values, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayNotIn(List<Integer> values) {
            addCriterion("SAFETYWAY not in", values, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayBetween(Integer value1, Integer value2) {
            addCriterion("SAFETYWAY between", value1, value2, "safetyway");
            return (Criteria) this;
        }

        public Criteria andSafetywayNotBetween(Integer value1, Integer value2) {
            addCriterion("SAFETYWAY not between", value1, value2, "safetyway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayIsNull() {
            addCriterion("REGISTERWAY is null");
            return (Criteria) this;
        }

        public Criteria andRegisterwayIsNotNull() {
            addCriterion("REGISTERWAY is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterwayEqualTo(Integer value) {
            addCriterion("REGISTERWAY =", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayNotEqualTo(Integer value) {
            addCriterion("REGISTERWAY <>", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayGreaterThan(Integer value) {
            addCriterion("REGISTERWAY >", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayGreaterThanOrEqualTo(Integer value) {
            addCriterion("REGISTERWAY >=", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayLessThan(Integer value) {
            addCriterion("REGISTERWAY <", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayLessThanOrEqualTo(Integer value) {
            addCriterion("REGISTERWAY <=", value, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayIn(List<Integer> values) {
            addCriterion("REGISTERWAY in", values, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayNotIn(List<Integer> values) {
            addCriterion("REGISTERWAY not in", values, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayBetween(Integer value1, Integer value2) {
            addCriterion("REGISTERWAY between", value1, value2, "registerway");
            return (Criteria) this;
        }

        public Criteria andRegisterwayNotBetween(Integer value1, Integer value2) {
            addCriterion("REGISTERWAY not between", value1, value2, "registerway");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNull() {
            addCriterion("CERTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCertnumIsNotNull() {
            addCriterion("CERTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertnumEqualTo(String value) {
            addCriterion("CERTNUM =", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotEqualTo(String value) {
            addCriterion("CERTNUM <>", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThan(String value) {
            addCriterion("CERTNUM >", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumGreaterThanOrEqualTo(String value) {
            addCriterion("CERTNUM >=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThan(String value) {
            addCriterion("CERTNUM <", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLessThanOrEqualTo(String value) {
            addCriterion("CERTNUM <=", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumLike(String value) {
            addCriterion("CERTNUM like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotLike(String value) {
            addCriterion("CERTNUM not like", value, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumIn(List<String> values) {
            addCriterion("CERTNUM in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotIn(List<String> values) {
            addCriterion("CERTNUM not in", values, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumBetween(String value1, String value2) {
            addCriterion("CERTNUM between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertnumNotBetween(String value1, String value2) {
            addCriterion("CERTNUM not between", value1, value2, "certnum");
            return (Criteria) this;
        }

        public Criteria andCertifiableIsNull() {
            addCriterion("CERTIFIABLE is null");
            return (Criteria) this;
        }

        public Criteria andCertifiableIsNotNull() {
            addCriterion("CERTIFIABLE is not null");
            return (Criteria) this;
        }

        public Criteria andCertifiableEqualTo(Integer value) {
            addCriterion("CERTIFIABLE =", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableNotEqualTo(Integer value) {
            addCriterion("CERTIFIABLE <>", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableGreaterThan(Integer value) {
            addCriterion("CERTIFIABLE >", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableGreaterThanOrEqualTo(Integer value) {
            addCriterion("CERTIFIABLE >=", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableLessThan(Integer value) {
            addCriterion("CERTIFIABLE <", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableLessThanOrEqualTo(Integer value) {
            addCriterion("CERTIFIABLE <=", value, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableIn(List<Integer> values) {
            addCriterion("CERTIFIABLE in", values, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableNotIn(List<Integer> values) {
            addCriterion("CERTIFIABLE not in", values, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFIABLE between", value1, value2, "certifiable");
            return (Criteria) this;
        }

        public Criteria andCertifiableNotBetween(Integer value1, Integer value2) {
            addCriterion("CERTIFIABLE not between", value1, value2, "certifiable");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNull() {
            addCriterion("ERRCODE is null");
            return (Criteria) this;
        }

        public Criteria andErrcodeIsNotNull() {
            addCriterion("ERRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andErrcodeEqualTo(Integer value) {
            addCriterion("ERRCODE =", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotEqualTo(Integer value) {
            addCriterion("ERRCODE <>", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThan(Integer value) {
            addCriterion("ERRCODE >", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERRCODE >=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThan(Integer value) {
            addCriterion("ERRCODE <", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeLessThanOrEqualTo(Integer value) {
            addCriterion("ERRCODE <=", value, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeIn(List<Integer> values) {
            addCriterion("ERRCODE in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotIn(List<Integer> values) {
            addCriterion("ERRCODE not in", values, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeBetween(Integer value1, Integer value2) {
            addCriterion("ERRCODE between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andErrcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ERRCODE not between", value1, value2, "errcode");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andSecrecyIsNull() {
            addCriterion("SECRECY is null");
            return (Criteria) this;
        }

        public Criteria andSecrecyIsNotNull() {
            addCriterion("SECRECY is not null");
            return (Criteria) this;
        }

        public Criteria andSecrecyEqualTo(Integer value) {
            addCriterion("SECRECY =", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyNotEqualTo(Integer value) {
            addCriterion("SECRECY <>", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyGreaterThan(Integer value) {
            addCriterion("SECRECY >", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECRECY >=", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyLessThan(Integer value) {
            addCriterion("SECRECY <", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyLessThanOrEqualTo(Integer value) {
            addCriterion("SECRECY <=", value, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyIn(List<Integer> values) {
            addCriterion("SECRECY in", values, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyNotIn(List<Integer> values) {
            addCriterion("SECRECY not in", values, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyBetween(Integer value1, Integer value2) {
            addCriterion("SECRECY between", value1, value2, "secrecy");
            return (Criteria) this;
        }

        public Criteria andSecrecyNotBetween(Integer value1, Integer value2) {
            addCriterion("SECRECY not between", value1, value2, "secrecy");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("DEVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("DEVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(String value) {
            addCriterion("DEVICETYPE =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(String value) {
            addCriterion("DEVICETYPE <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(String value) {
            addCriterion("DEVICETYPE >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(String value) {
            addCriterion("DEVICETYPE <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLike(String value) {
            addCriterion("DEVICETYPE like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotLike(String value) {
            addCriterion("DEVICETYPE not like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<String> values) {
            addCriterion("DEVICETYPE in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<String> values) {
            addCriterion("DEVICETYPE not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(String value1, String value2) {
            addCriterion("DEVICETYPE between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(String value1, String value2) {
            addCriterion("DEVICETYPE not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourcecenterIsNull() {
            addCriterion("SOURCECENTER is null");
            return (Criteria) this;
        }

        public Criteria andSourcecenterIsNotNull() {
            addCriterion("SOURCECENTER is not null");
            return (Criteria) this;
        }

        public Criteria andSourcecenterEqualTo(String value) {
            addCriterion("SOURCECENTER =", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterNotEqualTo(String value) {
            addCriterion("SOURCECENTER <>", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterGreaterThan(String value) {
            addCriterion("SOURCECENTER >", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCECENTER >=", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterLessThan(String value) {
            addCriterion("SOURCECENTER <", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterLessThanOrEqualTo(String value) {
            addCriterion("SOURCECENTER <=", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterLike(String value) {
            addCriterion("SOURCECENTER like", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterNotLike(String value) {
            addCriterion("SOURCECENTER not like", value, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterIn(List<String> values) {
            addCriterion("SOURCECENTER in", values, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterNotIn(List<String> values) {
            addCriterion("SOURCECENTER not in", values, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterBetween(String value1, String value2) {
            addCriterion("SOURCECENTER between", value1, value2, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andSourcecenterNotBetween(String value1, String value2) {
            addCriterion("SOURCECENTER not between", value1, value2, "sourcecenter");
            return (Criteria) this;
        }

        public Criteria andIswithchildIsNull() {
            addCriterion("ISWITHCHILD is null");
            return (Criteria) this;
        }

        public Criteria andIswithchildIsNotNull() {
            addCriterion("ISWITHCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andIswithchildEqualTo(String value) {
            addCriterion("ISWITHCHILD =", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildNotEqualTo(String value) {
            addCriterion("ISWITHCHILD <>", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildGreaterThan(String value) {
            addCriterion("ISWITHCHILD >", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildGreaterThanOrEqualTo(String value) {
            addCriterion("ISWITHCHILD >=", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildLessThan(String value) {
            addCriterion("ISWITHCHILD <", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildLessThanOrEqualTo(String value) {
            addCriterion("ISWITHCHILD <=", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildLike(String value) {
            addCriterion("ISWITHCHILD like", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildNotLike(String value) {
            addCriterion("ISWITHCHILD not like", value, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildIn(List<String> values) {
            addCriterion("ISWITHCHILD in", values, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildNotIn(List<String> values) {
            addCriterion("ISWITHCHILD not in", values, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildBetween(String value1, String value2) {
            addCriterion("ISWITHCHILD between", value1, value2, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andIswithchildNotBetween(String value1, String value2) {
            addCriterion("ISWITHCHILD not between", value1, value2, "iswithchild");
            return (Criteria) this;
        }

        public Criteria andCameratypeIsNull() {
            addCriterion("CAMERATYPE is null");
            return (Criteria) this;
        }

        public Criteria andCameratypeIsNotNull() {
            addCriterion("CAMERATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCameratypeEqualTo(String value) {
            addCriterion("CAMERATYPE =", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotEqualTo(String value) {
            addCriterion("CAMERATYPE <>", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeGreaterThan(String value) {
            addCriterion("CAMERATYPE >", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeGreaterThanOrEqualTo(String value) {
            addCriterion("CAMERATYPE >=", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeLessThan(String value) {
            addCriterion("CAMERATYPE <", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeLessThanOrEqualTo(String value) {
            addCriterion("CAMERATYPE <=", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeLike(String value) {
            addCriterion("CAMERATYPE like", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotLike(String value) {
            addCriterion("CAMERATYPE not like", value, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeIn(List<String> values) {
            addCriterion("CAMERATYPE in", values, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotIn(List<String> values) {
            addCriterion("CAMERATYPE not in", values, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeBetween(String value1, String value2) {
            addCriterion("CAMERATYPE between", value1, value2, "cameratype");
            return (Criteria) this;
        }

        public Criteria andCameratypeNotBetween(String value1, String value2) {
            addCriterion("CAMERATYPE not between", value1, value2, "cameratype");
            return (Criteria) this;
        }

        public Criteria andPtztypeIsNull() {
            addCriterion("PTZTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPtztypeIsNotNull() {
            addCriterion("PTZTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPtztypeEqualTo(String value) {
            addCriterion("PTZTYPE =", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotEqualTo(String value) {
            addCriterion("PTZTYPE <>", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeGreaterThan(String value) {
            addCriterion("PTZTYPE >", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeGreaterThanOrEqualTo(String value) {
            addCriterion("PTZTYPE >=", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeLessThan(String value) {
            addCriterion("PTZTYPE <", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeLessThanOrEqualTo(String value) {
            addCriterion("PTZTYPE <=", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeLike(String value) {
            addCriterion("PTZTYPE like", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotLike(String value) {
            addCriterion("PTZTYPE not like", value, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeIn(List<String> values) {
            addCriterion("PTZTYPE in", values, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotIn(List<String> values) {
            addCriterion("PTZTYPE not in", values, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeBetween(String value1, String value2) {
            addCriterion("PTZTYPE between", value1, value2, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPtztypeNotBetween(String value1, String value2) {
            addCriterion("PTZTYPE not between", value1, value2, "ptztype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeIsNull() {
            addCriterion("POSITIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPositiontypeIsNotNull() {
            addCriterion("POSITIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPositiontypeEqualTo(String value) {
            addCriterion("POSITIONTYPE =", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeNotEqualTo(String value) {
            addCriterion("POSITIONTYPE <>", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeGreaterThan(String value) {
            addCriterion("POSITIONTYPE >", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("POSITIONTYPE >=", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeLessThan(String value) {
            addCriterion("POSITIONTYPE <", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeLessThanOrEqualTo(String value) {
            addCriterion("POSITIONTYPE <=", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeLike(String value) {
            addCriterion("POSITIONTYPE like", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeNotLike(String value) {
            addCriterion("POSITIONTYPE not like", value, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeIn(List<String> values) {
            addCriterion("POSITIONTYPE in", values, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeNotIn(List<String> values) {
            addCriterion("POSITIONTYPE not in", values, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeBetween(String value1, String value2) {
            addCriterion("POSITIONTYPE between", value1, value2, "positiontype");
            return (Criteria) this;
        }

        public Criteria andPositiontypeNotBetween(String value1, String value2) {
            addCriterion("POSITIONTYPE not between", value1, value2, "positiontype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("ROOMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("ROOMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("ROOMTYPE =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("ROOMTYPE <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("ROOMTYPE >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMTYPE >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("ROOMTYPE <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("ROOMTYPE <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("ROOMTYPE like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("ROOMTYPE not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("ROOMTYPE in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("ROOMTYPE not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("ROOMTYPE between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("ROOMTYPE not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNull() {
            addCriterion("USETYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNotNull() {
            addCriterion("USETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsetypeEqualTo(String value) {
            addCriterion("USETYPE =", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotEqualTo(String value) {
            addCriterion("USETYPE <>", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThan(String value) {
            addCriterion("USETYPE >", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("USETYPE >=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThan(String value) {
            addCriterion("USETYPE <", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThanOrEqualTo(String value) {
            addCriterion("USETYPE <=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLike(String value) {
            addCriterion("USETYPE like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotLike(String value) {
            addCriterion("USETYPE not like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIn(List<String> values) {
            addCriterion("USETYPE in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotIn(List<String> values) {
            addCriterion("USETYPE not in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeBetween(String value1, String value2) {
            addCriterion("USETYPE between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotBetween(String value1, String value2) {
            addCriterion("USETYPE not between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeIsNull() {
            addCriterion("SUPPLYLIGHTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeIsNotNull() {
            addCriterion("SUPPLYLIGHTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE =", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeNotEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE <>", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeGreaterThan(String value) {
            addCriterion("SUPPLYLIGHTTYPE >", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE >=", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeLessThan(String value) {
            addCriterion("SUPPLYLIGHTTYPE <", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLYLIGHTTYPE <=", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeLike(String value) {
            addCriterion("SUPPLYLIGHTTYPE like", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeNotLike(String value) {
            addCriterion("SUPPLYLIGHTTYPE not like", value, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeIn(List<String> values) {
            addCriterion("SUPPLYLIGHTTYPE in", values, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeNotIn(List<String> values) {
            addCriterion("SUPPLYLIGHTTYPE not in", values, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeBetween(String value1, String value2) {
            addCriterion("SUPPLYLIGHTTYPE between", value1, value2, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andSupplylighttypeNotBetween(String value1, String value2) {
            addCriterion("SUPPLYLIGHTTYPE not between", value1, value2, "supplylighttype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeIsNull() {
            addCriterion("DIRECTIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeIsNotNull() {
            addCriterion("DIRECTIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeEqualTo(String value) {
            addCriterion("DIRECTIONTYPE =", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeNotEqualTo(String value) {
            addCriterion("DIRECTIONTYPE <>", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeGreaterThan(String value) {
            addCriterion("DIRECTIONTYPE >", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECTIONTYPE >=", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeLessThan(String value) {
            addCriterion("DIRECTIONTYPE <", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeLessThanOrEqualTo(String value) {
            addCriterion("DIRECTIONTYPE <=", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeLike(String value) {
            addCriterion("DIRECTIONTYPE like", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeNotLike(String value) {
            addCriterion("DIRECTIONTYPE not like", value, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeIn(List<String> values) {
            addCriterion("DIRECTIONTYPE in", values, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeNotIn(List<String> values) {
            addCriterion("DIRECTIONTYPE not in", values, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeBetween(String value1, String value2) {
            addCriterion("DIRECTIONTYPE between", value1, value2, "directiontype");
            return (Criteria) this;
        }

        public Criteria andDirectiontypeNotBetween(String value1, String value2) {
            addCriterion("DIRECTIONTYPE not between", value1, value2, "directiontype");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andStreamencryptIsNull() {
            addCriterion("STREAMENCRYPT is null");
            return (Criteria) this;
        }

        public Criteria andStreamencryptIsNotNull() {
            addCriterion("STREAMENCRYPT is not null");
            return (Criteria) this;
        }

        public Criteria andStreamencryptEqualTo(String value) {
            addCriterion("STREAMENCRYPT =", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptNotEqualTo(String value) {
            addCriterion("STREAMENCRYPT <>", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptGreaterThan(String value) {
            addCriterion("STREAMENCRYPT >", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptGreaterThanOrEqualTo(String value) {
            addCriterion("STREAMENCRYPT >=", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptLessThan(String value) {
            addCriterion("STREAMENCRYPT <", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptLessThanOrEqualTo(String value) {
            addCriterion("STREAMENCRYPT <=", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptLike(String value) {
            addCriterion("STREAMENCRYPT like", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptNotLike(String value) {
            addCriterion("STREAMENCRYPT not like", value, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptIn(List<String> values) {
            addCriterion("STREAMENCRYPT in", values, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptNotIn(List<String> values) {
            addCriterion("STREAMENCRYPT not in", values, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptBetween(String value1, String value2) {
            addCriterion("STREAMENCRYPT between", value1, value2, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andStreamencryptNotBetween(String value1, String value2) {
            addCriterion("STREAMENCRYPT not between", value1, value2, "streamencrypt");
            return (Criteria) this;
        }

        public Criteria andIscollectedIsNull() {
            addCriterion("ISCOLLECTED is null");
            return (Criteria) this;
        }

        public Criteria andIscollectedIsNotNull() {
            addCriterion("ISCOLLECTED is not null");
            return (Criteria) this;
        }

        public Criteria andIscollectedEqualTo(String value) {
            addCriterion("ISCOLLECTED =", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedNotEqualTo(String value) {
            addCriterion("ISCOLLECTED <>", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedGreaterThan(String value) {
            addCriterion("ISCOLLECTED >", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedGreaterThanOrEqualTo(String value) {
            addCriterion("ISCOLLECTED >=", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedLessThan(String value) {
            addCriterion("ISCOLLECTED <", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedLessThanOrEqualTo(String value) {
            addCriterion("ISCOLLECTED <=", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedLike(String value) {
            addCriterion("ISCOLLECTED like", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedNotLike(String value) {
            addCriterion("ISCOLLECTED not like", value, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedIn(List<String> values) {
            addCriterion("ISCOLLECTED in", values, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedNotIn(List<String> values) {
            addCriterion("ISCOLLECTED not in", values, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedBetween(String value1, String value2) {
            addCriterion("ISCOLLECTED between", value1, value2, "iscollected");
            return (Criteria) this;
        }

        public Criteria andIscollectedNotBetween(String value1, String value2) {
            addCriterion("ISCOLLECTED not between", value1, value2, "iscollected");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNull() {
            addCriterion("OFFLINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNotNull() {
            addCriterion("OFFLINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeEqualTo(String value) {
            addCriterion("OFFLINE_TIME =", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotEqualTo(String value) {
            addCriterion("OFFLINE_TIME <>", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThan(String value) {
            addCriterion("OFFLINE_TIME >", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OFFLINE_TIME >=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThan(String value) {
            addCriterion("OFFLINE_TIME <", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThanOrEqualTo(String value) {
            addCriterion("OFFLINE_TIME <=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLike(String value) {
            addCriterion("OFFLINE_TIME like", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotLike(String value) {
            addCriterion("OFFLINE_TIME not like", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIn(List<String> values) {
            addCriterion("OFFLINE_TIME in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotIn(List<String> values) {
            addCriterion("OFFLINE_TIME not in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeBetween(String value1, String value2) {
            addCriterion("OFFLINE_TIME between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotBetween(String value1, String value2) {
            addCriterion("OFFLINE_TIME not between", value1, value2, "offlineTime");
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