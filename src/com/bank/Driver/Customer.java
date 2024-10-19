package com.bank.Driver;
import com.bank.Abstract.*;
import com.bank.Concrete.*;
import java.util.*;
public class Customer {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		Scanner sc=new Scanner(System.in);
		long accno;
		float accbal = 0.0f;
		String accname;
		int acctype;
		boolean isSalaried=true;
		float creditLimit=0.0f;
		float wd=0.0f;
		float dp=0.0f;
		int wtype;
		
		System.out.println("...........Welcome to MONEYMONEY BANK..........");
		System.out.println("Please Enter your Account No: ");
		accno=sc.nextLong();
		System.out.println("Please Enter your Bank Balance: ");
		accbal=sc.nextLong();
		System.out.println("Please Enter your Account Holder Name: ");
		accname=sc.next();
		System.out.println("Please Enter your Credit Limit: ");
		creditLimit=sc.nextFloat();
		
		System.out.println("Please choose your account type(1 or 2): ");
		System.out.println("1.Savings");
		System.out.println("2.Current");
		acctype=sc.nextInt();
		switch(acctype)
		{
		case 1:
		{
			SavingAcc sa=new MMSavingAcc(accno,accbal,accname,isSalaried);
			System.out.println("Please select the work you want to do:");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			wtype=sc.nextInt();
			switch(wtype)
			{
			case 1:
			{
				System.out.println("Enter the amount you want to withdraw:");
				wd=sc.nextFloat();
				sa.withDraw(wd);
				System.out.println(sa);
				System.out.println();
				break;
			}
			case 2:
			{
				System.out.println("Enter the amount you want to deposite:");
				dp=sc.nextFloat();
				sa.deposite(dp);
				System.out.println(sa);
				System.out.println();
				break;
			}
			}
			
			
		}
		case 2:
		{
			CurrentAcc cr=new MMCurrentAcc(accno,accbal,accname,creditLimit);
			System.out.println("Please select the work you want to do:");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposite");
			wtype=sc.nextInt();
			switch(wtype)
			{
			case 1:
			{
				System.out.println("Enter the amount you want to withdraw:");
				wd=sc.nextFloat();
				cr.withDraw(wd);
				System.out.println(cr);
				System.out.println();
				break;
			}
			case 2:
			{
				System.out.println("Enter the amount you want to deposite:");
				dp=sc.nextFloat();
				cr.deposite(dp);
				System.out.println(cr);
				System.out.println();
				break;
			}
			}
		
		}
			
		

	}

	}
}
