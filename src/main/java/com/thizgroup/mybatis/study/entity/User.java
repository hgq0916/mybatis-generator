package com.thizgroup.mybatis.study.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.id
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.username
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.password
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.phone
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.email
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.created
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.updated
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.source_type
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String source_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.nick_name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String nick_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.status
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.head_pic
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String head_pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.qq
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.account_balance
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Long account_balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.is_mobile_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String is_mobile_check;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.is_email_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String is_email_check;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.sex
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.user_level
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Integer user_level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.points
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Integer points;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.experience_value
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Integer experience_value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.birthday
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_user.last_login_time
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    private Date last_login_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.id
     *
     * @return the value of tb_user.id
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.id
     *
     * @param id the value for tb_user.id
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.username
     *
     * @return the value of tb_user.username
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.username
     *
     * @param username the value for tb_user.username
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.password
     *
     * @return the value of tb_user.password
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.password
     *
     * @param password the value for tb_user.password
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.phone
     *
     * @return the value of tb_user.phone
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.phone
     *
     * @param phone the value for tb_user.phone
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.email
     *
     * @return the value of tb_user.email
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.email
     *
     * @param email the value for tb_user.email
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.created
     *
     * @return the value of tb_user.created
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.created
     *
     * @param created the value for tb_user.created
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.updated
     *
     * @return the value of tb_user.updated
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.updated
     *
     * @param updated the value for tb_user.updated
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.source_type
     *
     * @return the value of tb_user.source_type
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getSource_type() {
        return source_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.source_type
     *
     * @param source_type the value for tb_user.source_type
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setSource_type(String source_type) {
        this.source_type = source_type == null ? null : source_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.nick_name
     *
     * @return the value of tb_user.nick_name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getNick_name() {
        return nick_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.nick_name
     *
     * @param nick_name the value for tb_user.nick_name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setNick_name(String nick_name) {
        this.nick_name = nick_name == null ? null : nick_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.name
     *
     * @return the value of tb_user.name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.name
     *
     * @param name the value for tb_user.name
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.status
     *
     * @return the value of tb_user.status
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.status
     *
     * @param status the value for tb_user.status
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.head_pic
     *
     * @return the value of tb_user.head_pic
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getHead_pic() {
        return head_pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.head_pic
     *
     * @param head_pic the value for tb_user.head_pic
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setHead_pic(String head_pic) {
        this.head_pic = head_pic == null ? null : head_pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.qq
     *
     * @return the value of tb_user.qq
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.qq
     *
     * @param qq the value for tb_user.qq
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.account_balance
     *
     * @return the value of tb_user.account_balance
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Long getAccount_balance() {
        return account_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.account_balance
     *
     * @param account_balance the value for tb_user.account_balance
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setAccount_balance(Long account_balance) {
        this.account_balance = account_balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.is_mobile_check
     *
     * @return the value of tb_user.is_mobile_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getIs_mobile_check() {
        return is_mobile_check;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.is_mobile_check
     *
     * @param is_mobile_check the value for tb_user.is_mobile_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setIs_mobile_check(String is_mobile_check) {
        this.is_mobile_check = is_mobile_check == null ? null : is_mobile_check.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.is_email_check
     *
     * @return the value of tb_user.is_email_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getIs_email_check() {
        return is_email_check;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.is_email_check
     *
     * @param is_email_check the value for tb_user.is_email_check
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setIs_email_check(String is_email_check) {
        this.is_email_check = is_email_check == null ? null : is_email_check.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.sex
     *
     * @return the value of tb_user.sex
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.sex
     *
     * @param sex the value for tb_user.sex
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.user_level
     *
     * @return the value of tb_user.user_level
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Integer getUser_level() {
        return user_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.user_level
     *
     * @param user_level the value for tb_user.user_level
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setUser_level(Integer user_level) {
        this.user_level = user_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.points
     *
     * @return the value of tb_user.points
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.points
     *
     * @param points the value for tb_user.points
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.experience_value
     *
     * @return the value of tb_user.experience_value
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Integer getExperience_value() {
        return experience_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.experience_value
     *
     * @param experience_value the value for tb_user.experience_value
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setExperience_value(Integer experience_value) {
        this.experience_value = experience_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.birthday
     *
     * @return the value of tb_user.birthday
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.birthday
     *
     * @param birthday the value for tb_user.birthday
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_user.last_login_time
     *
     * @return the value of tb_user.last_login_time
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public Date getLast_login_time() {
        return last_login_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_user.last_login_time
     *
     * @param last_login_time the value for tb_user.last_login_time
     *
     * @mbg.generated Sun Aug 11 21:29:03 CST 2019
     */
    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }
}