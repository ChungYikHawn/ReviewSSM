package cn.hang.controller;

import cn.hang.mapper.TeacherDao;
import cn.hang.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
