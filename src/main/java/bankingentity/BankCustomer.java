package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:6/1/2022
 * time:18:48 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part ten
//Cliente


public class BankCustomer implements Authentication {


	private String customerName;
	private String identificationDocument;
	private String phoneNumber;

	private UsefulAuthentication useful;

//	private String password;

	public BankCustomer() {
		this.useful = new UsefulAuthentication();
	}


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) { //setter,siempre va a solicitar un dato o valor
		this.customerName = customerName;
	}

	public String getIdentificationDocument() {
		return identificationDocument;
	}

	public void setIdentificationDocument(String identificationDocument) {
		this.identificationDocument = identificationDocument;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void setPassword(String password) {
		//this.password = password;
		this.setPassword(password);

	}

	@Override
	public boolean logIn(String password) {
		return this.useful.login(password);
	}
}
