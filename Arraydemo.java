package com.learning;

public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][5];
	    //quarterly: 
	int exam = 0; 
	int subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 65; subject++;
	    marks[exam][subject] = 78; subject++;
	    
	    //half yearly: 
	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 92; subject++;
	    marks[exam][subject] = 99; subject++;
	    marks[exam][subject] = 100; subject++;
	    marks[exam][subject] = 95; subject++;
	    
	    //annual
	    exam++; 
	    subject = 0; 
	    marks[exam][subject] = 87; subject++;
	    marks[exam][subject] = 90; subject++;
	    marks[exam][subject] = 95; subject++;
	    marks[exam][subject] = 98; subject++;
	    marks[exam][subject] = 93; subject++;
	    
	    int high = 0; int examno=-1;
	    for(exam = 0; exam<3; exam++)
	    {
	      int total = 0; 
	      for(subject = 0; subject<5; subject++)
	      {
	        total = total + marks[exam][subject];
	      }
	      System.out.println("Total: "+ total);
	      if(total>high)
	      {
	    	  
	    	  high =total;
	    	  examno=exam;
	      }
	    }
	    System.out.println("Highest total is "+ high 
	    	    + " in exam no: "+examno );
	}
}
	    
//	  exam = 0; 
//		  for(exam = 0; exam<3; exam++)
//		  {
//		    for(subject=0; subject<5; subject++)
//		    {
//		    	if(marks[exam][subject]==100)
//		    	{
//		    		System.out.println(exam);
//		    		System.out.println(subject);
//		    	}
//		     // System.out.print(marks[exam][subject]+" ");
//		    }
//		    System.out.println();
//		  }
//	}
//	}