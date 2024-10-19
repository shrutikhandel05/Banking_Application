package com.bank.Abstract;

abstract public class BankAcc {
	long  accNo;
	float accBal;
	String accNm;
	float amountToWithdrawl;
	float amountToDeposite;
	
	public BankAcc(long accNo, float accBal, String accNm) {
		
		this.accNo = accNo;
		this.accBal = accBal;
		this.accNm = accNm;
	}
	


	public long getAccNo() {
		return accNo;
	}
	
	public float getAccBal() {
		return accBal;
	}


	public String getAccNm() {
		return accNm;
	}


	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accBal=" + accBal + ", accNm=" + accNm + "]";
	}
	
	abstract public void withDraw(float amountToWithdrawl);

	abstract public void deposite(float amountToDeposite);
	
	
 
}
