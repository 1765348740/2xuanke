package com.service;

import com.entity.Teacher;

import java.util.List;

public interface TeacherService {

    public Teacher selectTeacher(String loginname , String loginpwd);

    public List<Teacher> selectTeacher2();

    public int deleteTeacher(int id);

    public int addTeacher(Teacher t);
}
