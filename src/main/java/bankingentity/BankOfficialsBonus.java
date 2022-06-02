package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:18:15 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part six
//polymorphism

public class BankOfficialsBonus {

	private static final Logger logger = LogManager.getLogger(BankOfficialsBonus.class);

	private double sum;

	//Calculating the salary of the bank official + bonus , BankOfficialsBonusTest1
	// 5% bankOfficerBonus = 100 , BankOfficials

	//Calculating bank manager salary+ bonus , BankOfficialsBonusTest1
	// 5% of 10000 = 500 , super.getSalary + getBankOfficerBonus , BankManager
	// 10000 + 500 = 10500 , BankOfficialsBonusTest1
	// 5% bankOfficerBonus = 100 + 10500 = 10600 , BankOfficials

	//Calculating the salary of the bank accountant

	//!Explanation of polymorphism.
	//The BankOfficials parameter is the most generic and includes classes that are children of BankOfficials,
	// example BankOfficial , BankManager, BankAccountant
	public double recordSalary(BankOfficials official) {
		this.sum = official.getBankOfficerBonus() + this.sum;
		logger.info("Calculating the current salary of the bank official $" + this.sum);
		return this.sum;
	}

}
