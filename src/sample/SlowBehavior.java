package sample;

public class SlowBehavior {

	  public void doSomethingSlow()
	   {
	       try
	       {
	           Thread.sleep(1000);
	       } catch (InterruptedException e)
	       {
	           e.printStackTrace();
	       }
	   }

	   public void doSomethingVerySlow()
	   {
	       try
	       {
	           Thread.sleep(10000);
	       } catch (InterruptedException e)
	       {
	           e.printStackTrace();
	       }
	   }
	
}
