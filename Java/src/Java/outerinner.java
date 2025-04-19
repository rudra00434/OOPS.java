package Java;
class parcel{
	class destination{
		public void desti(String loc)
		{
			System.out.println(loc);
		}
	}
	class contents{
		public void weight(double w)
		{
			System.out.println(w);
		}
		
	}
}

public class outerinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         parcel p=new parcel();
         parcel.destination d=p.new destination();
         parcel.contents c=p.new contents();
         d.desti("rudra");
         c.weight(75);
	}

}
