package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:22:22 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part seventeen
public class InternalBankingSystemTest {

	public static void main(String[] args) {
		InternalBankingSystem system = new InternalBankingSystem();
		BankManager manager = new BankManager();
		BankingSystemsAdministrator administrator = new BankingSystemsAdministrator();

		system.authentication(manager);
		system.authentication(administrator);
	}
}
