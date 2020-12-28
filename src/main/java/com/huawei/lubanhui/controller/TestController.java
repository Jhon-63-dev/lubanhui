package com.huawei.lubanhui.controller;

import com.huawei.lubanhui.entity.Student;
import com.huawei.lubanhui.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    StudentMapper studentMapper;

    @GetMapping("/test")
    String test(){
        List<Student> studentList = studentMapper.selectList(null);
        System.out.println(studentList);
        return "hello world";
    }


}
