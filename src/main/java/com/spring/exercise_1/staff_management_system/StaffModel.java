package com.spring.exercise_1.staff_management_system;

public class StaffModel {
    private  String name;
    private  Long id;
    private  String department;

    public StaffModel(String name, Long id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public StaffModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
