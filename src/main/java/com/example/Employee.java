package com.example;

public abstract class Employee {
      private String fname;
      private String sname;


      // three-argument constructor
      public Employee( String fn, String sn)
     {
         fname = fn;
         sname = sn;

} // end three-argument Employee constructor

    // set first name
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setLname(String lname) {
        this.sname = lname;
    }


      // return social security number

      // return String representation of Employee object
     @Override
      public String toString()
      {
         return String.format( "%s %s ",
             getFname(), getSname());
      } // end method toString

      // abstract method overridden by concrete subclasses
      public abstract double earnings(); // no implementation here
   } // end abstract class Employee
    