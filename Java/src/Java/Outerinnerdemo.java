package Java;
class outer
{
	int x=25;
	class inner{
		int y=60;
		public void add()
		{
			System.out.println(x+y);
		}
	}
}

public class Outerinnerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out=new outer();
		outer.inner inn=out.new inner();
		inn.add();

	}

}
