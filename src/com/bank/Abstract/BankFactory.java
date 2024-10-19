package com.bank.Abstract;

abstract public class BankFactory {
	
	long accNo;
	float accBal;
	String accNm;
	
	abstract public SavingAcc getNewSavingAcc (long accNo, float accBal, String accNm,boolean isSalaried);
	abstract public  CurrentAcc getNewCurrentAcc(long accNo, float accBal, String accNm,float creditLimit);

}
