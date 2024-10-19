package com.bank.Concrete;

import com.bank.Abstract.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float minbal = 500.0f;
	 boolean isSalaried;
	 private float amountToWithdrawl;
	 private float amountToDeposite;
	 float accBal=getAccBal();
	 long accNo=getAccNo();
	 String accNm=getAccNm();
	 
	 
	
	
	

	public MMSavingAcc(long accNo, float accBal, String accNm, boolean isSalaried) {
		super(accNo, accBal, accNm, isSalaried);
		this.isSalaried=isSalaried;
	
		
		
	}

	public void withDraw(float amountToWithdrawl)
	{
		if((accBal-amountToWithdrawl)>minbal)
		{
			System.out.println("Your amount"+amountToWithdrawl+"is withdrawn successfully..");
			accBal=accBal-amountToWithdrawl;
		}
		else
		{
		if((accBal-amountToWithdrawl)>minbal)
		{
			System.out.println("Dear savings account customer,You are not able to withdraw money as it is more than minimum balance");
			System.out.println("We need to maintain min. Balance of "+minbal);
		}
		else if(amountToWithdrawl>accBal)
		{
			System.out.println("You are not able to withdraw amount as account balance is less than amount entered..");
		}
		}
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried=" + isSalaried 
				+ ", accBal=" + accBal + ", accNo=" + accNo + ", accNm="
				+ accNm + "]";
	}

	@Override
	public void deposite(float amountToDeposite) {
		accBal=accBal+amountToDeposite;
		System.out.println("Your deposited money is:"+amountToDeposite+"And available balance is"+accBal);
		
	}

	
	
	

	
}
