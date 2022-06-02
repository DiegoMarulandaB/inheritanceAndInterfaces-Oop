package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:22:24 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part eighteen

/* Useful, it is used to enter methods that do not belong to any class, but have some functionality
 and this avoids reoccurring code*/

public class UsefulAuthentication {

	private String password;

	public boolean login(String password) {
		return this.password == password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
