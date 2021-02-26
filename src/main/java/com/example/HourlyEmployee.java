package com.example;

public class HourlyEmployee extends Employee
   {
       private double wage;
       private double hours;
 
      // five-argument constructor
      public HourlyEmployee( String fname, String secondname, double hourlyWage, double hoursWorked )
      {
         super(fname,secondname);
         setWage( hourlyWage );
         setHours( hoursWorked );
      } // end five-argument HourlyEmployee constructor


      public void setWage( double hourlyWage )
      {
         if ( hourlyWage >= 0.0 )
            wage = hourlyWage;
         else
            throw new IllegalArgumentException(
               "Error" );
      } // end method setWage

      // return wage
      public double getWage()
      {
         return wage;
     } // end method getWage


      public void setHours( double hoursWorked )
      {
         if ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) )
            hours = hoursWorked;
         else
            throw new IllegalArgumentException(
                    "Error" );
      } // end method setHours

      // return hours worked
      public double getHours()
      {
         return hours;
      } // end method getHours

      // calculate earnings; override abstract method earnings in Employee
      @Override                                                           
      public double earnings()                                            
     {                                                                  
      if ( getHours() <= 40 ) // no overtime
      return getWage() * getHours();                                
      else                                                             
      return 40 * getWage() + ( getHours() -  40 ) * getWage() *  1.5 ;
      } // end method earnings                                            


      @Override                                                             
      public String toString()                                              
      {                                                                     
      return String.format( "%s\nName and Surname: %s\n%s: $%,.2f; %s: %,.2f",
      "Hourly employee:",super.toString(), "Hourly wage" , getWage(),
        "Hours worked", getHours() );
      }
   } // end class HourlyEmployee