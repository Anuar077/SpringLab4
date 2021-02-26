package com.example.event;

import com.example.dao.EmployeeDAO;
import com.example.models.Employees;
import org.springframework.context.ApplicationEvent;

public class EmployeeCreateEvent extends ApplicationEvent {

    private Employees employees;

    public EmployeeCreateEvent(Object source, Employees employees) {
        super(source);
        this.employees = employees;
    }

    public Employees getUser() {
        return employees;
    }
}