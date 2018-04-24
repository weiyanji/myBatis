package com.qy.service.impl;

import com.qy.dao.StudentMapper;
import com.qy.model.Student;
import com.qy.service.StudentService;
import com.qy.base.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by zaq on 2018/03/28.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper qyStudentMapper;

}
