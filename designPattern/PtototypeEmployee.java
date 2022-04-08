package designPattern;

import java.util.ArrayList;
import java.util.List;

//class Employee implements Cloneable{
//	private List<String> empList;
//	
//	public Employee() {
//		empList=new ArrayList<String>();
//	}
//	
//	public Employee(List<String> list) {
//		this.empList=list;
//	}
//	
//	public void loadData() {
//		empList.add("Vivek");
//		empList.add("Pandey");
//		empList.add("Virat");
//		empList.add("Dhoni");
//		empList.add("Kohli");
//	}
//	
//	public List<String> getEmpList(){
//		return this.empList;
//	}
//	
//	@Override
//	public Object clone() throws CloneNotSupportedException{
//		List<String> temp=new ArrayList<>();
//		for(String s:this.getEmpList()) {
//			temp.add(s);
//		}
//		return new Employee(temp);
//	}
//}

class Employee implements Cloneable{
	private List<String> empList;
	public Employee(){
		empList=new ArrayList<String>();
	}
	public void loadData() {
		empList.add("Vivek");
		empList.add("Pandey");
		empList.add("Virat");
		empList.add("Dhoni");
	}
	public Employee(List<String> list) {
		this.empList=list;
	}
	public List<String> getEmpList() {
		return this.empList;
	}
	
	@Override
	public Object clone(){
		List<String> temp=new ArrayList<>();
		for(String s:this.getEmpList()) {
			temp.add(s);
		}
		return new Employee(temp);
	}
}

public class PtototypeEmployee {

	public static void main(String[] args){
		// TODO Auto-generated method stub
//		List<String> list=new ArrayList<>();
		Employee emp=new Employee();
		emp.loadData();
		Employee emp1=(Employee) emp.clone();
		Employee emp2=(Employee) emp.clone();
		List<String> list1=emp1.getEmpList();
		List<String> list2=emp2.getEmpList();
		List<String> list=emp.getEmpList();
		System.out.println(list);
		System.out.println(list1);
		list1.add("Rajshekhar");
		list2.remove("Virat");
		System.out.println(list1);
		System.out.println(list2);
	}

}
