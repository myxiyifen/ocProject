package com.online.college.core.course.domain;

import com.online.college.common.orm.BaseEntity;

import java.math.BigDecimal;

public class Course extends BaseEntity {
    private static final long serialVersionUID = -935786327879089574L;

    private String name;
    private String type;
    private String classify;
    private String classifyName;
    private String subClassify;
    private String subClassifyName;
    private String direction;
    private String username;//归属人
    /**
     * 课程级别：1-初级，2-中级，3-高级
     */
    private Integer level;
    /**
     * 是否免费
     */
    private Integer free;

    /**
     * 课程价格
     */
    private BigDecimal price;

    private String time;//时长
    /**
     * 未上架-0，上架-1
     */
    private Integer onsale;

    private String brief;//课程描述

    private String picture;//课程图片
    /**
     * 未推荐-0，推荐-1
     */
    private Integer recommend;

    private Integer weight;//权重

    private Integer studyCount;//学习人数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getSubClassify() {
        return subClassify;
    }

    public void setSubClassify(String subClassify) {
        this.subClassify = subClassify;
    }

    public String getSubClassifyName() {
        return subClassifyName;
    }

    public void setSubClassifyName(String subClassifyName) {
        this.subClassifyName = subClassifyName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getOnsale() {
        return onsale;
    }

    public void setOnsale(Integer onsale) {
        this.onsale = onsale;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getRecommend() {
        return recommend;
    }

    public void setRecommend(Integer recommend) {
        this.recommend = recommend;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getStudyCount() {
        return studyCount;
    }

    public void setStudyCount(Integer studyCount) {
        this.studyCount = studyCount;
    }
}
