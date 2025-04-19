package THREAD;
class Account{
	double balance=15000.00;
	public synchronized void debit(double amount)
	{   try
	  {
		for(int i=1;i<=50;i++)
		{
		 System.out.println("debit "+i);
		 Thread.sleep(100);
		}
	  }
	catch(InterruptedException ie)
	{
		ie.printStackTrace();
	}
		this.balance=this.balance-amount;
		System.out.println("after debit balance:"+this.balance);
	}
	public synchronized void credit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("after credit balance:"+this.balance);
	}
}
class customerone extends Thread{
	Account acc;
	public customerone(Account acc){
		this.acc=acc;
		
		
	}
	public void run()
	{
		acc.debit(9000.00);
	}
}
class customertwo extends Thread
{
	Account acc2;
	public customertwo(Account acc2)
	{
		this.acc2=acc2;
	}
	public void run()
	{
		acc2.debit(7000.00);
	}
}
class customerthree extends Thread
{
	Account acc3;
	public customerthree(Account acc3)
	{
		this.acc3=acc3;
	}
	public void run()
	{
		acc3.credit(5000.00);
	}
}


public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Account acc=new Account();
      customerone c1=new customerone(acc);
      customertwo c2=new customertwo(acc);
      customerthree c3=new customerthree(acc);
      c1.start();
      c2.start();
      c3.start();
	}

}
