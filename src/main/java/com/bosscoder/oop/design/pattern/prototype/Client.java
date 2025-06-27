package com.bosscoder.oop.design.pattern.prototype;

import java.rmi.registry.Registry;

public class Client {

    public static void fillRegistry(StudentRegistry registry) {
        Student junBatchStudent = new Student();
        junBatchStudent.setBatch("Jun Batch");
        registry.register("juneBatch2025", junBatchStudent);

        IntellijentStudent junBatchIntelligentStudent = new IntellijentStudent();
        junBatchIntelligentStudent.setIq(135);
        junBatchIntelligentStudent.setBatch("Jun Intelligent Batch");
        registry.register("juneIntelliBatch2025", junBatchIntelligentStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student student1 = studentRegistry.get("juneBatch2025").clone();
        student1.setName("Soumodeep");
        student1.setAge(33);

        //Intelligent Student//
        Student student2 = studentRegistry.get("juneIntelliBatch2025").clone();
        student2.setName("Awsaf");
        student2.setAge(28);


        System.out.println("Regsitration is done");
    }
}
