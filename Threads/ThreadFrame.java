package DemoThreads.VisualVM;

/**
 * Thread that will count up and print the numbers it has counted
 *
 * @author allennp.
 *         Created Oct 7, 2013.
 */
public class LivingThread extends Thread {
	/**
	 * Currently counted number
	 */
	public int n;
	private String name;
	private boolean suspended;
	
	/**
	 * creates a thread with a name
	 *
	 * @param nm name to be assigned to thread
	 */
	public LivingThread(String nm)
	{
		super();
		this.name = nm;
	}
	
	@Override
	public synchronized void run()
	{
		while(true)
		{
			try
			{
				if(isSuspended()){
					wait();
				}
				this.n++;
				System.out.println(this.name + ": "+this.n);
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{
				System.out.println("hokay");
				return;
			}
		}
	}

	/**
	 * Returns the value of the field called 'suspended'.
	 * @return Returns the suspended.
	 */
	public boolean isSuspended() {
		return suspended;  //will cause program to freeze if checking suspended while attempt to change
	}

	/**
	 * Sets the field called 'suspended' to the given value.
	 * @param suspended The suspended to set.
	 */
	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}
}
