package com.entity;

public class KeCheng {
    private Integer Id;
    private String BianHao;
    private String MingCheng;
    private String KeShi;
    private String del;

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

    public String getMingCheng() {
        return MingCheng;
    }

    public void setMingCheng(String mingCheng) {
        MingCheng = mingCheng;
    }

    public String getKeShi() {
        return KeShi;
    }

    public void setKeShi(String keShi) {
        KeShi = keShi;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    public KeCheng(String bianHao, String mingCheng, String keShi) {
        BianHao = bianHao;
        MingCheng = mingCheng;
        KeShi = keShi;
    }

    public KeCheng() {
        super();
    }
}
