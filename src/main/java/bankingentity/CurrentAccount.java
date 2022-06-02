package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:19:55 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part eleven
//This is considered as polymorphism
/*A Bank Account turned into a Checking Account.
 * The Current Account implements its own logic, based on its parent class (Bank Account).*/

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int agency, int number) {
		super(agency, number);
	}

	@Override //about writing the method of the parent class, see the BankAccount class in WithDrawals
	public boolean withDrawals(double value) {
		double commission = 0.2;
		return super.withDrawals(value + commission);
	}

	@Override
	public void depositMoney(double value) {

	}
}
