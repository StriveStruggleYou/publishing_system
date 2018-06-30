package org.ssy.publish.web.service.impl;

import org.ssy.publish.web.dao.MachinePathMapper;
import org.ssy.publish.web.model.MachinePath;
import org.ssy.publish.web.service.MachinePathService;
import org.ssy.publish.web.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/29.
 */
@Service
@Transactional
public class MachinePathServiceImpl extends AbstractService<MachinePath> implements MachinePathService {
    @Resource
    private MachinePathMapper machinePathMapper;

}
