package c.b.a;
public class Person{
	public String name,surname;
	public Person(){
		name=surname="UNKNOWN";
		}
	public Person(String n, String sn){
		name=n;
		surname=sn;
		}
	public Person(Person p){
		name=p.name;
		surname=p.surname;
		}
}