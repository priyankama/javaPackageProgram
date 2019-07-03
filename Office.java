import c.Employee;
//import c.b.ContactInfo;
//import c.b.a.Person;
public class Office{
	public static void main(String args[]){
		Employee p1=new Employee();
		p1.show();
		Employee p2=new Employee("pihu","phalod",9571219540l,20000.00);
		p2.show();
		Employee p3=new Employee(p2);
		p3.show();
	}
}