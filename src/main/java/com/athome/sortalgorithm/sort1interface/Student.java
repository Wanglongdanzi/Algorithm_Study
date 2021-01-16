package com.athome.sortalgorithm.sort1interface;

/**
 * @author Wldz
 * @time 21-1-13  22:40
 * @todo  1.定义一个学生类Student，具有年龄age和姓名username两个属性，并通过Comparable接口提供比较规则；
 */
public class Student implements Comparable<Student>{

    private String stuName;
    private int age;

    public Student(String stuName, int age) {
        this.stuName = stuName;
        this.age = age;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stuName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
