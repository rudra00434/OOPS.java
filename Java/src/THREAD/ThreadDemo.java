package THREAD;
class Firstthread extends Thread{
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
class Secondthread extends Thread{
	public void run()
	{
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

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firstthread fd=new Firstthread();
		Secondthread st=new Secondthread();
		fd.start();
		st.start();
		try {
			for(int i=176;i<=225;i++)
			{
				System.out.println("main: "+i);
				Thread.sleep(100);
			}
		}
		
           
	
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}

}
