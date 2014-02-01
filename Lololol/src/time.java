
public class time {

	public static void main(String []args) {
		
		int inhours , inminutes , inseconds;
		int outhours , outminutes , outseconds;
		int smallhours , smallminutes , smallseconds;
		int hourscon , minutescon , secondscon;
		int realseconds;
		
		inhours = 1;
		inminutes = 2;
		inseconds = 3;
		hourscon = 3600;
		minutescon = 60;
		secondscon = 1;
		
		
		smallhours = inhours * hourscon;
		smallminutes = inminutes * minutescon;
		smallseconds = inseconds * secondscon;
		
		realseconds = smallhours + smallminutes + smallseconds;
		System.out.println("The total number of real seconds is: " +realseconds);
		System.out.println("\n");		
		
		outhours = realseconds / hourscon;
		System.out.println("The total number of whole hours is: " +outhours);
		outminutes = realseconds / minutescon;
		System.out.println("The total number of whole minutes is: " +outminutes);
		outseconds = realseconds / secondscon;
		System.out.println("The total number of whole seconds is: " +outseconds);
		System.out.println("\n");
		
		outhours = 0;
		outminutes = 0;
		outseconds = 0;
		
		while(realseconds - hourscon >= 0) {
			outhours++;
			realseconds = realseconds - hourscon;
		}
		while(realseconds - minutescon >=0) {
			outminutes++;
			realseconds = realseconds - minutescon;
		}
		while(realseconds - secondscon >=0) {
			outseconds++;
			realseconds = realseconds - secondscon;
		}
		System.out.println("The standard form of time is: " +outhours +"h:" +outminutes +"m:" +outseconds +"s");
	
	}
}