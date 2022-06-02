package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:18:30 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part eight

public class BankAccountant extends BankOfficials {

	private static final Logger logger = LogManager.getLogger(BankAccountant.class);

	public double getBankOfficerBonus() { //The getBankOfficerBonus is the most specific method, BankManager
		logger.info("Running from the BankAccountant class");
		return 200;
	}
}
