package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:5/31/2022
 * time:17:54 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part two
//The tests are to see the reason for things and their operation

public class BankOfficialsTest1 {

	private static final Logger logger = LogManager.getLogger(BankOfficialsTest1.class);

	public static void main(String[] args) {
		BankOfficials official1 = new BankAccountant();
		official1.setName("Carlos");
		official1.setBankOfficialIdentificationDocument("12345");
		official1.setSalary(2000);
		official1.setType(0);

		logger.info("Carlos's salary is $ " + official1.getSalary());
		logger.info(official1); //space in memory of the variable official1
		logger.info("");

		logger.info(
				"This is the bonus of the bank official1 named Carlos $ "
						+ official1.getBankOfficerBonus());
	}

}
