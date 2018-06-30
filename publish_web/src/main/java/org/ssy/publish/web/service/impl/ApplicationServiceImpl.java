package org.ssy.publish.web.service.impl;

import org.ssy.publish.web.dao.ApplicationMapper;
import org.ssy.publish.web.model.Application;
import org.ssy.publish.web.service.ApplicationService;
import org.ssy.publish.web.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/29.
 */
@Service
@Transactional
public class ApplicationServiceImpl extends AbstractService<Application> implements ApplicationService {
    @Resource
    private ApplicationMapper applicationMapper;

}
