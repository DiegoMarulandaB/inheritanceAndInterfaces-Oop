package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:5/31/2022
 * time:22:10 PM
 * projectName:inheritanceAndInterfaces
 * */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//TODO parte three
//BankOfficials

public class BankManager extends BankOfficials implements Authentication {

	private static final Logger logger = LogManager.getLogger(BankManager.class);

	//about writing method
	//super, https://www.geeksforgeeks.org/difference-between-super-and-super-in-java-with-examples/#:~:text=super()-,The%20super%20keyword%20in%20Java%20is%20a%20reference%20variable%20that,call%20parent%20class'%20constructors%20only.
	//The getBankOfficerBonus is the most specific method , BankAccountant


	public double getBankOfficerBonus() { //BankOfficial.java
		logger.info("Running from the BankManager class");
		return 2000;
	}

	@Override
	public void setPassword(String password) {

	}

	@Override
	public boolean logIn(String password) {
		return false;
	}
}

