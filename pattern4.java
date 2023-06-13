package com.learning;

public class pattern4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    pattern4 p4 = new pattern4();
      //p3.pattern();
     //p3.pattern2();
    //p3.pattern3();
   //p4.pattern4();
      
    
  }
  private void pattern4() {
	    // TODO Auto-generated method stub
	    for(int row = 5; row>=1; row--)
	    {
	      for(int star=1; star<=5-row; star++)
	        {
	        System.out.print("  ");
	        }
	    for(int col=1; col<=row; ++col)
	        {
	        System.out.print(col+"   "); 
	        }
	    System.out.println(); 
	    }

	    
	  }
  private void pattern3() {
    // TODO Auto-generated method stub
    
      for(int row = 5; row>=1; row--)
      {
      for(int star=1; star<row; star++)
          {
          System.out.print("* ");
          }
      for(int num = row; num<=5; num++)
        {
        System.out.print(num+" ");
        }
      System.out.println(); 
      } 

      
    }
    
  
  private void pattern2() {
      // TODO Auto-generated method stub
      for(int row = 5; row>=1; row--)
      {
          for(int star =1; star<row; star++)
          {
          System.out.print("  ");
          }
          for(int no = 5; no>=row; no--)
          {
          System.out.print(no+" "); 
          }  
          System.out.println(); 
      }


      
    }

  private void pattern() {
    // TODO Auto-generated method stub
    for(int row =1; row<=5; row++)
    {
    for(int star=1; star<=5-row;star++)
      {
      System.out.print("* "); 
      }
    for(int num=5; num>=6-row; num--)
    {
      System.out.print(num+" "); 
    }
    System.out.println(); 
    }  
  }
    
  }