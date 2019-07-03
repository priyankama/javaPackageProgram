package c;
import c.b.ContactInfo;
import c.b.a.Person;
public class Employee extends ContactInfo{
	double salary;
	public Employee(){
		salary=0;
		}
	public Employee(String n, String sn,long p,double s){
		super(n,sn,p);
		salary=s;
		}
	public Employee(Employee e){
		super(e);
		salary=e.salary;
		}
	public void show(){
		System.out.println("NAME = "+ name+" SURNAME = "+ surname+" PHONE = "+phone+" SALARY = "+salary);
		}
}