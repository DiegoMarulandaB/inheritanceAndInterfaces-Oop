package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:22:19 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part sixteen
//In the interface, all methods are abstract.
//The interface cannot have a constructor.
//The interface cannot have methods implemented

public interface Authentication {

	public void setPassword(String password);

	public boolean logIn(String password);

}
