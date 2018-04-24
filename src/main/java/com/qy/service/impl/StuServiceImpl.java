package com.qy.service.impl;

import com.qy.dao.StuMapper;
import com.qy.model.Stu;
import com.qy.service.StuService;
import com.qy.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zaq on 2018/04/13.
 */
@Service
@Transactional
public class StuServiceImpl extends AbstractService<Stu> implements StuService {
    @Resource
    private StuMapper qyStuMapper;

}
