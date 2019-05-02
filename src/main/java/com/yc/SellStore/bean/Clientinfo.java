package com.yc.SellStore.bean;

import javax.validation.constraints.NotEmpty;

public class Clientinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientInfo.clientid
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    private Integer clientid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientInfo.clientname
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    @NotEmpty(message="用户名不能为空")
    private String clientname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientInfo.pwd
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    @NotEmpty(message="密码不能为空")
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientInfo.phone
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ClientInfo.sex
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    private String sex;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientInfo.clientid
     *
     * @return the value of ClientInfo.clientid
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public Integer getClientid() {
        return clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientInfo.clientid
     *
     * @param clientid the value for ClientInfo.clientid
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientInfo.clientname
     *
     * @return the value of ClientInfo.clientname
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public String getClientname() {
        return clientname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientInfo.clientname
     *
     * @param clientname the value for ClientInfo.clientname
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientInfo.pwd
     *
     * @return the value of ClientInfo.pwd
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientInfo.pwd
     *
     * @param pwd the value for ClientInfo.pwd
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientInfo.phone
     *
     * @return the value of ClientInfo.phone
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientInfo.phone
     *
     * @param phone the value for ClientInfo.phone
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ClientInfo.sex
     *
     * @return the value of ClientInfo.sex
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ClientInfo.sex
     *
     * @param sex the value for ClientInfo.sex
     *
     * @mbg.generated Sat Apr 27 19:50:22 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
}