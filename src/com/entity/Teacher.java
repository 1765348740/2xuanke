package com.entity;

public class Teacher {
    private Integer Id;
    private String BianHao;
    private String XingMing;
    private String XingBie;
    private String NianLing;
    private String ZhiCheng;
    private String LoginName;
    private String LoginPw;
    private String del;

    public String getZhiCheng() {
        return ZhiCheng;
    }

    public void setZhiCheng(String zhiCheng) {
        ZhiCheng = zhiCheng;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBianHao() {
        return BianHao;
    }

    public void setBianHao(String bianHao) {
        BianHao = bianHao;
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

    public Teacher() {
        super();
    }

    public Teacher( String loginName, String loginPw) {

        LoginName = loginName;
        LoginPw = loginPw;
    }

    public Teacher(String bianHao, String xingMing, String xingBie, String nianLing, String zhiCheng, String loginName, String loginPw) {
        BianHao = bianHao;
        XingMing = xingMing;
        XingBie = xingBie;
        NianLing = nianLing;
        ZhiCheng = zhiCheng;
        LoginName = loginName;
        LoginPw = loginPw;
    }
}
