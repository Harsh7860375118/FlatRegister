package com.cg.flatregister.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.flatregister.Dto.FlatRegister;
import com.cg.flatregister.Service.FlatService;
import com.cg.flatregister.Service.FlatServiceImpl;
import com.cg.flatregister.exception.FlatException;


public class Main {
	public static void main(String args[]) throws FlatException{
		FlatService service = new FlatServiceImpl();
		Scanner sc = new Scanner(System.in);
		
		int ch = 0;
		do{
			System.out.println("1: Register Flat");
			System.out.println("2: Display details");
			System.out.println("3: Exit");
			System.out.println("Enter Your Choice");
			ch = sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Existing Owner ID are :-[1,2,3]");
			System.out.println("Enter the owner id form above list : ");
			int oid = sc.nextInt();
			if(service.validateOwnerId(oid)==false){
				throw new FlatException("Invalid name format");
			}
			System.out.println("Select Flat Type(1,2)");
			int flatid = sc.nextInt();
			System.out.println("Enter Flat area in sq ft : ");
			int area = sc.nextInt();
			System.out.println("Enter rent amount : ");
			int rent = sc.nextInt();
			System.out.println("Enter deposit amount : ");
			int amt = sc.nextInt();
			
			
			FlatRegister flatreg = new FlatRegister();
			flatreg.setFlattype(flatid);
			flatreg.setFlatarea(area);
			flatreg.setRent(rent);
			flatreg.setDepositamt(amt);
			
			int rn = service.registerFlat(flatreg);
			System.out.println("Flat Successfully registered : Registration id : "+rn);
		break;
		
		case 2:
			System.out.println("Enter the Flat Type");
			int ftype = sc.nextInt();
			
			flatreg  = service.getAllOwnerIds(ftype);
			if(flatreg == null){
				System.out.println("No record found");
			}else{
				System.out.println(flatreg.getRent());
				System.out.println(flatreg.getFlatarea());
				System.out.println(flatreg.getDepositamt());			
				}
		break;
	
}
}while(ch!=3);
	}
}
