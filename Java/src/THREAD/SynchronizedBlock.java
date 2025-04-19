package THREAD;
class Accounts {
	double balance=15000.00;
	public void debit(double amount)
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
	synchronized (this)
	{
		this.balance=this.balance-amount;
		System.out.println("after debit balance:"+this.balance);
	}
	}
	public void credit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("after credit balance:"+this.balance);
	}
}
class customerones extends Thread{
	Accounts acc;
	public customerones(Accounts acc){
		this.acc=acc;
		
		
	}
	public void run()
	{
		acc.debit(9000.00);
	}
}
class customertwos extends Thread
{
	Accounts acc2;
	public customertwos(Accounts acc2)
	{
		this.acc2=acc2;
	}
	public void run()
	{
		acc2.debit(7000.00);
	}
}
class customerthrees extends Thread
{
	Accounts acc3;
	public customerthrees(Accounts acc3)
	{
		this.acc3=acc3;
	}
	public void run()
	{
		acc3.credit(5000.00);
	}
}


public class SynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts acc1=new Accounts();
	      customerones c1s=new customerones(acc1);
	      customertwos c2s=new customertwos(acc1);
	      customerthrees c3s=new customerthrees(acc1);
	      c1s.start();
	      c2s.start();
	      c3s.start();
	}

}
