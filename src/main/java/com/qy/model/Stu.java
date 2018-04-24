package com.qy.model;

import javax.persistence.*;

@Table(name = "qy_stu")
public class Stu {
    /**
     * 学生ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 院系
     */
    private String department;

    /**
     * 邮箱地址
     */
    private String mail;

    /**
     *  头像
     */
    private String head_img;

    /**
     * 获取学生ID
     *
     * @return id - 学生ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置学生ID
     *
     * @param id 学生ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取院系
     *
     * @return department - 院系
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置院系
     *
     * @param department 院系
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取邮箱地址
     *
     * @return mail - 邮箱地址
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱地址
     *
     * @param mail 邮箱地址
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取 头像
     *
     * @return head_img -  头像
     */
    public String getHead_img() {
        return head_img;
    }

    /**
     * 设置 头像
     *
     * @param head_img  头像
     */
    public void setHead_img(String head_img) {
        this.head_img = head_img;
    }
}