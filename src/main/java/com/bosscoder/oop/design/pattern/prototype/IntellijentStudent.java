package com.bosscoder.oop.design.pattern.prototype;

public class IntellijentStudent extends Student{

    private int iq;

    public IntellijentStudent() {};

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntellijentStudent(IntellijentStudent is) {
        super(is);
        this.iq = is.iq;
    }
    @Override
    public IntellijentStudent clone() {
        return new IntellijentStudent(this);
    }
}
