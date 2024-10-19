package com.bank.Abstract;

abstract public class SavingAcc extends BankAcc{
	
	private static final float minbal = 1000.0f;
	private boolean isSalaried;
	long accNo;
	float accBal;
	String accNm;
	float amountToWithdrawl;
	
	public SavingAcc(long accNo, float accBal, String accNm,boolean isSalaried) {
		super(accNo, accBal, accNm);
		this.isSalaried=isSalaried;
	
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", accNo=" + accNo + ", accBal=" + accBal + ", accNm=" + accNm
				+ "]";
	}
	
	public void withDraw(float amountToWithdraw)
	{
		if(amountToWithdraw<minbal && isSalaried==true)
		{
			System.out.println("Dear savings account customer,You are not able to withdraw money as it is less than minimum balance");
			System.out.println("You need to withdraw money above"+minbal);
		}
		
	}
	
	
   
	

}
