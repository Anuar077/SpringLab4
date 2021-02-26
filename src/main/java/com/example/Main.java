package com.example;
import com.example.models.Employees;

import java.util.ArrayList;
import java.util.List;
public class Main
    {
        public static List<String> lines = new ArrayList<String>();


        public static void main( String[] args ) {

            Employees e = new Employees();
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
                   SalariedEmployee employee = (SalariedEmployee) currentEmployee;
                   employee.setWeeklySalary(1.10 * employee.getBaseSalary());
                   System.out.printf(
                           "Salary with 10%% increase is: $%,.2f\n",
                           employee.getBaseSalary());
               }
               System.out.printf(
                       "Total earn: $%,.2f\n\n", currentEmployee.earnings());
           } // end for

            System.out.println(e);
       }
       }