package com.controller;

import com.entity.Admin;
import com.entity.Student;
import com.entity.Teacher;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;
import com.service.serviceimpl.StudentServiceimpl;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.annotations.RemoteMethod;
import org.directwebremoting.annotations.RemoteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;
import java.util.List;

@Controller
@RemoteProxy
@SessionAttributes(value = {"student","teacher","admin"},types = {Student.class,Teacher.class,Admin.class})
public class LoginController {

    @Resource
    @Qualifier("StudentServiceimpl")
    private StudentService ss;
    @Resource
    @Qualifier("AdminServiceimpl")
    private AdminService ad;
    @Resource
    @Qualifier("TeacherServiceimpl")
    private TeacherService ts;

    //@RequestMapping(value = "denglu")
    @RemoteMethod
    /*登录*/
    public String login(String userName, String userPw, String userType) {
        // System.out.println(userName+"-----------"+userPw+"---------"+userType);

        int UserType = Integer.parseInt(userType);
        HttpSession session = WebContextFactory.get().getSession();
        session.setAttribute("UserType", UserType);
        if (UserType == 2) {
            Student student = ss.selectStudent(userName, userPw);
            // System.out.println(student.getLoginName()+"========="+student.getLoginPw()+"========="+student.getXingBie());
            if (student != null) {
                session.setAttribute("student", student);
                session.setAttribute("xingbieS", student.getXingBie());
                session.setAttribute("id", student.getId());
                //System.out.println(student.getXingMing());
                return "yes";
            }
        } else if (UserType == 1) {
            Teacher teacher = ts.selectTeacher(userName, userPw);
            //System.out.println(teacher.getLoginName() + "=========" + teacher.getLoginPw() + "==" + teacher.getBianHao());
            if (teacher != null) {
                session.setAttribute("teacher", teacher);
                session.setAttribute("xingbieT", teacher.getXingBie());
                return "yes";
            }
        } else if (UserType == 0) {
            Admin admin = ad.selectAdmin(userName, userPw);
            //System.out.println(student.getLoginName()+"========="+student.getLoginPw());
            if (admin != null) {
                session.setAttribute("admin", admin);
                session.setAttribute("adminUserName", admin.getUserName());
                return "yes";
            }
        }

        return "no";

    }
    /*admin管理页面*/
    @RequestMapping("adminSelect")
    public String adminSelect(Model m){
            List<Admin> admins = ad.selectAdmin2();
            m.addAttribute("adminsList",admins);
            return "admin/admin/adminMana";

    }
    /*admin管理添加页面*/
    @RequestMapping("adminAdd")
    public String adminSelect(String userName,String userPw){
        Admin am=new Admin(userName,userPw);
        int i = ad.addAdmin(am);
        return "redirect:adminSelect";
    }
    /*admin管理删除页面*/
    @RequestMapping("adminDel")
    public String adminDel(int userId){
        int i = ad.deleteAdmin(userId);
        return "redirect:adminSelect";
    }

    /*修改密码*/
    public String adminPwEdit(String UserPw) {
        HttpSession session = WebContextFactory.get().getSession();
        String UserName = (String) session.getAttribute("adminUserName");
        int i = ad.updatePwd(UserPw, UserName);

        return "0";
    }

    /*老师管理页面*/
    @RequestMapping(value = "laoshi",method = RequestMethod.GET)
    public String selectTeacher(Model m,String type) {

            List<Teacher> teachers = ts.selectTeacher2();
            m.addAttribute("laoshiList",teachers);
            return "admin/laoshi/laoshiMana";


    }
    @RequestMapping("laoshidel")
    public String delTeacher(int id) {
        int i = ts.deleteTeacher(id);
        return "redirect:laoshi";
        }
    @RequestMapping("laoshiAdd")
    public String AddTeacher(String bianhao,String xingming,String xingbie,String nianling,String zhicheng,String loginname,String loginpw) {
       Teacher t=new Teacher(bianhao,xingming,xingbie,nianling,zhicheng,loginname,loginpw);

        System.out.println(xingbie);
        int i = ts.addTeacher(t);
        return "redirect:laoshi";
    }

    /*学生管理页面*/
    @RequestMapping(value = "xuesheng",method = RequestMethod.GET)
    public String selectStudent(Model m,String type) {
        List<Student> students = ss.selectStudent2();
        m.addAttribute("xueshengList",students);
        return "admin/xuesheng/xueshengMana";


    }
    @RequestMapping("xueshengdel")
    public String delStudent(int id) {
        System.out.println(id);
        int i = ss.deleteStudent(id);
        return "redirect:xuesheng";
    }
    @RequestMapping("xueshengAdd")
    public String AddStudent(String xuehao,String xingming,String xingbie,String nianling,String banji,String loginname,String loginpw) {
        Student s=new Student(xuehao,xingming,xingbie,nianling,banji,loginname,loginpw);

        int i = ss.addStudent(s);
        return "redirect:xuesheng";
    }
}