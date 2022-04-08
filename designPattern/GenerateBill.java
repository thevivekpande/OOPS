package designPattern;
import java.util.*;
abstract class ElectricBillPlan{
	double billRate;
	abstract void getRate();
	public void calculateBill(int unit) {
		System.out.println(unit*billRate);
	}
}
class DomesticPlan extends ElectricBillPlan{
	@Override
	void getRate() {
		billRate=4.50;
	}
}
class CommercialPlan extends ElectricBillPlan{
	@Override
	void getRate() {
		billRate=7.50;
	}
}
class industrialPlan extends ElectricBillPlan{
	@Override
	void getRate() {
		billRate=10.00;
	}
}
class GetPlanFactory {
	public ElectricBillPlan getBillPlan(String billPlan) {
		if(billPlan.equals("Domestic"))
			return new DomesticPlan();
		if(billPlan.equals("Commercial"))
			return new CommercialPlan();
		if(billPlan.equals("industrial"))
			return new industrialPlan();
		return null;
	}
}
public class GenerateBill {
	public static void main(String[] args) {
		GetPlanFactory getPlanFactory=new GetPlanFactory();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of plan");
		String plan=scan.next();
		System.out.println("Enter unit");
		int n=scan.nextInt();
		ElectricBillPlan bill=getPlanFactory.getBillPlan(plan);
		System.out.println(bill);
		bill.getRate();
		bill.calculateBill(n);
	}
}
