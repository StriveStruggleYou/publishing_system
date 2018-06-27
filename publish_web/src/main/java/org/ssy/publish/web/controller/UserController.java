package org.ssy.publish.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultGenerator;
import org.ssy.publish.web.model.User;
import org.ssy.publish.web.service.UserService;

/**
 * Created by CodeGenerator on 2018/04/14.
 */
@RestController
@RequestMapping("/user")
@Api(value = "member")
public class UserController {

  @Resource
  private UserService userService;

  @ApiOperation(value = "获取用户列表", notes = "")
  @PostMapping("/add")
  public Result add(User user) {
    userService.save(user);
    return ResultGenerator.genSuccessResult();
  }

  @ApiOperation(value = "获取用户列表", notes = "")
  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    userService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @ApiOperation(value = "获取用户列表", notes = "")
  @PostMapping("/update")
  public Result update(User user) {
    userService.update(user);
    return ResultGenerator.genSuccessResult();
  }

  @ApiOperation(value = "获取用户列表", notes = "")
  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    User user = userService.findById(id);
    return ResultGenerator.genSuccessResult(user);
  }

  @ApiOperation(value = "获取用户列表", notes = "")
  @GetMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<User> list = userService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }
}
