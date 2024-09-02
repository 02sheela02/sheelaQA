package org.constractor;

public class FeesDetails {     //className
	
	
	public FeesDetails() {    //Non-parameterised constractor/default constractor
		System.out.println("Academic year fees details ");	
		}
	public FeesDetails(String name){      //parameterised constractor
		
		System.out.println("fees details for class 10");		
	}
	FeesDetails(int amount) {   //parameterised contractor
		System.out.println("Fees amount is"+amount);
		}
	
	public FeesDetails(String n, int f) {
		System.out.println("Total fees amount for tenth class"+"is Rs."+f);
	}
	public static void main(String[] args) {
	FeesDetails a= new FeesDetails();
	FeesDetails b=new FeesDetails("full payment");
	FeesDetails c=new FeesDetails(5000);
	FeesDetails d=new FeesDetails("10th standard",50000);
	
	
	}}
	
		
			
			
	
		
