package com.springcoreQ3;

public abstract class BankImp  implements BankInt{
	
	private void BankAccRepositoryImpl(){
		  Bank bankaccount = new Bank();
		  bankaccount.setAccountHolderName("Mounika");
		  bankaccount.setAccountId(65);
		  bankaccount.setAccountType("Savings");
		  bankaccount.setAccountBalance((long) 20345.5);
}
}
