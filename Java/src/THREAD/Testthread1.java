package THREAD;
class Test extends Thread{
	public void run()
	{
		try {
			for(int i=600;i<=700;i++)
			{
				System.out.println("test therad: "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}
class Test2 extends Thread{
	public void run()
	{
		try {
			for(int i=600;i<=800;i++)
			{
				System.out.println("test therad: "+i);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			ie.printStackTrace();
		}
	}
}

public class Testthread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test2 t1=new Test2();
		t.setDaemon(true);
		t.start();
		t1.start();
		try {
	    	  for(int i=1;i<100;i++)
	    	  {
	    		  System.out.println("Main: "+i);
	    		  Thread.sleep(100);
	    	  }
	      }
	      catch(InterruptedException ie)
	      {
	    	  ie.printStackTrace();
	      }
		}


	}


