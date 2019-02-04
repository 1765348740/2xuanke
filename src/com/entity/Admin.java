package com.entity;

public class Admin {
    private Integer UserId;
    private String UserName;
    private String UserPw;

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPw() {
        return UserPw;
    }

    public void setUserPw(String userPw) {
        UserPw = userPw;
    }

    public Admin() {
        super();
    }

    public Admin(String userName, String userPw) {
        UserName = userName;
        UserPw = userPw;
    }
}
