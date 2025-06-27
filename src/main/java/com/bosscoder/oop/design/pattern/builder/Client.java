package com.bosscoder.oop.design.pattern.builder;

public class Client {
    public static void main(String[] args) {
//        Student.Builder b = new Student.Builder();
//        b.setName("XYZ");
//        b.setAge(23);
//        Student st = b.build();

       Student st = Student.builder()
               .name("Soumodeep")
               .age(33)
               .batch("2014")
               .universityName("XYZ")
               .phNo("xnxnxnxnxnx")
               .build();

        System.out.println("Student: " + st.toString());
    }
}
