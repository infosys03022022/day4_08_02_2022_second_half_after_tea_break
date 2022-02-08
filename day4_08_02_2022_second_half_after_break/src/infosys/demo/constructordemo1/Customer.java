package infosys.demo.constructordemo1;

public class Customer {
   private int id;
   private String name;
   private String address;
   
   
   // constructor
   // parameterless constructor
   // constructors are methods
   // with constructor we dont write
   // any return type
   // We can initialise with setter kind of method.
   // but the disadvantage is setter method 
   // needs to be called explicitly means
   // we need to call with methods with the object
   // Employee emp=new Employee();
   // emp.setData();
   // But the constructors are called implicitly
   // Employee emp=new Employee();
   // What is the purpose of the constructor?
   // constructors are used to initialise object
   // ultimately initialising the instance variables
   // member variables
  public Customer()
   {
	   id=1;
	   name="Ram";
	   address="Delhi";
       System.out.println("I am the constructor");
   } 
   
  public Customer(int i,String n, String a)
  {
	   id=i;
	   name=n;
	   address=a;
      System.out.println("I am the parameterised constructor");
  } 
   public void setId(int i)
   { 
	   id=i;  
   }
   public int  getId()
   {
	   return id;
   }
   public void setName(String nm)
   { 
	   name=nm;  
   }
   public String  getName()
   {
	   return name;
   }
   public void setAddress(String ad)
   { 
	   address=ad;  
   }
   public String  getAddress()
   {
	   return address;
   }
   
}
