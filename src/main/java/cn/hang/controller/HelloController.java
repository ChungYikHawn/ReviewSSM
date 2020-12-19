package cn.hang.controller;

import cn.hang.common.SysException;
import cn.hang.domain.Classes;
import cn.hang.mapper.TeacherDao;
import cn.hang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 控制器类
@Controller
public class HelloController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 入门案例
     * @return
     */
    @RequestMapping(path="/hello")
    public String sayHello(){
        System.out.println("Hello StringMVC");
        teacherService.test();
        return "success";
    }

    @RequestMapping(path="/param")
    public String testParam(@RequestParam(value = "name") String username, String password){
        System.out.println("Hello Param");
        System.out.println(username);
        System.out.println(password);
        return "success";
    }

//    @RequestMapping(path="/body")
//    public String testParam(@RequestBody(required = false) String body){
//        System.out.println("Hello Param");
//        System.out.println(body);
//        return "success";
//    }


    @RequestMapping(path="/bean")
    public String testBean(Classes classes){
        System.out.println("Hello Bean");
        System.out.println(classes);
        return "success";
    }

    @RequestMapping(path="/pathVariable/{name}")
    public String testpathVariable(@PathVariable(value = "name") String username){
        System.out.println("Hello Bean");
        System.out.println(username);
        return "success";
    }

    @RequestMapping(path="/cookie")
    public String testCookie(@CookieValue(value = "JSESSIONID") String sid){
        System.out.println("Hello Bean");
        System.out.println(sid);
        return "success";
    }

    @RequestMapping(path="/error")
    public String testError()throws SysException {
        System.out.println("Hello Error");
        try{
            int i=10/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new SysException("test error");
        }

        return "success";


    }
}
