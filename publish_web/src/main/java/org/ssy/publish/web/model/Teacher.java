package org.ssy.publish.web.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String sex;

    @Column(name = "id_card")
    private Integer idCard;

    private Integer age;

    private String phone;

    private String email;

    private String address;

    private String education;

    private String profession;

    @Column(name = "coach_time")
    private String coachTime;

    @Column(name = "coach_subject")
    private String coachSubject;

    @Column(name = "teacher_certification")
    private String teacherCertification;

    private String pwd;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return id_card
     */
    public Integer getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return coach_time
     */
    public String getCoachTime() {
        return coachTime;
    }

    /**
     * @param coachTime
     */
    public void setCoachTime(String coachTime) {
        this.coachTime = coachTime;
    }

    /**
     * @return coach_subject
     */
    public String getCoachSubject() {
        return coachSubject;
    }

    /**
     * @param coachSubject
     */
    public void setCoachSubject(String coachSubject) {
        this.coachSubject = coachSubject;
    }

    /**
     * @return teacher_certification
     */
    public String getTeacherCertification() {
        return teacherCertification;
    }

    /**
     * @param teacherCertification
     */
    public void setTeacherCertification(String teacherCertification) {
        this.teacherCertification = teacherCertification;
    }

    /**
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}