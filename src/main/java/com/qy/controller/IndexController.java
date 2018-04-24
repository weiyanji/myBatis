package com.qy.controller;

import com.qy.base.core.Result;
import com.qy.base.core.ResultGenerator;
import com.qy.model.Banner;
import com.qy.model.Student;
import com.qy.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by zaq on 2018/03/24.
*/
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private BannerService bannerService;


    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("test");
        List<Banner> bannerList = bannerService.findAll();
        modelAndView.addObject("bannerList",bannerList);
        return modelAndView;
    }


}
