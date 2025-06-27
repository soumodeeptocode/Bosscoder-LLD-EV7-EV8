package com.bosscoder.oop.design.pattern.builder;

public class Student {
    private String name;
    private int age;
    private String universityName;
    private String batch;
    private long id;
    private int gradYear;
    private String phNo;

    private Student(Builder b){
        this.name = b.getName();
        this.batch =b.getBatch();
        this.universityName = b.getUniversityName();
        this.gradYear = b.getGradYear();
        this.id = b.getId();
        this.phNo = b.getPhNo();
        this.age = b.getAge();
    }


    public static Builder builder(){
        return new Builder();
    }

    static class Builder {
        private String name;
        private int age;
        private String universityName;
        private String batch;
        private long id;
        private int gradYear;
        private String phNo;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder universityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        public Builder batch(String batch){
            this.batch = batch;
            return this;
        }

        public Builder id(long id){
            this.id = id;
            return this;
        }
        public Builder gradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        public Builder phNo(String phNo){
            this.phNo = phNo;
            return this;
        }


        public Student build(){
            if(!validate(this)){
                throw new RuntimeException("Validation failed");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }


        public int getAge() {
            return age;
        }


        public String getUniversityName() {
            return universityName;
        }



        public String getBatch() {
            return batch;
        }



        public long getId() {
            return id;
        }



        public int getGradYear() {
            return gradYear;
        }



        public String getPhNo() {
            return phNo;
        }

    }

    private static Boolean validate(Builder builder){
        if(builder.getName() == null || builder.getUniversityName() == null || builder.getBatch() == null){
            throw new RuntimeException("name or universityName or batch is null");
        }
        return Boolean.TRUE;
    }
}
