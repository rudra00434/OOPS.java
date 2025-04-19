package THREAD;
class FThread extends Thread{
	public void run()
	{

		for(int i=1;i<=100;i++)
		{
			System.out.println("Thread1: "+i);
		
		}
}
}
	class Sthread extends Thread{
		public void run()
		{
			for(int i=101;i<=200;i++)
			System.out.println("thread2 "+i);
	
	}
}

public class THreadShedulingDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
         FThread f=new FThread();
         Sthread s=new Sthread();
         f.setPriority(10);  //priority sheduling max
         s.setPriority(1);    //priority sheduling min
         f.start();
         s.start();
	}

}
