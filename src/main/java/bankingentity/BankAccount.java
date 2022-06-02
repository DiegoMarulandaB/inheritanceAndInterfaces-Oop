package bankingentity;/*
 * @author:Diego Marulanda B.
 * date: 6/1/2022
 * time:18:40 PM
 * projectName:entidadBancaria
 * */

//TODO part nine
//extension para resaltar los commentarios , bettercomments

import org.apache.logging.log4j.LogManager; //!los import, private static final y looger los pueden borrar
import org.apache.logging.log4j.Logger;

public abstract class BankAccount { //!class, representa un tipo, un objeto o una entidad, en este caso es cuenta

	private static final Logger logger = LogManager.getLogger(BankAccount.class);
	//atributos de la cuenta
	//todos los atributos se inician en 0 porque las variables  no tienen ningun valor, ejemplo saldo;, en caso del String titular; su valor es null

	//private es un modificador de acceso, y restringe cambios sin usar metodos predefinidos Getter
	protected double balance;
	private int agency = 1;
	private int number;
	private BankCustomer accountHolder = new BankCustomer(); //reeferencia a objeto

	public BankAccount() {

	}

	private static int total; //La variable total, no pertenece a la instancia (new Cuenta) ya que es static, sino que pertenece a la clase Cuenta

	public BankAccount(int agency, int number) {
		this.agency = agency;
		this.number = number;
		logger.info("Account number has been created " + this.number);
		logger.info("");
		BankAccount.total++;
	}


	//!Metodo es la secuencia de pasos para realizar una accion
	//void es un metodo que no retorna nada
	//this se refiere a que se esta trabajando con este objeto, ejemplo this.saldo//
	//public es un modificador
	public abstract void depositMoney(double value);

	public boolean withDrawals(double value) {
		if (this.balance >= value) {
			this.balance -= value;
			return true;
		}
		return false;
	}

	// account es un objeto del tipo Cuenta
	public boolean transferMoney(double value, BankAccount destiny) {
		if (this.balance >= value) {
			this.withDrawals(value);
			destiny.depositMoney(value);
			return true;
		} else {
			return false;
		}
	}

	//getter y setter
	public double getBalance() { //getter sirve para obtener el valor de una clase privada
		return balance;
	}

	public void setBalance(double balance) { //setter,siempre va a solicitar un dato o valor
		this.balance = balance;
	}

	public int getAgency() {
		return agency;
	}


	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public BankCustomer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(BankCustomer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public static int getTotal() {
		return BankAccount.total;
	}
}
