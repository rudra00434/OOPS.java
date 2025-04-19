package THREAD;
class Testthread extends Thread
{
	public void run()
	{
		try {
			for(int i=400;i<=550;i++)
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

public class DemonThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Testthread tt=new Testthread();
      tt.setDaemon(true); //Demon threads are the low priority threads;
      //main thread does not wait for demon thread for running
      tt.start();
      try {
    	  for(int i=1;i<50;i++)
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
