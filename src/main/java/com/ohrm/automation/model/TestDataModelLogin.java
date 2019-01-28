package com.ohrm.automation.model;

public class TestDataModelLogin {

    public TestDataModelLogin() {
    }

    private String userName;
    private String userPass;

    public String getUserName() {
        return userName;
    }

    public TestDataModelLogin setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPass() {
        return userPass;
    }

    public TestDataModelLogin setUserPass(String userPass) {
        this.userPass = userPass;
        return this;
    }

}
