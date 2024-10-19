package com.bank.Concrete;

import com.bank.Abstract.BankFactory;
import com.bank.Abstract.CurrentAcc;
import com.bank.Abstract.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(long accNo, float accBal, String accNm, boolean isSalaried) {
		MMSavingAcc msaving=new MMSavingAcc(accNo, accBal, accNm, isSalaried);
		return msaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(long accNo, float accBal, String accNm, float creditLimit) {
		MMCurrentAcc mcurrent=new MMCurrentAcc(accNo, creditLimit, accNm, creditLimit);
		return mcurrent;
	}

}
