
public class DefecationStation {
	
	public static void main(String[] args)	throws InterruptedException {
		
		boolean start = true;
		
		while (!start == false)	{
			System.out.println("Eric isn't taking a dump");
			Thread.sleep(1000);
			System.out.print("D-");
			Thread.sleep(200);
			System.out.print("O-");
			Thread.sleep(200);
			System.out.print("N-");
			Thread.sleep(200);
			System.out.print("E\n");
			Thread.sleep(200);
			System.out.println("DONE!");
			Thread.sleep(3000);
			for (int i = 0; i<5; i++){
				System.out.println();
			}
		}
		
	}

}
