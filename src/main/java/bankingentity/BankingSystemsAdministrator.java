package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time: 22:12 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part fourteen
//The extends, only serves to extend from parent to child
//Can't multiple inheritance

public class BankingSystemsAdministrator extends BankOfficials implements Authentication {

	private UsefulAuthentication useful;

	public BankingSystemsAdministrator() {
		this.useful = new UsefulAuthentication();
	}

	@Override
	public double getBankOfficerBonus() {
		return this.getSalary();
	}

	@Override
	public void setPassword(String password) {
		//this.password = password;
		this.useful.setPassword(password);

	}

	@Override
	public boolean logIn(String password) {

		return this.useful.login(password);
	}
}
