package com.qy.service;
import com.qy.model.Evaluate;
import com.qy.model.Goods;
import com.qy.base.core.Service;
import com.qy.model.Member;

import java.util.List;
import java.util.Map;


/**
 * Created by zaq on 2018/04/22.
 */
public interface GoodsService extends Service<Goods> {

    public List<Map> getHotGoodsMap();

    public List<Map<Evaluate,Member>> getGoodsEvaluateMap(Integer id);
}
