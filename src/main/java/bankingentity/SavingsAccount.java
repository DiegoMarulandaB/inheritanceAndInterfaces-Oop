package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:19:58 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part twelve

public class SavingsAccount extends BankAccount {


	public SavingsAccount(int agency, int number) {
		super(agency, number);
	}

	@Override
	public void depositMoney(double value) {
		this.balance += value;
	}
}
