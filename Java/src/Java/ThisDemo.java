package Java;
class product{
	public String id;
	public String name;
	public int pqyt;
	public double price;
	public String sdt;
	public product(String id,String name,String sdt,int pqyt,double price){
		this.id=id;
		this.name=name;
		this.pqyt = pqyt;
		this.price=price;
		this.sdt=sdt;
	}
	public void view()
	{
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.sdt);
		System.out.println(this.pqyt);
		System.out.println(this.price);
	}
	public void salesorder()
	{
		double total = 0.0;
		total= (this.pqyt)*(this.price);
		this.sdt="17/04/2025";
		System.out.println("total: "+total);
		System.out.println("sdt: "+sdt);
		this.view();
	}
			
	
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     product pd= new product("10rt","rudra","4th",30,3000);
     pd.salesorder();
     
     
	}

}
