package com.learning;

public class citizen extends Parent implements Gov,Zoho,StateGovt {

	public static void main(String[] args) {
		int no;
		//DYNAMIC BONDING
		Gov officer = new citizen();
		//
		officer.displayAddressProof();
		//
		citizen c1=new citizen();
	    c1.change2000Rupees();
	    c1.watchMovies();
	    System.out.println(Gov.fine_for_helmet);
	    System.out.println(citizen.last_date);
	      
	  }
	  public void watchMovies()
	  {
	    System.out.println("watching movies");
	  }

	  @Override
	  public void change2000Rupees() {
	    // TODO Auto-generated method stub
	      System.out.println("Changing in Bank");
	  }

	  @Override
	  public void displayIDProof() {
	    // TODO Auto-generated method stub
	     System.out.println("Aadhar Card");

	  }

	  @Override
	  public void displayAddressProof() {
	    // TODO Auto-generated method stub
	       System.out.println("Ration Card");

	  }

	  @Override
	  public void wearHelmet() {
	    // TODO Auto-generated method stub
	     System.out.println("Follow Traffic Rules");

	  }
	  @Override
	  public void develop() {
	    // TODO Auto-generated method stub
	    
	  }
	  @Override
	  public void test() {
	    // TODO Auto-generated method stub
	    
	  }
	  @Override
	  public void update() {
	    // TODO Auto-generated method stub
	    
	  }
	@Override
	void study() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void work() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void provide_Electricity() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lay_roads() {
		// TODO Auto-generated method stub
		
	}
	}


