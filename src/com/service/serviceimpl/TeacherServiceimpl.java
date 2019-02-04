package com.service.serviceimpl;


import com.dao.TeacherDao;
import com.entity.Teacher;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TeacherServiceimpl")
public class TeacherServiceimpl implements TeacherService {

    @Autowired

    private TeacherDao td;

    @Override
    public Teacher selectTeacher(String loginname, String loginpwd) {
        return td.selectTeacher(loginname,loginpwd);
    }

    @Override
    public List<Teacher> selectTeacher2() {
        return td.selectTeacher2();
    }

    @Override
    public int deleteTeacher(int id) {
        return td.deleteTeacher(id);
    }

    @Override
    public int addTeacher(Teacher t) {
        return td.addTeacher(t);
    }
}
