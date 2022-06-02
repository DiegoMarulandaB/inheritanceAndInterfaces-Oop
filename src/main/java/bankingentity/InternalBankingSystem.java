package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time: 22:16 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO part fifteen

public class InternalBankingSystem {

	private static final Logger logger = LogManager.getLogger(InternalBankingSystem.class);

	private String password = "k123G";

	public boolean authentication(Authentication manager) {
		boolean startAccount = manager.logIn(password);
		if (startAccount) {
			logger.info("Log in successful");
			return true;
		} else {
			logger.info("Log in denied");
			return false;
		}
	}

}
