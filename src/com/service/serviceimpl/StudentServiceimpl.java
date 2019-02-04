package com.service.serviceimpl;

import com.dao.StudentDao;
import com.entity.KeBiao;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("StudentServiceimpl")
public class StudentServiceimpl implements StudentService {

    @Autowired

    private StudentDao sd;
    @Override
    public Student selectStudent(String loginname, String loginpwd) {
        return sd.selectStudent(loginname,loginpwd);
    }

    @Override
    public List<KeBiao> selectKeBiao() {
        return sd.selectKeBiao();
    }

    @Override
    public List<KeBiao> selectXuanKe(int id) {
        return sd.selectXuanKe(id);
    }

    @Override
    public List<Student> selectStudent2() {
        return sd.selectStudent2();
    }

    @Override
    public int deleteStudent(int id) {
        return sd.deleteStudent(id);
    }

    @Override
    public int addStudent(Student t) {
        return sd.addStudent(t);
    }
}
