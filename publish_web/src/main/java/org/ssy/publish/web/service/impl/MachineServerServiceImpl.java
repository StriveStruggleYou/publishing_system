package org.ssy.publish.web.service.impl;

import org.ssy.publish.web.dao.MachineServerMapper;
import org.ssy.publish.web.model.MachineServer;
import org.ssy.publish.web.service.MachineServerService;
import org.ssy.publish.web.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/06/28.
 */
@Service
@Transactional
public class MachineServerServiceImpl extends AbstractService<MachineServer> implements MachineServerService {
    @Resource
    private MachineServerMapper machineServerMapper;

}
