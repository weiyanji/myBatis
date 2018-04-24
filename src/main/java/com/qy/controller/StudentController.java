package com.qy.controller;
import com.qy.base.core.Result;
import com.qy.base.core.ResultGenerator;
import com.qy.model.Banner;
import com.qy.model.Student;
import com.qy.service.StudentService;
import com.qy.base.core.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by zaq on 2018/03/28.
*/
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @PostMapping("/add")
    public Result add(@RequestBody Student student) {
        studentService.save(student);
        return ResultGenerator.successResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer id) {
        studentService.deleteById(id);
        return ResultGenerator.successResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Student student) {
        studentService.update(student);
        return ResultGenerator.successResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Student student = studentService.findById(id);
        return ResultGenerator.successResult(student);
    }

    @GetMapping("/list")
    public Result list(PageBean<Student> page) {
        PageHelper.startPage(page.getPageNum(),page.getSize());
        List<Student> list = studentService.findAll();
        page.setList(list);
        return ResultGenerator.successResult(page);
    }
    @GetMapping("/stu")
    public ModelAndView student() {
        ModelAndView modelAndView = new ModelAndView("student");
        List<Student> studentList =studentService.findAll();
        modelAndView.addObject("studentList",studentList);
        return modelAndView;
    }
}
