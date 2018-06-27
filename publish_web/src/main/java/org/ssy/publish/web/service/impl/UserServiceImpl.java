package org.ssy.publish.web.service.impl;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.ssy.publish.web.core.AbstractService;
import org.ssy.publish.web.dao.UserMapper;
import org.ssy.publish.web.model.User;
import org.ssy.publish.web.service.UserService;


/**
 * Created by CodeGenerator on 2018/04/14.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {

  @Resource
  private UserMapper userMapper;

}
