package org.ssy.publish.web.service.impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssy.publish.web.core.AbstractService;
import org.ssy.publish.web.dao.StudentMapper;
import org.ssy.publish.web.model.Student;
import org.ssy.publish.web.service.StudentService;


/**
 * Created by CodeGenerator on 2018/04/15.
 */
@Service
@Transactional
public class StudentServiceImpl extends AbstractService<Student> implements StudentService {
    @Resource
    private StudentMapper studentMapper;

}
