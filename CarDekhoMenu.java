
package com.jspiders.cardekho_case_study.main;

import java.util.Scanner;

import com.jspiders.cardekho_case_study.operation.CarOperation;
public class CarDekhoMenu {
	
//	private static CarOperation Operation =new CarOperation();
//	private static boolean loop=true;
	
	
	public static void main(String[] args) {
		CarOperation Operation =new CarOperation();
		boolean loop=true;
	while(loop) {
		System.out.println("===========Menu=============\n"
				   +"1..Add/remove car details\n"
				   +"2.search car details\n"
				   +"3.update car details\n"			  
				   +"4.delete car details\n"
				   +"5.Go to main menu\n");
		 Scanner sc=new Scanner(System.in);
	  	   System.out.println("Enter your  choice:");
		 int choice=sc.nextInt();
	
      
	  
	
	switch(choice) {
		case 1:{
			System.out.println("Add car details");
			 System.out.println("===========Menu=============\n"
					   +"1..Add car details\n"
					   +"2.remove car details\n"
					   +"5.Go to main menu\n");
			        
			         int choice1=sc.nextInt();
			         switch(choice1) {
			         case 1:{
			        	 
						Operation.addCarDetails(); 
			        	  break;
			         }
			         case 2:{
			        	 Operation.deleteCar();
			        	  break;
			         }
			         case 3:{
//			        	 Operation.updateDetails();
			        	 break;
			         }
			         case 4:{
			        	 break;
			         }
			     }
		
		      break;
		  }
		  case 2: {
		   System.out.println("==========menu==========\n");
		   System.out.println("1.search car by  name \n"
		   		+ "2.search car by brand \n"
		   		+ "3.search car by fuel type\n"
		   		+ "4.Go Back");
		   int choice2=sc.nextInt();
		   switch(choice2) {
		   case 1: {
//		   Operation.searchByName();
//		    carOperation.displayAlldetails();
		    break;
		   }
		   case 2:{
//		   Operation.searchBybrand();
		    break;
		   }
		     case 3:{
//		    Operation.searchByFueltype();
		    }
		     case 4:{
		    	 break;
		     }
		   }
		   break;
		  }
		  case 3:{
		 System.out.println("========update========= \n");
//		 Operation.updateCar();
		 break;

		  }
		  case 4:{
		 loop=false;
		 break;
		  }
		  }
		  }

	
}
}
	
