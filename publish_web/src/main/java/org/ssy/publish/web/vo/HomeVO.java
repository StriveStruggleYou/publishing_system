package org.ssy.publish.web.vo;


import java.util.List;
import org.ssy.publish.web.model.Course;
import org.ssy.publish.web.model.Teacher;

/**
 * Created by manager on 2018/5/2.
 */
public class HomeVO {

  private Integer id;//学生id或者是教师id

  private String name;//姓名

  private Integer courseNum;//课程数

  private Integer age;//年纪

  private String sex;//性别

  private List<Course> chooseList;//学生已经选择课程

  private List<Course> openList;//教师开设课程

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getCourseNum() {
    return courseNum;
  }

  public void setCourseNum(Integer courseNum) {
    this.courseNum = courseNum;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public List<Course> getChooseList() {
    return chooseList;
  }

  public void setChooseList(List<Course> chooseList) {
    this.chooseList = chooseList;
  }

  public List<Course> getOpenList() {
    return openList;
  }

  public void setOpenList(List<Course> openList) {
    this.openList = openList;
  }


  public static HomeVO buildHomeVO(Teacher teacher, Integer courseNum) {
    HomeVO homeVO = new HomeVO();
    homeVO.setName(teacher.getName());
    homeVO.setAge(teacher.getAge());
    homeVO.setSex(teacher.getSex());
    homeVO.setCourseNum(courseNum);
    homeVO.setId(teacher.getId());
    return homeVO;
  }
}
