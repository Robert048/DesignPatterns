
public class Klant implements Observer{

	@Override
	public void update(boolean Online) {
		// server online status changed
		String status = "";
		if(Online == true) status = "Online";
		if(Online == false) status = "Offline";
		System.out.println("Server status changed to: " + status);
		
	}

}
