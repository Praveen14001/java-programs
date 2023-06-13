package com.learning;

public class Loopingdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loopingdemo2 ld = new Loopingdemo2();
//		ld.print_fibo();
		ld.print_fibo_without_third();	
		ld.find_sqr_root(81);
		}
	private void find_sqr_root(int no) {
	    // TODO Auto-generated method stub
	    int div = 2; 
	    while(div<no)
	    {
	    if(no/div == div)
	    {
	      System.out.println(div);
	      break; 
	    }
	    div++;
	    }
	  }
		private void print_fibo_without_third() {
		// TODO Auto-generated method stub
			int p1=0,p2 =1;
			while(p1<=21)
			{
				System.out.println(p1);
				p2 = p1 + p2;
				p1 = p2- p1;
				
			}
		
	}
		 public static void main1(String[] args) {
		    // TODO Auto-generated method stub
		    int p1 = 0, p2 = 1; 
		    while(p1<=56)
		    {
		    System.out.print(p1+" ");
		    int p3 = p1 + p2; 
		    p1 = p2;
		    p2 = p3; 
		    }
		  

		}

}
