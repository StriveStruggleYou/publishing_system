package org.ssy.publish.web.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssy.publish.web.core.AbstractService;
import org.ssy.publish.web.dao.TeacherMapper;
import org.ssy.publish.web.model.Teacher;
import org.ssy.publish.web.service.TeacherService;


/**
 * Created by CodeGenerator on 2018/05/01.
 */
@Service
@Transactional
public class TeacherServiceImpl extends AbstractService<Teacher> implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

}
