package String;
class Employee{
	public String pid;
	public String ename;
	public String desig;
	public Employee(String pid,String ename,String desig)
	{
		this.pid=pid;
		this.ename=ename;
		this.desig=desig;
	}
	public String toString()
	{
		return pid+"==>"+ename+"===>"+desig;
	}
}

public class Checkobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Employee emp=new Employee("ei","rg","hr");
      System.out.println(emp);
	}

}
