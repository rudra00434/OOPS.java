package Java;
class Furniture{
	private double length=100.00;
	private double wedth= 200.00;
	private double height=300.00;
	public void volume()
	{
		double vol;
		vol=length*wedth*height;
		System.out.println("volume :"+vol);
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		Furniture chair = new Furniture();
		chair.volume();
		

	}

}
