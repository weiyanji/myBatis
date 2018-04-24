package com.qy.controller;
import com.qy.base.core.Result;
import com.qy.base.core.ResultGenerator;
import com.qy.model.Stu;
import com.qy.service.StuService;
import com.qy.base.core.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by zaq on 2018/04/13.
*/
@RestController
@RequestMapping("/stu")
public class StuController {
    @Resource
    private StuService stuService;

    @PostMapping("/add")
    public Result add(@RequestBody Stu stu) {
        stuService.save(stu);
        return ResultGenerator.successResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer id) {
        stuService.deleteById(id);
        return ResultGenerator.successResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Stu stu) {
        stuService.update(stu);
        return ResultGenerator.successResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Stu stu = stuService.findById(id);
        return ResultGenerator.successResult(stu);
    }

    @GetMapping("/list")
    public Result list(PageBean<Stu> page) {
        PageHelper.startPage(page.getPageNum(),page.getSize());
        List<Stu> list = stuService.findAll();
        page.setList(list);
        return ResultGenerator.successResult(page);
    }

    @GetMapping("/stu")
    public ModelAndView stu() {
        ModelAndView modelAndView = new ModelAndView("student");
        List<Stu> stuList =stuService.findAll();
        modelAndView.addObject("stuList",stuList);
        return modelAndView;
    }
}
