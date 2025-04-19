package THREAD;
class Thread1 extends Thread{
public void run()
{
	try {
		for(int i=1;i<=100;i++)
		{
			System.out.println("THREAD1:"+i);
			Thread.sleep(100);
		}
	}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	 
	}
}
class Thread2 extends Thread{
public void run(){
	try {
		for(int i=101;i<=175;i++)
		{
			System.out.println("THEREAD2 "+i);
			Thread.sleep(100);
			
		}
	}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
}
}


public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Thread1 ft=new Thread1();
	 Thread2 fd=new Thread2();
	 ft.run();
	 fd.run();
	 

	}

}
