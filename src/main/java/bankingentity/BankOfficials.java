package bankingentity;/*
 * @author:Diego Marulanda B.
 * date:5/31/2022
 * time:17:44 PM
 * projectName:inheritanceAndInterfaces
 * */

//TODO part one

/*
When it is abstract it cannot be instantiated, since it is a conceptual representation, but it is not a physical representation of the object.
To solve this problem, you must put a Bank Accountant or, failing that, an object that is a physical representation
*/
public abstract class BankOfficials {
	//attributes

	private String name;
	private String bankOfficialIdentificationDocument;
	private double salary;

	private int type;

	//Constructor
	public BankOfficials() { //Abstract class can have constructor

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankOfficialIdentificationDocument() {
		return bankOfficialIdentificationDocument;
	}

	public void setBankOfficialIdentificationDocument(String bankOfficialIdentificationDocument) {
		this.bankOfficialIdentificationDocument = bankOfficialIdentificationDocument;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double getBankOfficerBonus();

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}

