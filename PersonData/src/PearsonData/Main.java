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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Person [] arr = new Person[20] ;
        int i=0;
  while(true)
  {
      
      System.out.println("TO Add person data press 1");
      System.out.println("TO Show person data press 2");
      System.out.println("TO update press 3");
      System.out.println("TO Exist press 4");
       System.out.println();
      int Choice;
      Choice=input.nextInt();
      switch(Choice)
      {
          case 1:
              Person p1=new Person();
              p1.setPersonData();
              arr[i]=p1;
              i++;
               System.out.println();
              break;
          case 2:
              System.out.println("Which one you want  ");
              for(int j=0;j<i;j++)
              {
            
            
                  System.out.println(arr[j].getName()+" data press "+ (j+1));
              
              
              }
                int v=input.nextInt();
              
                arr[v-1].Print();
                
              System.out.println();
             
              break;
          case 3 :
              System.out.println("Which one you want  ");
              
              for(int j=0;j<i;j++)
              {
            
            
                  System.out.println(arr[j].getName()+" data press "+ (j+1));
              
              
              }
               int n=input.nextInt();
               
               boolean t=true;
          while(t){      
        System.out.println("TO update the Person Name press  1");
      System.out.println("TO update Person Age press 2");
      System.out.println("TO update Person Phone Number   press 3");
      System.out.println("TO  update Person Email press 4");
     
        int Choiceforupdate=input.nextInt();
                switch(Choiceforupdate)
                {
                    case 1:
                       
                        arr[n-1].setName();
                        System.out.println("Do you want to change anthor thing");
                        System.out.println("YES OR NO");
                        String Choiceforc=input.next();
                        if(Choiceforc.equals("YES"))
                        { break;}
                        
                        else{t=false;
                        break;
                        }
                          case 2:
                          
                                arr[n-1].setAge();
                                
                       System.out.println("Do you want to change anthor thing");
                        System.out.println("YES OR NO");
                        String Choiceforca2=input.next();
                        if(Choiceforca2.equals("YES"))
                        { break;}
                        
                        else{t=false;
                        break;
                        }
                        
                          case 3:
                              arr[n-1].setPhoneNumber();
                          System.out.println("Do you want to change anthor thing");
                        System.out.println("YES OR NO");
                        String Choiceforca3=input.next();
                        if(Choiceforca3.equals("YES"))
                        { break;}
                        
                        else{t=false;
                        break;
                        }
                          case 4:
                              arr[n-1].setEmail();
                               System.out.println("Do you want to change anthor thing");
                        System.out.println("YES OR NO");
                        String Choiceforca4=input.next();
                        if(Choiceforca4.equals("YES"))
                        { break;}
                        
                        else{t=false;
                        break;
                        }
                        
                }
          }
              
              
              break;
          case 4:
              return ;
      
      }
      
  
  
  }
       
      
       
    }
    
}
