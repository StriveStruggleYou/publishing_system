package org.ssy.publish.web.service.impl;

import org.ssy.publish.web.dao.AppEnvMapper;
import org.ssy.publish.web.model.AppEnv;
import org.ssy.publish.web.service.AppEnvService;
import org.ssy.publish.web.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/29.
 */
@Service
@Transactional
public class AppEnvServiceImpl extends AbstractService<AppEnv> implements AppEnvService {
    @Resource
    private AppEnvMapper appEnvMapper;

}
