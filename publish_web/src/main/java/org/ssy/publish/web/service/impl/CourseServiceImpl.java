package org.ssy.publish.web.service.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssy.publish.web.core.AbstractService;
import org.ssy.publish.web.dao.CourseMapper;
import org.ssy.publish.web.model.Course;
import org.ssy.publish.web.service.CourseService;


/**
 * Created by CodeGenerator on 2018/04/14.
 */
@Service
@Transactional
public class CourseServiceImpl extends AbstractService<Course> implements CourseService {
    @Resource
    private CourseMapper courseMapper;

}
