package com.bosscoder.oop.design.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String,  Student> registry = new HashMap<String, Student>();

    void register(String name, Student student) {
        registry.put(name, student);
    }

    Student get(String name) {
        return registry.get(name);
    }
}
