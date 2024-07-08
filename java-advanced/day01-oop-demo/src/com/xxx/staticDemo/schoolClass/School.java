package com.xxx.staticDemo.schoolClass;

public class School {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    static {
        System.out.println("hi");

    }

    public static void main(String[] args) {


        System.out.println();
    }
}
