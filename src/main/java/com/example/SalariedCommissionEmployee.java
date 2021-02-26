package com.example;

public class SalariedCommissionEmployee extends CommissionEmployee
    {
       private double baseSalary; // base salary per week

       // six-argument constructor
       public SalariedCommissionEmployee(String fname, String secondname,  double sales, double rate, double salary )
      {
         super(fname,secondname, sales, rate );
        setBaseSalary( salary );
      } // end six-argument BasePlusCommissionEmployee constructor

      // set base salary
      public void setBaseSalary( double salary )
     {
         if ( salary >= 0.0 )
            baseSalary = salary;
         else
            throw new IllegalArgumentException(
               "Error" );
      } // end method setBaseSalary

      // return base salary
     public double getBaseSalary()
      {
         return baseSalary;
      } // end method getBaseSalary

      // calculate earnings; override method earnings in CommissionEmployee
      @Override
      public double earnings()
      {
     return getBaseSalary() + super.earnings();
      }// end method earnings


      @Override
      public String toString()
     {
      return String.format( "%s %s; %s: $%,.2f",
            "Salaried -", super.toString(),
            "Salary", getBaseSalary() );
     }
      }// end method toString
