package Java;
class parent6{
	public void show()
	{
	System.out.println("i am in the parent class");	
	}
}
class child6 extends parent6{ 
	public void show()
	{
		System.out.println("i am in the child class");
		super.show();
	}
}

public class methodoverriddingDEMO {
	

	public static void main(String[] args) {
		
      child6 ch=new child6();
      ch.show();
      
	}

}
//we cannnot create a object from abstract class