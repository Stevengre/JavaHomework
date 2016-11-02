package ten;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	static private double annualInterestRate = 0;
	private Date dateCreated;
	
	Account(){
		id = 0;
		balance = 0;
		dateCreated = new Date();
	}
	
	Account(int id, double balance){
		dateCreated = new Date();
		this.balance = balance;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public boolean withDraw(double draw) {
		if (balance-draw>=0) {
			balance = balance - draw;
			return true;
		} else {
			return false;
		}
	}
	
	public void deposit(double money) {
		balance = balance + money;
	}
	
}
