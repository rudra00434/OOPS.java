package Exception;
class Calculators{
	int x=25;
	int y=5;
	public void result() throws ArithmeticException,Exception
	{
	 
		int z;
		z=x/y;
		System.out.println("result: " +z);


}
}

public class ThrowsDemo {

	public static void main(String[] args) throws ArithmeticException,Exception{
		// TODO Auto-generated method stub
		Calculators cl = new Calculators();
		cl.result();

	}
}


