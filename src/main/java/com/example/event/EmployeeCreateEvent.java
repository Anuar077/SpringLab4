package com.example.event;


import com.example.models.Employees;
import org.springframework.context.ApplicationEvent;

public class EmployeeCreateEvent extends ApplicationEvent {

    private Employees employee;

    public EmployeeCreateEvent(Object source, Employees employee) {
        super(source);
        this.employee = employee;
    }

    public Employees getEmployeeEvent() {
        return employee;
    }
}