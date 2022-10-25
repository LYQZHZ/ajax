package com.zerone.ajax.controller;

import com.zerone.ajax.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller//指示此类为springmvc的控制器类
@RequestMapping("/jquery")//访问此控制器的url
public class jQueryController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)//与类的RequestMapping相结合，用来指示访问的url和请求方法
    @ResponseBody//此方法的返回值作为响应体返回到客户端，并转换为json格式
    public String getTextForGet(@RequestParam String name){//只是此参数将从请求参数中获取，也就是说接收查询字符串中的参数
        String hello = name+",你好！";
        return hello;
    }
    @RequestMapping(value = "/hello",method = RequestMethod.POST)//与类的RequestMapping相结合，用来指示访问的url和请求方法
    @ResponseBody//此方法的返回值作为响应体返回到客户端，并转换为json格式
    public String getTextForPost(@RequestParam String name,@RequestParam String say){//只是此参数将从请求参数中获取，也就是说接收查询字符串中的参数
        String hello = name+say;
        return hello;
    }
}
