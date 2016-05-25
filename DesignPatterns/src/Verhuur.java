public class Verhuur {
	
private Server server;
private int verhuurdId;
private int Verhuurtijd;
private int klantId;


public Verhuur(Server server, int verhuurId, int verhuurTijd, int klantId)
{
	this.server = server;
	this.verhuurdId = verhuurId;
	this.Verhuurtijd = verhuurTijd;
	this.klantId = klantId;

}

private Server getServer() {
	return server;
}

private int getKosten(){
	return 0;
}

public String toString()
{
	return "server: " + server.toString() + "Verhuurd id: " + verhuurdId + " verhuurtijd: " + Verhuurtijd + "Klant nr: " + klantId;
}

}



