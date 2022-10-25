package com.zerone.ajax.controller;

import com.zerone.ajax.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//指示此类为springmvc的控制器类
@RequestMapping("/stu")//访问此控制器的url
public class AjaxController {
    @RequestMapping(method = RequestMethod.GET)//与类的RequestMapping相结合，用来指示访问的url和请求方法
    @ResponseBody//此方法的返回值作为响应体返回到客户端，并转换为json格式
    public Student getStudent(@RequestParam String sno){//只是此参数将从请求参数中获取，也就是说接收查询字符串中的参数
        Student stu = null;
        stu = new Student();
        stu.setSno(sno);
        stu.setSname("张三");
        stu.setSsex("男");
        stu.setSage(20);
        stu.setSmajor("计算机科学");
        return stu;
    }
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String saveStudent(@RequestBody Student student){
        System.out.println(student.getSno());
        System.out.println(student.getSname());
        System.out.println(student.getSsex());
        System.out.println(student.getSage());
        System.out.println(student.getSmajor());
        return "OK";
    }


}
