package Exception;
class outofstock{
	int qoh=50;
	public void issue(int req)
	{
		try {
			
		if(req>qoh)
		{
			OutOfStockException oe=new OutOfStockException();
			throw oe;//explicitly throw the object
		}
		System.out.println("current stock: "+(this.qoh-req));
		}
		catch(OutOfStockException oe)
		{
			oe.printStackTrace();
		}
	}
}

public class UserdefinedExceptionDemo {
	public static void main(String arg[])
	{
		outofstock st=new outofstock();
		st.issue(46);
	}

}
