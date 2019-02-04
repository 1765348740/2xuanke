package com.service.serviceimpl;

import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.KeBiao;
import com.entity.KeCheng;
import com.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AdminServiceimpl")
public class AdminServiceimpl implements AdminService {
    @Autowired

    private AdminDao ad;
    @Override
    public Admin selectAdmin(String loginname, String loginpwd) {
        return ad.selectAdmin(loginname,loginpwd);
    }

    @Override
    public List<Admin> selectAdmin2() {
        return ad.selectAdmin2();
    }

    @Override
    public int addAdmin(Admin am) {
        return ad.addAdmin(am);
    }

    @Override
    public int deleteAdmin(int id) {
        return ad.deleteAdmin(id);
    }

    @Override
    public int updatePwd(String UserPw, String UserName) {
        return ad.updatePwd(UserPw,UserName);
    }

    @Override
    public List<KeCheng> selectKeCheng() {
        return ad.selectKeCheng();
    }

    @Override
    public int deleteKeCheng(int id) {
        return ad.deleteKeCheng(id);
    }

    @Override
    public int addKeCheng(KeCheng kc) {
        return ad.addKeCheng(kc);
    }

    @Override
    public int deleteKeBiao(int id) {
        return ad.deleteKeBiao(id);
    }

    @Override
    public int addKeBiao(KeBiao kb) {
        return ad.addKeBiao(kb);
    }


}
