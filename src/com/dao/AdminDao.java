package com.dao;

import com.entity.Admin;
import com.entity.KeBiao;
import com.entity.KeCheng;

import java.util.List;

public interface AdminDao {
    public Admin selectAdmin(String loginname , String loginpwd);

    public List<Admin> selectAdmin2();

    public int addAdmin(Admin am);

    public int deleteAdmin(int id);

    public int updatePwd(String UserPw,String UserName );

    public List<KeCheng> selectKeCheng();

    public int deleteKeCheng(int id);

    public int addKeCheng(KeCheng kc);

    public int deleteKeBiao(int id);

    public int addKeBiao(KeBiao kb);


}
