package Java;
class student {
	int rollno=1;
	String name = "SUMAN";
	public void show()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
}
class exam extends student 
{
	String sub1="PHYS";
	String sub2 = "CHEM";
	String sub3 = "MATH";
	public void display()
	{
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
	public int score(int p,int c,int m)
	{
		 int result = p+c+m;
		 return result;
	}
	
}
class sem extends exam {
	String sem = "2nd";
	String yr="4th" ;
	public void detail()
	{
		System.out.println(sem);
		System.out.println(yr);
	}
	
}

public class multilevelinheritenceDemo {

	public static void main(String[] args) {
	  sem s1=new sem();
	  s1.show();
	  s1.display();
	  int result=s1.score(30,40,50);
	  System.out.println("result "+result);
	  s1.detail();
	  

	}

}
