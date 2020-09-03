package com.entity;

import java.util.Date;

public class UserMsg {
    private Integer   id;
    private String personName;
    private String personAccount;
    private String personPassword;
    private String personPhone;
    private String personEmail;
    private String personSex;
    private Integer personPoints;
    private String personRank;
    private String personState;
    private Date  registerDate;

    public UserMsg() {
    }

    public UserMsg(Integer id, String personName, String personAccount, String personPassword, String personPhone, String personEmail, String personSex, Integer personPoints, String personRank, String personState, Date registerDate) {
        this.id = id;
        this.personName = personName;
        this.personAccount = personAccount;
        this.personPassword = personPassword;
        this.personPhone = personPhone;
        this.personEmail = personEmail;
        this.personSex = personSex;
        this.personPoints = personPoints;
        this.personRank = personRank;
        this.personState = personState;
        this.registerDate = registerDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAccount() {
        return personAccount;
    }

    public void setPersonAccount(String personAccount) {
        this.personAccount = personAccount;
    }

    public String getPersonPassword() {
        return personPassword;
    }

    public void setPersonPassword(String personPassword) {
        this.personPassword = personPassword;
    }

    public String getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(String personPhone) {
        this.personPhone = personPhone;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public Integer getPersonPoints() {
        return personPoints;
    }

    public void setPersonPoints(Integer personPoints) {
        this.personPoints = personPoints;
    }

    public String getPersonRank() {
        return personRank;
    }

    public void setPersonRank(String personRank) {
        this.personRank = personRank;
    }

    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
    }

    public Date getPersonDate() {
        return registerDate;
    }

    public void setPersonDate(Date personDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "UserMsg{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                ", personAccount='" + personAccount + '\'' +
                ", personPassword='" + personPassword + '\'' +
                ", personPhone='" + personPhone + '\'' +
                ", personEmail='" + personEmail + '\'' +
                ", personSex='" + personSex + '\'' +
                ", personPoints=" + personPoints +
                ", personRank='" + personRank + '\'' +
                ", personState='" + personState + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}