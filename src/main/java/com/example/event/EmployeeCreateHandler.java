package com.example.event;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCreateHandler  implements ApplicationListener< EmployeeCreateEvent> {

    @Override
    public void onApplicationEvent( EmployeeCreateEvent employeeCreateEvent) {
        System.out.println("EmployeeCreateHandler.onApplicationEvent");
        System.out.println("Created user info: " + employeeCreateEvent.getEmployeeEvent());
    }
}
