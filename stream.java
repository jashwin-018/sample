import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class stream {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	List<customerdetails> l =new ArrayList<customerdetails>();
	
	System.out.print("How many Customers you want to Add:");
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++) 
	{
	System.out.println("Enter Account Number :");
	int acno=sc.nextInt();
	System.out.println("Balance Amount :");
	Double abal = sc.nextDouble();
	System.out.println("Enter Account Holder Name  :");
	String aname = sc.next();
	
	System.out.println("Enter Location  :");
	String aloc = sc.next();

	
	System.out.println("Added............");
	
	l.add(new customerdetails(acno,aname,aloc,abal));
	}
	
	for(customerdetails c : l)
		System.out.println("Name: "+c.getName()+"  Address : "+c.getAddress());
	
	List<String> s=l.stream().filter(p -> p.address.equals("Erode")).map(p->p.name).collect(Collectors.toList());
	
	System.out.println(s);
}
}
