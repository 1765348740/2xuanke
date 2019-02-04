package com.entity;

public class KeBiao {
    private Integer id;
    private Integer kecheng_id;
    private String shijian;
    private String jieci;
    private String jiaoshi;
    private Integer laoshi_id;
    private Teacher T;
    private KeCheng K;

    public Teacher getT() {
        return T;
    }

    public void setT(Teacher t) {
        T = t;
    }

    public KeCheng getK() {
        return K;
    }

    public void setK(KeCheng k) {
        K = k;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKecheng_id() {
        return kecheng_id;
    }

    public void setKecheng_id(Integer kecheng_id) {
        this.kecheng_id = kecheng_id;
    }

    public String getShijian() {
        return shijian;
    }

    public void setShijian(String shijian) {
        this.shijian = shijian;
    }

    public String getJieci() {
        return jieci;
    }

    public void setJieci(String jieci) {
        this.jieci = jieci;
    }

    public String getJiaoshi() {
        return jiaoshi;
    }

    public void setJiaoshi(String jiaoshi) {
        this.jiaoshi = jiaoshi;
    }

    public Integer getLaoshi_id() {
        return laoshi_id;
    }

    public void setLaoshi_id(Integer laoshi_id) {
        this.laoshi_id = laoshi_id;
    }

    public KeBiao() {
        super();
    }

    public KeBiao(Integer kecheng_id, String shijian, String jieci, String jiaoshi, Integer laoshi_id) {
        this.kecheng_id = kecheng_id;
        this.shijian = shijian;
        this.jieci = jieci;
        this.jiaoshi = jiaoshi;
        this.laoshi_id = laoshi_id;
    }
}
