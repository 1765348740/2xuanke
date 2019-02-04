package com.dao;

import com.entity.KeBiao;
import com.entity.Student;

import java.util.List;


public interface StudentDao {
    public Student selectStudent(String loginname , String loginpwd);

    public List<KeBiao> selectKeBiao();

    public List<KeBiao> selectXuanKe(int id);

    public List<Student> selectStudent2();

    public int deleteStudent(int id);

    public int addStudent(Student t);

}
