package Java;
class patient{
	public String pid;
	public String pname;
	public int age;
	public patient(String pid,String pname,int age)//super class constructor 
	{
		this.pid=pid;
		this.pname=pname;
		this.age=age;
		
	}
	public void pdetails() {
		System.out.println("patient id "+pid);
		System.out.println("patient name "+pname);
		System.out.println("patient age "+age);
	}
}
class labtest extends patient
{
	public String testnm;
	public String testdt;
	public double price;
	public labtest(String pid,String pname,int age,String testnm,String testdt,double price)
	{
	   super(pid,pname,age);
	   this.testnm=testnm;
	   this.testdt=testdt;
	   this.price=price;
	}
	public void testdetails()
	{
		System.out.println("test done: "+testnm);
		System.out.println("test date: "+testdt);
		System.out.println("price:"+price);
		
	}
}

public class superconstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		labtest lt=new labtest("pt1","rudra",25,"x-ray","17/04/2025",1000.00);
		lt.pdetails();
		lt.testdetails();
		

	}

}
