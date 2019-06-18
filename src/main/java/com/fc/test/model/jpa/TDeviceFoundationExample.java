package com.fc.test.model.jpa;

import java.util.ArrayList;
import java.util.List;

public class TDeviceFoundationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDeviceFoundationExample() {
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

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNull() {
            addCriterion("state_id is null");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNotNull() {
            addCriterion("state_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateIdEqualTo(String value) {
            addCriterion("state_id =", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotEqualTo(String value) {
            addCriterion("state_id <>", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThan(String value) {
            addCriterion("state_id >", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("state_id >=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThan(String value) {
            addCriterion("state_id <", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThanOrEqualTo(String value) {
            addCriterion("state_id <=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLike(String value) {
            addCriterion("state_id like", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotLike(String value) {
            addCriterion("state_id not like", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdIn(List<String> values) {
            addCriterion("state_id in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotIn(List<String> values) {
            addCriterion("state_id not in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdBetween(String value1, String value2) {
            addCriterion("state_id between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotBetween(String value1, String value2) {
            addCriterion("state_id not between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongIsNull() {
            addCriterion("device_belong is null");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongIsNotNull() {
            addCriterion("device_belong is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongEqualTo(String value) {
            addCriterion("device_belong =", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongNotEqualTo(String value) {
            addCriterion("device_belong <>", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongGreaterThan(String value) {
            addCriterion("device_belong >", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongGreaterThanOrEqualTo(String value) {
            addCriterion("device_belong >=", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongLessThan(String value) {
            addCriterion("device_belong <", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongLessThanOrEqualTo(String value) {
            addCriterion("device_belong <=", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongLike(String value) {
            addCriterion("device_belong like", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongNotLike(String value) {
            addCriterion("device_belong not like", value, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongIn(List<String> values) {
            addCriterion("device_belong in", values, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongNotIn(List<String> values) {
            addCriterion("device_belong not in", values, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongBetween(String value1, String value2) {
            addCriterion("device_belong between", value1, value2, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceBelongNotBetween(String value1, String value2) {
            addCriterion("device_belong not between", value1, value2, "deviceBelong");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXIsNull() {
            addCriterion("device_location_x is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXIsNotNull() {
            addCriterion("device_location_x is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXEqualTo(Double value) {
            addCriterion("device_location_x =", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXNotEqualTo(Double value) {
            addCriterion("device_location_x <>", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXGreaterThan(Double value) {
            addCriterion("device_location_x >", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXGreaterThanOrEqualTo(Double value) {
            addCriterion("device_location_x >=", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXLessThan(Double value) {
            addCriterion("device_location_x <", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXLessThanOrEqualTo(Double value) {
            addCriterion("device_location_x <=", value, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXIn(List<Double> values) {
            addCriterion("device_location_x in", values, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXNotIn(List<Double> values) {
            addCriterion("device_location_x not in", values, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXBetween(Double value1, Double value2) {
            addCriterion("device_location_x between", value1, value2, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationXNotBetween(Double value1, Double value2) {
            addCriterion("device_location_x not between", value1, value2, "deviceLocationX");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYIsNull() {
            addCriterion("device_location_y is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYIsNotNull() {
            addCriterion("device_location_y is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYEqualTo(Double value) {
            addCriterion("device_location_y =", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYNotEqualTo(Double value) {
            addCriterion("device_location_y <>", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYGreaterThan(Double value) {
            addCriterion("device_location_y >", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYGreaterThanOrEqualTo(Double value) {
            addCriterion("device_location_y >=", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYLessThan(Double value) {
            addCriterion("device_location_y <", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYLessThanOrEqualTo(Double value) {
            addCriterion("device_location_y <=", value, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYIn(List<Double> values) {
            addCriterion("device_location_y in", values, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYNotIn(List<Double> values) {
            addCriterion("device_location_y not in", values, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYBetween(Double value1, Double value2) {
            addCriterion("device_location_y between", value1, value2, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceLocationYNotBetween(Double value1, Double value2) {
            addCriterion("device_location_y not between", value1, value2, "deviceLocationY");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdIsNull() {
            addCriterion("device_user_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdIsNotNull() {
            addCriterion("device_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdEqualTo(String value) {
            addCriterion("device_user_id =", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdNotEqualTo(String value) {
            addCriterion("device_user_id <>", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdGreaterThan(String value) {
            addCriterion("device_user_id >", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_user_id >=", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdLessThan(String value) {
            addCriterion("device_user_id <", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdLessThanOrEqualTo(String value) {
            addCriterion("device_user_id <=", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdLike(String value) {
            addCriterion("device_user_id like", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdNotLike(String value) {
            addCriterion("device_user_id not like", value, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdIn(List<String> values) {
            addCriterion("device_user_id in", values, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdNotIn(List<String> values) {
            addCriterion("device_user_id not in", values, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdBetween(String value1, String value2) {
            addCriterion("device_user_id between", value1, value2, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceUserIdNotBetween(String value1, String value2) {
            addCriterion("device_user_id not between", value1, value2, "deviceUserId");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthIsNull() {
            addCriterion("device_health is null");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthIsNotNull() {
            addCriterion("device_health is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthEqualTo(Integer value) {
            addCriterion("device_health =", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthNotEqualTo(Integer value) {
            addCriterion("device_health <>", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthGreaterThan(Integer value) {
            addCriterion("device_health >", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_health >=", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthLessThan(Integer value) {
            addCriterion("device_health <", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthLessThanOrEqualTo(Integer value) {
            addCriterion("device_health <=", value, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthIn(List<Integer> values) {
            addCriterion("device_health in", values, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthNotIn(List<Integer> values) {
            addCriterion("device_health not in", values, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthBetween(Integer value1, Integer value2) {
            addCriterion("device_health between", value1, value2, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andDeviceHealthNotBetween(Integer value1, Integer value2) {
            addCriterion("device_health not between", value1, value2, "deviceHealth");
            return (Criteria) this;
        }

        public Criteria andStateTmpIsNull() {
            addCriterion("state_tmp is null");
            return (Criteria) this;
        }

        public Criteria andStateTmpIsNotNull() {
            addCriterion("state_tmp is not null");
            return (Criteria) this;
        }

        public Criteria andStateTmpEqualTo(Float value) {
            addCriterion("state_tmp =", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpNotEqualTo(Float value) {
            addCriterion("state_tmp <>", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpGreaterThan(Float value) {
            addCriterion("state_tmp >", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpGreaterThanOrEqualTo(Float value) {
            addCriterion("state_tmp >=", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpLessThan(Float value) {
            addCriterion("state_tmp <", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpLessThanOrEqualTo(Float value) {
            addCriterion("state_tmp <=", value, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpIn(List<Float> values) {
            addCriterion("state_tmp in", values, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpNotIn(List<Float> values) {
            addCriterion("state_tmp not in", values, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpBetween(Float value1, Float value2) {
            addCriterion("state_tmp between", value1, value2, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateTmpNotBetween(Float value1, Float value2) {
            addCriterion("state_tmp not between", value1, value2, "stateTmp");
            return (Criteria) this;
        }

        public Criteria andStateHumIsNull() {
            addCriterion("state_hum is null");
            return (Criteria) this;
        }

        public Criteria andStateHumIsNotNull() {
            addCriterion("state_hum is not null");
            return (Criteria) this;
        }

        public Criteria andStateHumEqualTo(Float value) {
            addCriterion("state_hum =", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumNotEqualTo(Float value) {
            addCriterion("state_hum <>", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumGreaterThan(Float value) {
            addCriterion("state_hum >", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumGreaterThanOrEqualTo(Float value) {
            addCriterion("state_hum >=", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumLessThan(Float value) {
            addCriterion("state_hum <", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumLessThanOrEqualTo(Float value) {
            addCriterion("state_hum <=", value, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumIn(List<Float> values) {
            addCriterion("state_hum in", values, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumNotIn(List<Float> values) {
            addCriterion("state_hum not in", values, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumBetween(Float value1, Float value2) {
            addCriterion("state_hum between", value1, value2, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStateHumNotBetween(Float value1, Float value2) {
            addCriterion("state_hum not between", value1, value2, "stateHum");
            return (Criteria) this;
        }

        public Criteria andStatePowerIsNull() {
            addCriterion("state_power is null");
            return (Criteria) this;
        }

        public Criteria andStatePowerIsNotNull() {
            addCriterion("state_power is not null");
            return (Criteria) this;
        }

        public Criteria andStatePowerEqualTo(Float value) {
            addCriterion("state_power =", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerNotEqualTo(Float value) {
            addCriterion("state_power <>", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerGreaterThan(Float value) {
            addCriterion("state_power >", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerGreaterThanOrEqualTo(Float value) {
            addCriterion("state_power >=", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerLessThan(Float value) {
            addCriterion("state_power <", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerLessThanOrEqualTo(Float value) {
            addCriterion("state_power <=", value, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerIn(List<Float> values) {
            addCriterion("state_power in", values, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerNotIn(List<Float> values) {
            addCriterion("state_power not in", values, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerBetween(Float value1, Float value2) {
            addCriterion("state_power between", value1, value2, "statePower");
            return (Criteria) this;
        }

        public Criteria andStatePowerNotBetween(Float value1, Float value2) {
            addCriterion("state_power not between", value1, value2, "statePower");
            return (Criteria) this;
        }

        public Criteria andStateIsfireIsNull() {
            addCriterion("state_isfire is null");
            return (Criteria) this;
        }

        public Criteria andStateIsfireIsNotNull() {
            addCriterion("state_isfire is not null");
            return (Criteria) this;
        }

        public Criteria andStateIsfireEqualTo(Integer value) {
            addCriterion("state_isfire =", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireNotEqualTo(Integer value) {
            addCriterion("state_isfire <>", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireGreaterThan(Integer value) {
            addCriterion("state_isfire >", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireGreaterThanOrEqualTo(Integer value) {
            addCriterion("state_isfire >=", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireLessThan(Integer value) {
            addCriterion("state_isfire <", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireLessThanOrEqualTo(Integer value) {
            addCriterion("state_isfire <=", value, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireIn(List<Integer> values) {
            addCriterion("state_isfire in", values, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireNotIn(List<Integer> values) {
            addCriterion("state_isfire not in", values, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireBetween(Integer value1, Integer value2) {
            addCriterion("state_isfire between", value1, value2, "stateIsfire");
            return (Criteria) this;
        }

        public Criteria andStateIsfireNotBetween(Integer value1, Integer value2) {
            addCriterion("state_isfire not between", value1, value2, "stateIsfire");
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