package Java;
class cake{
	public cake()
	{
		System.out.println("hello world");	
	}
	public cake(String msg,String shape)
	{
		System.out.println(msg);
		System.out.println(shape);
	}
	public cake(String msg,String shape,float price)
	{
		System.out.println(msg);
		System.out.println(shape);
		System.out.println(price);
		
	}
}

public class constructorovereloadingdemo {

	public static void main(String[] args) {
		
	cake c1 = new cake();
	cake c2 = new cake("happy","rectangle");
	cake c3 = new cake("happy birthday","square",250.6f);
	

	}

}
