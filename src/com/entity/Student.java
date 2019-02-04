package com.entity;

public class Student {

    private Integer Id;
    private String XueHao;
    private String XingMing;
    private String XingBie;
    private String NianLing;
    private String BanJi;
    private String LoginName;
    private String LoginPw;
    private String del;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getXueHao() {
        return XueHao;
    }

    public void setXueHao(String xueHao) {
        XueHao = xueHao;
    }

    public String getXingMing() {
        return XingMing;
    }

    public void setXingMing(String xingMing) {
        XingMing = xingMing;
    }

    public String getXingBie() {
        return XingBie;
    }

    public void setXingBie(String xingBie) {
        XingBie = xingBie;
    }

    public String getNianLing() {
        return NianLing;
    }

    public void setNianLing(String nianLing) {
        NianLing = nianLing;
    }

    public String getBanJi() {
        return BanJi;
    }

    public void setBanJi(String banJi) {
        BanJi = banJi;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getLoginPw() {
        return LoginPw;
    }

    public void setLoginPw(String loginPw) {
        LoginPw = loginPw;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }
    public Student() {
        super();
    }

    public Student( String loginName, String loginPw) {

        LoginName = loginName;
        LoginPw = loginPw;
    }

    public Student(String xueHao, String xingMing, String xingBie, String nianLing, String banJi, String loginName, String loginPw) {
        XueHao = xueHao;
        XingMing = xingMing;
        XingBie = xingBie;
        NianLing = nianLing;
        BanJi = banJi;
        LoginName = loginName;
        LoginPw = loginPw;
    }
}
