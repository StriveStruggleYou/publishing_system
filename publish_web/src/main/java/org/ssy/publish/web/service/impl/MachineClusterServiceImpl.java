package org.ssy.publish.web.service.impl;

import org.ssy.publish.web.dao.MachineClusterMapper;
import org.ssy.publish.web.model.MachineCluster;
import org.ssy.publish.web.service.MachineClusterService;
import org.ssy.publish.web.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/08/07.
 */
@Service
@Transactional
public class MachineClusterServiceImpl extends AbstractService<MachineCluster> implements MachineClusterService {
    @Resource
    private MachineClusterMapper machineClusterMapper;

}
