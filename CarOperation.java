package com.jspiders.cardekho_case_study.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspiders.cardekho_case_study.entity.Car;
public class CarOperation {
	
	static ArrayList<Car> list = new ArrayList<Car>();

	 static Scanner sc = new Scanner(System.in);

	 public void addCarDetails() {

	
	  System.out.println("please enter how many car you want to add");

	  int choice = sc.nextInt();

	  for (int i = 0; i < choice; i++) {

	   System.out.println("Enter car name");

	   String name = sc.next();

	   System.out.println("enter car_id ");

	   int id = sc.nextInt();

	   System.out.println("enter car mmodel");

	   String mname = sc.next();

	   System.out.println("enter car brand");

	   String bname = sc.next();

	   System.out.println("enter car fueltype");

	   String fname = sc.next();

	   System.out.println("enter price");

	   Double pvalue = sc.nextDouble();

	   Car ch= new Car();

	   ch.setName(name);

	   ch.setCar_id(id);

	    ch.setModel(mname);

	   ch.setBrand(bname);

	   ch.setFueltype(fname);

	  ch.setPrice(pvalue);

	   list.add(ch);

	   System.out.println(ch.getName()+" :is added");



	  }

	 }

	 
	 
	 public void searchCarDetails() {

	 System.out.println("enter car name");

  // Display List of all songs

	  for (int i = 0; i < list.size(); i++) {

	   System.out.println(list.get(i));

	   System.out.println(i);

	  }
	 }

	 public void deleteCar() {

	  System.out.println(" Remove Method ");

	  // Display List of all the song

	  displayAllCars();

	  System.out.println("Choose id of car to Remove : ");

	  int remove = sc.nextInt();

	  if (remove <= list.size()) {

	  for(int i=1;i<=list.size();i++) {

	   if (remove==i)

	   {

	    list.remove(i-1);

	    System.out.println(list.get(i) + "is removed");

 System.out.println(list.get(i).getName() +"is removed ");

	   }
	   }

	  }

	  else {

	   System.out.println("Enter valid Choice");

	  }

	 }


	 public void displayAllCars() {

	  System.out.println("display all details");

	  for (int i = 0; i < list.size(); i++) {

	   System.out.println(list.get(i));

	  }

	 }


	
	
  }
