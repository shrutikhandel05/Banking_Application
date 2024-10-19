package com.bank.Abstract;

abstract public class CurrentAcc extends BankAcc {
	
	final private float creditLimit;
	long accNo;
	float accBal;
	String accNm;
	
	public CurrentAcc(long accNo, float accBal, String accNm,float creditLimit) {
		super(accNo, accBal, accNm);
		this.creditLimit=creditLimit;
	}
    @Override
	public void withDraw(float amountToWithdrawl)
	{
		System.out.println("Dear current account Customer,You are not able to withdraw money as it is less than summation of your credit limit and balance");
		System.out.println("You need to withdraw money above"+(accBal+creditLimit));
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accNo=" + accNo + ", accBal=" + accBal + ", accNm=" + accNm
				+ "]";
	}
	

}
