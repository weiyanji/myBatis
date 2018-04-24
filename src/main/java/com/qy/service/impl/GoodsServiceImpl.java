package com.qy.service.impl;

import com.qy.dao.GoodsMapper;
import com.qy.model.Goods;
import com.qy.service.GoodsService;
import com.qy.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zaq on 2018/04/22.
 */
@Service
@Transactional
public class GoodsServiceImpl extends AbstractService<Goods> implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

}
