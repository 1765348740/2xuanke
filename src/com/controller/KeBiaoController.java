package com.controller;

import com.entity.*;
import com.service.AdminService;
import com.service.StudentService;
import com.service.TeacherService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class KeBiaoController {

    @Resource
    @Qualifier("StudentServiceimpl")
    private StudentService ss;
    @Resource
    @Qualifier("AdminServiceimpl")
    private AdminService ad;


    @RequestMapping(value = "kebiao",method =RequestMethod.GET)
    public String kecheng(String type, Model m,HttpSession session){

        /* 课表查询(学生 老师 页面)*/
        if(type.equals("kebiaoAll1")){
            List<KeBiao> keBiaoList = ss.selectKeBiao();
            m.addAttribute("keBiaoList",keBiaoList);
           /* for (KeBiao kb:keBiaoList) {
              System.out.println(kb.getJiaoshi()+kb.getJieci()+kb.getKecheng_id()+kb.getShijian()+kb.getK().getMingCheng()+kb.getK().getBianHao()+kb.getK().getKeShi()+kb.getT().getXingMing());
            }*/
            return "admin/kebiao/kebiaoAll";
            /*学生选课*/
        }else if (type.equals("kebiao_mana_stu")){

            int id=(int)session.getAttribute("id");
            List<KeBiao> xuenakelist = ss.selectXuanKe(id);
            m.addAttribute("xuenakelist",xuenakelist);
            return "axuesheng/kebiao/kebiao_mana_stu";
            /*课程查询(管理页面)*/
        }else if(type.equals("kechengMana")){
            List<KeCheng> kecheng = ad.selectKeCheng();

            m.addAttribute("kechengList",kecheng);
            return"admin/kecheng/kechengMana";
            /*admin课表查询*/
        }else if(type.equals("kebiaoMana")){
            List<KeBiao> keBiaoList = ss.selectKeBiao();
            m.addAttribute("List",keBiaoList);
            return "admin/kebiao/kebiaoMana";
        }

         return "";
    }
    /*admin课表删除*/
    @RequestMapping("kebiaoDel")
    public String AdminDel(int id){
        int i = ad.deleteKeBiao(id);
        return"redirect:kebiao?type=kebiaoMana";
    }
    /*admin课表添加*/
    @RequestMapping(value = "kebiaoAdd",method = RequestMethod.POST)
    public String AdminAdd(int kecheng_id,String shijian,String jieci,String jiaoshi,int laoshi_id){
        KeBiao kb=new KeBiao(kecheng_id,shijian,jieci,jiaoshi,laoshi_id);
        int i = ad.addKeBiao(kb);
        return"redirect:kebiao?type=kebiaoMana";
    }
    /*管理页面删除课表*/
     @RequestMapping("del")
     public String Del(int id){
         int i = ad.deleteKeCheng(id);
         return"redirect:kebiao?type=kechengMana";
      }
      /*管理页面添加课表*/
      @RequestMapping("add")
      public String Add(String bianhao,String mingcheng,String keshi){
         KeCheng kc=new KeCheng(bianhao,mingcheng,keshi);
          int i = ad.addKeCheng(kc);
          return"redirect:kebiao?type=kechengMana";
      }



    }


