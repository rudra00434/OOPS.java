package Java;
class calculator {
	public int add(int a,int b)
	{
		return (a+b);
	}
	public float add(int a,float b)
	{
		return (a+b);
	}
	public double add(double a,double b)
	{
		return (a+b);
	}
	
}

public class methodoverloading {

	public static void main(String[] args) {
		
    calculator cl= new calculator();
    System.out.println(cl.add(5, 6));
    System.out.println(cl.add(5, 6.5));
    System.out.println(cl.add(6.5, 7.8));
	}

}
