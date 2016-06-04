public class Verhuur {
	
	private Server server;
	private int verhuurId;
	private int Verhuurtijd;
	private int klantId;
	
	
	public Verhuur(Server server, int verhuurId, int verhuurTijd, int klantId)
	{
		this.server = server;
		this.verhuurId = verhuurId;
		this.Verhuurtijd = verhuurTijd;
		this.klantId = klantId;
	
	}
	
	public Server getServer() {
		return server;
	}
	
	public int getKosten(){
		server.addPrice();
		return server.calculate();
	}
	
	public String toString()
	{
		return "server: " + server.toString() + " Verhuur id: " + verhuurId + " verhuurtijd: " + Verhuurtijd + " Klant nr: " + klantId;
	}
	
	public int getKlantID()
	{
		return klantId;
	}
}



