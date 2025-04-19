package Java;
class customer
{
	private String id  = "C1";
	 private String name ="ARUP";
	 private String ph  = "46464664";
	 public void display(){
			System.out.println("id:"+id);
			System.out.println("name"+name);
			System.out.println("ph"+ph);
		}
	 
}

public class encapsulationdemo1 {

	public static void main(String[] args) {
		customer person = new customer();
		person.display();
		

	}

}
