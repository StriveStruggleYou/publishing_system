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
import org.ssy.publish.web.service.StudentService;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example.Criteria;

/**
 * Created by CodeGenerator on 2018/04/14.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

  @Resource
  private StudentService studentService;

  @PostMapping("/add")
  public Result add(Student student) {
    studentService.save(student);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    studentService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/update")
  public Result update(Student student) {
    studentService.update(student);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    Student student = studentService.findById(id);
    return ResultGenerator.genSuccessResult(student);
  }

  @PostMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<Student> list = studentService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }


  @RequestMapping("/login")
  public Result login(String mobile, String pwd, String authCode, HttpSession session) {
    if (StringUtils.isBlank(authCode)) {
      return ResultGenerator.genFailResult("验证码不存在");
    }
    Condition condition = new Condition(Student.class);
    condition.selectProperties("name", "phone", "pwd");
    Criteria criteria = condition.createCriteria();
    criteria.andEqualTo("phone", mobile).andEqualTo("pwd", pwd);
    List<Student> list = studentService.findByCondition(condition);
    if (CollectionUtils.isEmpty(list)) {
      return ResultGenerator.genFailResult("用户不存在");
    }
    session.setAttribute("userInfo", list.get(0));
    return ResultGenerator.genSuccessResult(list.get(0));
  }

  @RequestMapping("/getStudent")
  public Result getTeacher(HttpSession session) {
    Student student = (Student) session.getAttribute("userInfo");
    if (student == null) {
      return ResultGenerator.genFailResult("登录失效");
    }
    return ResultGenerator.genSuccessResult(student);
  }

  @RequestMapping("/removeStudent")
  public Result removeTeacher(HttpSession session) {
    session.removeAttribute("userInfo");
    return ResultGenerator.genSuccessResult("移除成功");
  }

}
