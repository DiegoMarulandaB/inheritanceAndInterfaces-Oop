package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:5/31/2022
 * time:22:16 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO parte four
//inheritance

public class BankManagerTest1 {

	private static final Logger logger = LogManager.getLogger(BankManagerTest1.class);

	public static void main(String[] args) {
		BankManager manager = new BankManager();
		//gerente.setBankManagersalary(5000);

		//	BankOfficial manager = new BankOfficial();
		manager.setName("Maria");
		manager.setSalary(6000);
		manager.setPassword("k123G");
		manager.setType(1);

		logger.info("Bank manager salary bonus $ " + manager.getBankOfficerBonus());
		logger.info("Maria's password entry is " + manager.logIn("k123G"));
	}


}
