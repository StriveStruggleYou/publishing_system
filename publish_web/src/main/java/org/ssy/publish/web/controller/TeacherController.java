package org.ssy.publish.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultGenerator;
import org.ssy.publish.web.model.Student;
import org.ssy.publish.web.model.Teacher;
import org.ssy.publish.web.service.TeacherService;
import org.ssy.publish.web.vo.HomeVO;
import tk.mybatis.mapper.entity.Condition;

/**
 * Created by CodeGenerator on 2018/05/01.
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

  @Resource
  private TeacherService teacherService;

  @PostMapping("/add")
  public Result add(Teacher teacher) {
    teacherService.save(teacher);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    teacherService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/update")
  public Result update(Teacher teacher) {
    teacherService.update(teacher);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    Teacher teacher = teacherService.findById(id);
    return ResultGenerator.genSuccessResult(teacher);
  }

  @PostMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<Teacher> list = teacherService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }

  @RequestMapping("/login")
  public Result login(String mobile, String pwd, String authCode, HttpSession session) {
    if (StringUtils.isBlank(authCode)) {
      return ResultGenerator.genFailResult("验证码不存在");
    }
    Condition condition = new Condition(Student.class);
//    condition.selectProperties("name","age","sex","phone", "pwd");
    Condition.Criteria criteria = condition.createCriteria();
    criteria.andEqualTo("phone", mobile).andEqualTo("pwd", pwd);
    List<Teacher> list = teacherService.findByCondition(condition);
    if (CollectionUtils.isEmpty(list)) {
      return ResultGenerator.genFailResult("用户不存在");
    }
    session.setAttribute("userInfo", list.get(0));
    return ResultGenerator.genSuccessResult(list.get(0));
  }


  @RequestMapping("/getTeacher")
  public Result getTeacher(HttpSession session) {
    Teacher teacher = (Teacher) session.getAttribute("userInfo");
    if (teacher == null) {
      return ResultGenerator.genFailResult("登录失效");
    }
    HomeVO homeVO = HomeVO.buildHomeVO(teacher, 3);
    return ResultGenerator.genSuccessResult(homeVO);
  }
}
