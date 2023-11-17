/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PearsonData;

import java.util.Scanner;

/**
 *
 * @author Mr
 */
public class Person {
   private final Scanner in=new Scanner(System.in);
 private int age;
 private String name;
 private String phonenumber;
 private String email;
 private BirthDate birthDate;
    void setAge()
    {
        System.out.println("not (Age should be within the range of 20 to 40 inclusive)");
        boolean t=true;
    
   System.out.println("please Enter Person age");
    while(t==true) { 
        
         int age=in.nextInt();
      if(age>=20 && age<=40)
      {this.age=age;
      t=false;
      
      }
      else{
      
          
          System.out.println("Please Enter avlid age");
          
      }
    }
    
    }
    int getAge()
    {
    return age;
    
    }
    //*************
   private boolean cheakname(String name)
    {
    if(name.isEmpty() || name==null)
    {
    return false;
    }  
    if(!name.matches("^[a-zA-Z \\s]+$"))
    {
    return false;
    }
    if(name.length()>20)
    {
    return false;
    }
    
    
    
    return true;
    }
  
   
   void setName()
   {boolean t=true;
       System.out.println("Enter the Person name");
       while(t)
       {
       String name=in.nextLine();
       if(cheakname(name))
       {
       this.name=name;
       t=false;
       }
       else{
           System.out.println("please Enter avild name");
       
       }
     
       
       }
         
   
   
   }
    
    
   String getName()
   {
   return name;
   
   }
   //**********
   
  private boolean checkPhoneNumber(String Phonenumber)
   {
   
       if(Phonenumber.length()!=11)
       {return false; }
       
       if(Integer.parseInt(Phonenumber.substring(0, 1))!=0 || Integer.parseInt(Phonenumber.substring(1, 2))!=1 )
       {
       return false;
       }
         if((Integer.parseInt(Phonenumber.substring(2, 3))>=3 && Integer.parseInt(Phonenumber.substring(2, 3))<5) ||Integer.parseInt(Phonenumber.substring(2, 3))>5 ||Integer.parseInt(Phonenumber.substring(2, 3))<0 )
   {
 return false;
   }
      
       
       
       
   return true;
   }
   
   void setPhoneNumber()
   {
       System.out.println("Enter Person Phone number");
   String phonenumber ;
 
           
   boolean t=true;
   while(t)
   {  phonenumber=in.next();
   if(checkPhoneNumber(phonenumber))
   {
   this.phonenumber=phonenumber;
   t=false;
   }
   else{
       System.out.println("Please Enter avalid Phone number"); }
    }
    }
   
   String getPhoneNumber()
   
   {return phonenumber;}
   
   //************************        
   
private boolean checkEmail(String email) {
    if (!Character.isLetterOrDigit(email.charAt(0))) {
        return false;
    }

    if (email.indexOf('@') == -1) {
        return false;
    } else {
        for (int i = 1; i < email.indexOf('@'); i++) {
            if (!Character.isLetterOrDigit(email.charAt(i))) {
                return false;
            }
        }
    }

    String domain = email.substring(email.indexOf('@') + 1);
    if (!domain.matches("^[a-zA-Z0-9]+[a-zA-Z0-9-]+[\\.a-zA-Z]{1,255}$")) {
        return false;
    }

    if (email.indexOf('.') == -1) {
        return false;
    }

    return true;
}
   
   
   void setEmail()
   {
   boolean t=true;
       System.out.println("Enter Person Email");
        String email ;
        
       while(t)
       {
       email=in.next();
       
       if(checkEmail(email))
       {
       this.email=email;
       t=false;
       }
       
       else{
           System.out.println("Please Enter avalid Email"); 
           }
       
       }
   }
   
   String getEmail()
   {return email;}
   
   //******************
   
   
   
   
   void setPersonData()
   {
       
       setName();
       setAge();
       setPhoneNumber();
       setEmail();
       
   }
   
 
   void Print()
   {
       System.out.println("the person name is "+getName());
       System.out.println("the person age is " +getAge());
       System.out.println("the person Phone is "+getPhoneNumber());
       System.out.println("the person Email is "+getEmail());
       
   }

  

 
   
   
   
   
}

 class BirthDate {
   private final Scanner in=new Scanner(System.in);
private int day;
private int month;
private String year;


boolean checkDay ( int day)
 {
 if(day>0&&day<=31)
 {
 
 return true;
 }
 return false;
 }

public void setDay( int day) {
    
    if(checkDay(day))
    {this.day = day;}

}

public int getday() {
return day;}



boolean checkMonth ( int month)
 {
 if( month>0&& month<=12)
 {
 
 return true;
 }
 return false;
 }


public void setMonth(int month) {
if(checkMonth(month)){   
this.month = month;}
}

public int getMonth() {

return month;
}

boolean checkYear ( String year)
 {
 if(year.length()==4)
 {
 
 return true;
 }
 return false;
 }

public void setYear(String year) {
    
    if(checkYear(year)){
this. year = year;}}

public String getYear() {
return year; }
//14/9/2004
 void setBirthData( )
{
    System.out.println("Enter your BirthData");
    String birthdata;
 birthdata=in.next();
 if(birthdata.charAt(1)=='/' )
 {
 setDay(Integer.parseInt(birthdata.substring(0, 1)));
 
      if(birthdata.charAt(3)=='/' )
 {
 setMonth(Integer.parseInt(birthdata.substring(2, 3)));
 setYear(birthdata.substring(4));
 }
      else if(birthdata.charAt(4)=='/')
      {
          setMonth(Integer.parseInt(birthdata.substring(2, 4)));
 setYear(birthdata.substring(5));
      
      
      }
 
 }
 
 
 
 
 
 else if(birthdata.charAt(2)=='/' )
 {
 setDay(Integer.parseInt(birthdata.substring(0, 2)));
 
 if(birthdata.charAt(4)=='/')
      {
          setMonth(Integer.parseInt(birthdata.substring(3, 4)));
 setYear(birthdata.substring(5));
      
      
      }
 
 else if(birthdata.charAt(5)=='/')
 {

      setMonth(Integer.parseInt(birthdata.substring(3, 5)));
       
 setYear(birthdata.substring(6));
 }
 
 
 }
 
}

 String getDat()
 {
 return day+"/"+ month + "/"+year;
 
 }

}