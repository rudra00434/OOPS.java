package Java;
abstract class shape1{
	public abstract void area(double r);
	
}
class square1 extends shape1
{
	public void area (double r)
	{
		System.out.println("area square: "+(r*r));
	}
}
class circle1 extends shape1{
	public void area(double r)
	{
		System.out.println("area of circle: "+Math.PI*r*r);
	}
}


public class dynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       shape1 sp1;
       shape1 sp2;
       square1 sq = new square1();
       sp1=sq;
       circle1 cl=new circle1();
       sp2=cl;
       sp1=sp2;
       sp1.area(5.6);
	}

}
