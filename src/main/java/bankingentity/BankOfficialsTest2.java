package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:18:10 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part five
//polymorphism

public class BankOfficialsTest2 {

	private static final Logger logger = LogManager.getLogger(BankOfficialsTest2.class);

	//!The more generic element matches the more specific element
	public static void main(String[] args) {
		BankOfficials official2 = new BankManager();
		official2.setName("Juan");

		BankManager manager = new BankManager();
		manager.setName("Marcerla");

		official2.setSalary(2000);
		manager.setSalary(10000);

		manager.logIn("k123G");

		logger.info("entering Marcerla's password is " + manager.logIn("k123G"));
	}

}
