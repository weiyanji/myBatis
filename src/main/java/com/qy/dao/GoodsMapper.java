package com.qy.dao;

import com.qy.base.core.Mapper;
import com.qy.model.Evaluate;
import com.qy.model.Goods;
import com.qy.model.Member;

import java.util.List;
import java.util.Map;

public interface GoodsMapper extends Mapper<Goods> {
    public List<Map> getHotGoodsMap();
    public List<Map<Evaluate,Member>> getGoodsEvaluateMap(Integer id);
}