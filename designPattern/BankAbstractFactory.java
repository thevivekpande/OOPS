package designPattern;

import java.util.Scanner;

interface Bank{
	public String getBankName();
}

class HDFC implements Bank{
	private final String bName;
	
	HDFC(){
		bName="HDFC Bank";
	}

	@Override
	public String getBankName() {
		return bName;
	}
	
}

class SBI implements Bank{
	
	private final String bName;
	
	SBI(){
		bName="SBI Bank";
	}

	@Override
	public String getBankName() {
		return bName;
	}
	
}

class ICICI implements Bank{
	private final String bName;
	
	ICICI(){
		bName="ICICI Bank";
	}
	
	@Override
	public String getBankName() {
		return bName;
	}
	
}

abstract class Loan{
	double rate;
	abstract void getInterest(double rate);
	public void calculateLoanPayment(double loan, double amount, double year) {
		   System.out.println("Loan Payment = " + loan*amount*year);
	}
}

class HomeLoan extends Loan{
	@Override
	void getInterest(double rate) {
		this.rate=rate;
	}
}

class BusinessLoan extends Loan{
	@Override
	void getInterest(double rate) {
		this.rate=rate*2.0;
	}
}

class EducationLoan extends Loan{
	@Override
	void getInterest(double rate) {
		this.rate=rate*0.5;
	} 
}

abstract class AbstractFactory{
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan); 
}

class BankFactory extends AbstractFactory{
	@Override
	public Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("HDFC")) return new HDFC();
		else if(bank.equalsIgnoreCase("SBI")) return new SBI();
		else if(bank.equalsIgnoreCase("ICICI")) return new ICICI();
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}
	
}

class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan.equalsIgnoreCase("HomeLoan")) return new HomeLoan();
		else if(loan.equalsIgnoreCase("EducationLoan")) return new EducationLoan();
		else if(loan.equalsIgnoreCase("BusinessLoan")) return new BusinessLoan();
		return null;
	}
	
}

class FactoryCreator{
	public static AbstractFactory  getFactory(String type) {
		if(type.equalsIgnoreCase("bank")) return new BankFactory();
		else if(type.equalsIgnoreCase("loan")) return new LoanFactory();
		return null;
	}
}

public class BankAbstractFactory {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name of bank");
		String bankName=scan.next();
		System.out.println("Enter the type of loan");
		String loanName=scan.next();
		System.out.println("Enter rate, amount and year");
		double rate=scan.nextDouble();
		double amount=scan.nextDouble();
		double time=scan.nextDouble();
		
		AbstractFactory abstractFact=FactoryCreator.getFactory("bank");
		System.out.println(abstractFact.getBank(bankName));
		
		AbstractFactory abstractFactory= FactoryCreator.getFactory("loan");
		Loan loan=abstractFactory.getLoan(loanName);
		loan.getInterest(rate);
		loan.calculateLoanPayment(rate, amount, time);
		
	}
}
