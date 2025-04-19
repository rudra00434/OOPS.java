package Exception;
class AccountNotfound{
	String accno="100";
	public void issue(String accno)
	{
		try {
			if(this.accno==(accno))
			{
				System.out.println("account exits");

			}
			else
			{
				AccountNo ac= new AccountNo();
				throw ac;
			}
		}
			catch(AccountNo ac)
			{
				ac.printStackTrace();
			}
		
				
		}
	}

public class CustomException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountNotfound at = new AccountNotfound();
		at.issue("200");

	}

}
