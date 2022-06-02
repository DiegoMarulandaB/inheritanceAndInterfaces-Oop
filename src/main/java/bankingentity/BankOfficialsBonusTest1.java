package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:18:22 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part seven

public class BankOfficialsBonusTest1 {

	private static final Logger logger = LogManager.getLogger(BankOfficialsBonusTest1.class);

	public static void main(String[] args) {
		BankOfficials official = new BankAccountant(); //BankOfficialTest1, official
		official.setSalary(2000);

		BankManager manager = new BankManager(); // BankManagerTest1, manager
		manager.setSalary(10000);

		BankAccountant accountant = new BankAccountant();
		accountant.setSalary(5000);

		//officials bonus control
		BankOfficialsBonus officialsBonusControl = new BankOfficialsBonus();
		officialsBonusControl.recordSalary(official); // return this.salary * 0.05 .BankManager
		logger.info("");

		officialsBonusControl.recordSalary(
				manager); //BankManager, super.getSalary + super.getBankOfficerBonus , BankOfficialBonus
		logger.info("");

		officialsBonusControl.recordSalary(accountant); //BankOfficialBonus
		logger.info("");


	}

}
