package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:22:08 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part thirteen
public class BankAccountTest {

	private static final Logger logger = LogManager.getLogger(BankAccountTest.class);

	public static void main(String[] args) {
		CurrentAccount currentAccount1 = new CurrentAccount(1, 1);
		SavingsAccount savingsAccount1 = new SavingsAccount(2, 2);

		currentAccount1.depositMoney(2000);
		currentAccount1.transferMoney(1000, savingsAccount1);

		//The message I am creating an account is located at BankAccount

		logger.info("The balance in the current account is $" + currentAccount1.getBalance());
		logger.info("The balance in the savings account is $" + savingsAccount1.getBalance());

	}

}
