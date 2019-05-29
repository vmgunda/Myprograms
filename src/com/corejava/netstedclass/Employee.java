package com.corejava.netstedclass;

public class Employee {

    private String name;
    private Integer employeeId;
    private static String myString;

    public Employee(String name, Integer employeeId) {
        this.name = name;
        this.employeeId = employeeId;
        myString = "hello";
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private Integer employeeId;

        public Builder setEmployeeId(Integer employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Employee build() {
            return new Employee(name, employeeId);
        }
    }



}
