package Exception;
class calculator{
	int x=25;
	int y=5;
	public void result()
	{
	 try
	 {
		int z;
		z=x/y;//calle environment
		System.out.println("result: " +z);
	}
	 catch(ArithmeticException ar) {
		 //ar.printStackTrace();//exception name along with package name exception message line number where exception occures
		 //System.out.println(ar);//exception name along with package name exception message
		 System.out.println(ar.getMessage());
	 }
	 catch(Exception ex)
	 {
		 //ex.printStackTrace();
		 //System.out.println(ex);
		 System.out.println(ex.getMessage());
	 }
	 finally {
		 System.out.println("always excuted");
	 }
	 
}
	public void show()
	{
		System.out.println("x: "+x);
	}
}

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cl=new calculator();
		cl.result();//caller environment 
		cl.show();

	}

}
