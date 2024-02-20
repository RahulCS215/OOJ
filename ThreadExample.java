class BMSthreads extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("BMS college of Engineering");
			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
				}
		}
	}
}

class CSEThread extends Thread{
	@Override
	public void run(){
		while(true){
			System.out.println("CSE");
			try{
				Thread.sleep(2000);}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample{
	public static void main(String args[]){
		BMSthreads bmsThread = new BMSthreads();
		bmsThread.start();

		CSEThread cseThread = new CSEThread();
		cseThread.start();
	}
}