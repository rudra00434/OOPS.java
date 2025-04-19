package Java;
abstract class shape{
	public abstract void area(double r);
	
}
class square extends shape
{
	public void area (double r)
	{
		System.out.println("area square: "+(r*r));
	}
}
class circle extends shape{
	public void area(double r)
	{
		System.out.println("area of circle: "+Math.PI*r*r);
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		square sq=new square();
		circle cl=new circle();
		sq.area(5.6);
		cl.area(8.9);

	}

}
