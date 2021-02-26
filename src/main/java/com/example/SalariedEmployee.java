package com.example;

public class SalariedEmployee extends Employee
    {
        private double baseSalary;
       public SalariedEmployee( String fname, String secondname, double salary )
      {
         super(fname,secondname); // pass to Employee constructor
         setWeeklySalary( salary ); // validate and store salary
      } // end four-argument SalariedEmployee constructor

      // set salary
      public void setWeeklySalary( double salary )
      {
         if ( salary >= 0.0 )
            baseSalary = salary;
         else
            throw new IllegalArgumentException(
               "Weekly salary must be >= 0.0" );
      } // end method setWeeklySalary

      // return salary
      public double getBaseSalary()
      {
         return baseSalary;
      } // end method getWeeklySalary

      // calculate earnings; override abstract method earnings in Employee
      @Override                                                           
      public double earnings()                                            
      {
           return getBaseSalary() ;
      } // end method earnings                                            

      // return String representation of SalariedEmployee object   
      @Override                                                    
      public String toString()                                     
 {

      return String.format( "%s\nName and Surname:%s\n%s: $%,.2f",
      "Salaried Employee:",super.toString(), "Base salary" , getBaseSalary() );
      } // end method toString                                     
   } // end class SalariedEmployee