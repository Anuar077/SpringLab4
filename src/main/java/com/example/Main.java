package com.example;
import com.example.config.SpringConfiguration;
import com.example.dao.EmployeeDAO;
import com.example.event.EmployeeCreateEvent;
import com.example.models.Employees;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
    {

        public static void main( String[] args ) {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
            context.start();
            System.out.println("\nEvent and Handler:");
            EmployeeDAO employeeDAO =  context.getBean("employeeDAO", EmployeeDAO.class);
            Employees employee = new Employees();
            employee.setId(2);
            employee.setName("Event and Handle");
            employee.setAge(18);
            employee.setWorkplace("Hourly");
            employeeDAO.create(employee);

            System.out.println("\n");

            SalariedEmployee salariedEmployee = new SalariedEmployee("Alikhan", "Dzhakupov", 900.00);

            HourlyEmployee hourlyEmployee = new HourlyEmployee("Almas", "Ahaev", 25, 41);

            CommissionEmployee commissionEmployee = new CommissionEmployee("Alikhan", "Belmuratov", 500, .45);

            SalariedCommissionEmployee salariedCommissionEmployee = new SalariedCommissionEmployee("Samat", "Orbaev", 600, .46, 700);

            Employee[] employees = new Employee[4];
            employees[0] = salariedEmployee;
            employees[1] = hourlyEmployee;
            employees[2] = commissionEmployee;
            employees[3] = salariedCommissionEmployee;

            for (Employee currentEmployee : employees) {
               System.out.println(currentEmployee);

               if (currentEmployee instanceof SalariedEmployee) {
                   SalariedEmployee salaryEmployee = (SalariedEmployee) currentEmployee;
                   salaryEmployee.setBaseSalary(1.10 * salaryEmployee.getBaseSalary());
                   System.out.printf(
                           "Salary with 10%% increase is: $%,.2f\n",
                           salaryEmployee.getBaseSalary());
               }
               System.out.printf(
                       "Total earn: $%,.2f\n\n", currentEmployee.earnings());
           } // end for

        }
       }
