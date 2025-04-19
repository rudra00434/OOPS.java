package Java;
class parent{
	public int x = 25;
}
class child extends parent{
	public int y=60;
	public void add()
	{
	   int z;
	   z=x+y;
	   System.out.println("RESULT: "+z);
	}
public class SingleInherritenceDemo {
	public static void main(String args[])
	{
		child ch =new child();
		ch.add();
	}
	
}

}
