package Exception;
class TestException{
	public int x=25;
	public int y=5;
	public void test()
	{
		try {
			System.out.println("x:"+x);
			int z=x/y;
			System.out.println("z:"+z);
			System.out.println("inside try");
		}
		catch(ArithmeticException ae ){
			ae.printStackTrace();
			
		}
		System.out.println("outside try");
	}
}

public class FlowofException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestException ts=new TestException();
		ts.test();

	}

}
