package c.b;
import c.b.a.Person;
public class ContactInfo extends Person{
	public long phone;
	public ContactInfo(){
		phone=0;
		}
	public ContactInfo(String n, String sn,long p){
		super(n,sn);
		phone=p;
		}
	public ContactInfo(ContactInfo c){
		super(c);
		phone=c.phone;
		}
}