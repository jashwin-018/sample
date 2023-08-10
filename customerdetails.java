
public class customerdetails {
int accno;
String name,address;
double balance;
public customerdetails(int accno, String name, String address, double balance) {
	super();
	this.accno = accno;
	this.name = name;
	this.address = address;
	this.balance = balance;
	
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

	
}
