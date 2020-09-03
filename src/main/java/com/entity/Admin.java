package com.entity;

public class Admin {
    private int id;
    private  String adminAccount;
    private  String adminPassword;
    private int roleId;

    public Admin() {
    }

    public Admin(int id, String adminAccount, String adminPassword, int roleId) {
        this.id = id;
        this.adminAccount = adminAccount;
        this.adminPassword = adminPassword;
        this.roleId = roleId;
    }

    public Admin(String adminAccount) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
