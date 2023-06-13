package com.learning;

public class Patterns4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Patterns4 pa = new Patterns4();
         // pa.print_c();
        // pa.print_E();
       // pa.print_O();
      //pa.print_8();
     //pa.print_T();
     //pa.print_all();
     //pa.print_X();
     pa.print_y();
     //pa.print_V();
     

  }

 // private void print_V() {
	// TODO Auto-generated method stub
	
//}

private void print_y() {
	
	   for(int row=1; row<=9;row++)
	    {
	      if(row<=5) 
	      {
	        for(int col=1; col<=9;col++)
	        {
	          if(col==row || col==10-row)
	          {
	            System.out.print("* ");
	          }
	          else
	            System.out.print("  ");
	        }
	        System.out.println();
	      }
	      else
	      {
	        for(int space=1; space<=4; space++)
	        {
	          System.out.print("  ");
	        }
	      System.out.println("*");
	      }
	      
	    }
	    
	  
	    
	  }


//private void print_X() {
	
	
//}

private void print_all() {
	
	  
	
}

private void print_T() {
	// TODO Auto-generated method stub
	  for(int star=1; star<=5; star++)
	    {
	    System.out.print("*"+" ");
	    }
	System.out.println(); 
	for(int star=1; star<=7; star++)
	    {
	    for(int space=1; space<=2; space++)
	        {
	        System.out.print(" "+" ");
	        }
	    System.out.println("*"); 
	}
	
}

private void print_8() {
	// TODO Auto-generated method stub
	  for(int col=1; col<=7; col++)
      {
      if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    System.out.println();
  for(int star=1; star<=7; star++)
      {
      System.out.print("* "); 
      for(int space=1; space<=6;space++)
        {
        System.out.print("  ");
        }
      System.out.println("*"); 
      }
  for(int col=1; col<=7; col++)
      {
       if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    System.out.println();
    for(int star=1; star<=7; star++)
      {
      System.out.print("* "); 
      for(int space=1; space<=6;space++)
        {
        System.out.print("  ");
        }
      System.out.println("*"); 
      }
    for(int col=1; col<=7; col++)
      {
       if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    
  }
	


private void print_O() {
	// TODO Auto-generated method stub
	  for(int col=1; col<=7; col++)
      {
      if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    System.out.println();
  for(int star=1; star<=7; star++)
      {
      System.out.print("* "); 
      for(int space=1; space<=6;space++)
        {
        System.out.print("  ");
        }
      System.out.println("*"); 
      }
  for(int col=1; col<=7; col++)
      {
       if(col==1)
          System.out.print("  "); 
      else
          System.out.print("* "); 
      }
    
  }
	


private void print_E() {
	// TODO Auto-generated method stub
	
		    for(int col=1; col<=7; col++)
		      {
		      if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println();
		  for(int star=1; star<=7; star++)
		      {
		      System.out.println("* "); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    System.out.println(); 
		    for(int star=1; star<=7; star++)
		      {
		      System.out.println("* "); 
		      }
		  for(int col=1; col<=7; col++)
		      {
		       if(col==1)
		          System.out.print("  "); 
		      else
		          System.out.print("* "); 
		      }
		    
		    
		  }
	


private void print_c() {
    // TODO Auto-generated method stub
     for(int col=1; col<=7; col++)
        {
        if(col==1)
            System.out.print("  "); 
        else
            System.out.print("* "); 
        }
      System.out.println();
    for(int star=1; star<=7; star++)
        {
        System.out.println("* "); 
        }
    for(int col=1; col<=7; col++)
        {
         if(col==1)
            System.out.print("  "); 
        else
            System.out.print("* "); 
        }
      
    }
    
  }