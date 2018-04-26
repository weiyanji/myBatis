package com.qy.controller;
import com.qy.base.core.Result;
import com.qy.base.core.ResultGenerator;
import com.qy.model.Banner;
import com.qy.model.Evaluate;
import com.qy.model.Goods;
import com.qy.model.Member;
import com.qy.service.BannerService;
import com.qy.service.CategoryService;
import com.qy.service.GoodsService;
import com.qy.base.core.PageBean;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Created by zaq on 2018/04/22.
*/
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;
    @Resource
    private BannerService bannerService;
    @Resource
    private CategoryService categoryService;

    @PostMapping("/add")
    public Result add(@RequestBody Goods goods) {
        goodsService.save(goods);
        return ResultGenerator.successResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Integer id) {
        goodsService.deleteById(id);
        return ResultGenerator.successResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Goods goods) {
        goodsService.update(goods);
        return ResultGenerator.successResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Goods goods = goodsService.findById(id);
        return ResultGenerator.successResult(goods);
    }

    @GetMapping("/list")
    public Result list(PageBean<Goods> page) {
        PageHelper.startPage(page.getPageNum(),page.getSize());
        List<Goods> list = goodsService.findAll();
        page.setList(list);
        return ResultGenerator.successResult(page);
    }
    @RequestMapping("/homePage")
    public ModelAndView selectAllGoods(){
        ModelAndView mv = new ModelAndView("homePage");
       List<Banner> bannerList= bannerService.findAll();
      mv.addObject("bannerList",bannerList);

//        List<Goods> goodsList = goodsService.findAll();
//
//        mv.addObject("goodsList",goodsList);
        List<Map> goodsList = goodsService.getHotGoodsMap();
        mv.addObject("goodsList",goodsList);
        return mv;
    }
    @RequestMapping("/goodsDetail")
    public ModelAndView goodsDetail(Integer id){
        ModelAndView mv = new ModelAndView("goodsDetail");
        Goods goods = goodsService.findById(id);
        List<Map<Evaluate,Member>> goodsEvaluateList = goodsService.getGoodsEvaluateMap(id);
        mv.addObject("goodsEvaluateList",goodsEvaluateList);
        for (int i=0;i<goodsEvaluateList.size();i++){
            System.out.println(goodsEvaluateList.get(i));
        }
        mv.addObject("goods",goods);
        return mv;
    }
    @RequestMapping("/goodsAll")
    public ModelAndView goodsAll(){
        ModelAndView mv = new ModelAndView("test");
        List<Goods> goodsList = goodsService.findAll();
        mv.addObject("goodsList",goodsList);
        return mv;
    }
}
