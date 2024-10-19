package com.bank.Concrete;

import com.bank.Abstract.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	 private float creditLimit;
	 private float amountToWithdrawl;
	 private float amountToDeposite;
	 float accBal=getAccBal();
	 long accNo=getAccNo();
	 String accNm=getAccNm();
	 
    
	public MMCurrentAcc(long accNo, float accBal, String accNm, float creditLimit) {
		super(accNo, accBal, accNm, creditLimit);
		this.creditLimit=creditLimit;
	}
	
	
	 @Override
		public void withDraw(float amountToWithdrawl)
		{
		 if(((accBal+creditLimit)-amountToWithdrawl)<0)
		 {
			 
			System.out.println("Dear CURRENT ACCOUNT CUSTOMER,You are not able to withdraw money as it is less than summation of your credit limit and balance");
			System.out.println("You need to withdraw money amount is greater than"+(accBal+creditLimit));
			
		 }
		 else if(((accBal+creditLimit)-amountToWithdrawl)>0)
				 {
			 System.out.println("Your amount"+amountToWithdrawl+"is withdrawn successfully..");
			 accBal=accBal-amountToWithdrawl;
		 }
			
		
		}


	 @Override
		public void deposite(float amountToDeposite) {
		    accBal=accBal+amountToDeposite;
			System.out.println("Your deposited money is:"+amountToDeposite+"And available balance is"+accBal);
			
		}
	@Override
	public String toString() {
		return "Current Account User [creditLimit=" + creditLimit 
				+ ", accBal=" + accBal + ", accNo=" + accNo + ", accNm="
				+ accNm + "]";
	}

	


}
