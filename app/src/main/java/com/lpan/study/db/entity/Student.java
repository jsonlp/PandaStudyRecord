package com.lpan.study.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lpan on 2018/3/29.
 */


@Entity(generateConstructors = false)
public class Student {

    private long stuId;

    @Index(unique = true)
    @Id
    private String stuNo;

    private String stuName;

    private String stuSex;

    private String stuScore;

    private Integer classNum;

    private Integer phoneNum;


    public Student() {
    }

    public long getStuId() {
        return this.stuId;
    }

    public void setStuId(long stuId) {
        this.stuId = stuId;
    }

    public String getStuNo() {
        return this.stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return this.stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return this.stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuScore() {
        return this.stuScore;
    }

    public void setStuScore(String stuScore) {
        this.stuScore = stuScore;
    }

    public Integer getClassNum() {
        return this.classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNo='" + stuNo + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuScore='" + stuScore + '\'' +
                ", classNum=" + classNum +
                ", phoneNum=" + phoneNum +
                '}';
    }

    public Integer getPhoneNum() {
        return this.phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }
}
