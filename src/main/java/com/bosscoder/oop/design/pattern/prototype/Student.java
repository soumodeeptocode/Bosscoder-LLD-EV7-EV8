package com.bosscoder.oop.design.pattern.prototype;

public class Student implements Prototype<Student>{
  private String name;
  private int age;
  private String batch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(){};

  public Student(Student s) {
      this.name = s.name;
      this.age = s.age;
      this.batch = s.batch;
  }
   @Override
    public Student clone() {
        return new Student(this);
    }
}
