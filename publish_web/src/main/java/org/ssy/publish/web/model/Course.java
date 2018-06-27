package org.ssy.publish.web.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "course_time")
    private Integer courseTime;

    @Column(name = "course_location")
    private Integer courseLocation;

    @Column(name = "course_count")
    private Integer courseCount;

    @Column(name = "course_free")
    private Integer courseFree;

    @Column(name = "course_start_time")
    private Integer courseStartTime;

    @Column(name = "course_remark")
    private Integer courseRemark;

    @Column(name = "course_type")
    private Integer courseType;

    @Column(name = "course_record")
    private Integer courseRecord;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return course_name
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return teacher_id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * @param teacherId
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * @return student_id
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * @param studentId
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * @return course_time
     */
    public Integer getCourseTime() {
        return courseTime;
    }

    /**
     * @param courseTime
     */
    public void setCourseTime(Integer courseTime) {
        this.courseTime = courseTime;
    }

    /**
     * @return course_location
     */
    public Integer getCourseLocation() {
        return courseLocation;
    }

    /**
     * @param courseLocation
     */
    public void setCourseLocation(Integer courseLocation) {
        this.courseLocation = courseLocation;
    }

    /**
     * @return course_count
     */
    public Integer getCourseCount() {
        return courseCount;
    }

    /**
     * @param courseCount
     */
    public void setCourseCount(Integer courseCount) {
        this.courseCount = courseCount;
    }

    /**
     * @return course_free
     */
    public Integer getCourseFree() {
        return courseFree;
    }

    /**
     * @param courseFree
     */
    public void setCourseFree(Integer courseFree) {
        this.courseFree = courseFree;
    }

    /**
     * @return course_start_time
     */
    public Integer getCourseStartTime() {
        return courseStartTime;
    }

    /**
     * @param courseStartTime
     */
    public void setCourseStartTime(Integer courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    /**
     * @return course_remark
     */
    public Integer getCourseRemark() {
        return courseRemark;
    }

    /**
     * @param courseRemark
     */
    public void setCourseRemark(Integer courseRemark) {
        this.courseRemark = courseRemark;
    }

    /**
     * @return course_type
     */
    public Integer getCourseType() {
        return courseType;
    }

    /**
     * @param courseType
     */
    public void setCourseType(Integer courseType) {
        this.courseType = courseType;
    }

    /**
     * @return course_record
     */
    public Integer getCourseRecord() {
        return courseRecord;
    }

    /**
     * @param courseRecord
     */
    public void setCourseRecord(Integer courseRecord) {
        this.courseRecord = courseRecord;
    }
}