package com.qy.service;
import com.qy.model.Banner;
import com.qy.base.core.Service;


/**
 * Created by zaq on 2018/04/22.
 */
public interface BannerService extends Service<Banner> {
    //判断轮播图是否可以跳转
    public String judgeSkip(Integer type,Integer goods_id);
}
