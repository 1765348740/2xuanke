package com.dao;

import com.entity.Teacher;

import java.util.List;


public interface TeacherDao {
    public Teacher selectTeacher(String loginname,String loginpwd);

    public List<Teacher> selectTeacher2();

    public int deleteTeacher(int id);

    public int addTeacher(Teacher t);
}
