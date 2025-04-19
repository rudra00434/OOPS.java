package Java;
class company{
	public String company="CTS";
	public String loc="kolkata" ;
	public void display()
	{
		System.out.println(company);
		System.out.println(loc);
	}
}
class job extends company{
	public String tech;
	public double exp;
	public String enddt;
	public String city;
	public void offer(String tech,double exp)
	{
		System.out.println(tech);
		System.out.println(exp);
	}
	public void offer(String tech,double exp,String city)
	{
		System.out.println(tech);
		System.out.println(exp);
		System.out.println(city);
	}
	public void offer(String tech,double exp,String city,String enddt )
	{
		System.out.println(tech);
		System.out.println(exp);
		System.out.println(city);
		System.out.println(enddt);
	}
	
}
class candidate extends job implements interview{ 
	public String candnm;
	public String email;
	public String tech;
	public String phno;
	public candidate(String candnm,String phno,String email,String tech){
		this.candnm=candnm;
		this.email=email;
		this.tech=tech;
		this.phno=phno;
	}
		public void shedule()
		{
			System.out.println(candnm);
			System.out.println(email);
			System.out.println(tech);
			System.out.println(phno);
			
		}
	}
}

public class oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    candidate c = new candidate("rudra","8670442340","tatairudra@gmail.com","cts");
    c.display();
    c.offer("cts", 5.5);
    c.offer("cts", 5.6,"kolkata");
    c.offer("cts",5.6,"kolkata","17/04/2025");
	}

}
