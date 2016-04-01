import java.sql.Date;

public class Verhuur {
	
private Server server;
private int verhuurdId;
private int Verhuurtijd;
private int klantId;
private Date StartDatum;

public Verhuur(Server server, int verhuurId, int verhuurTijd, int klantId, Date startDatum)
{
	this.server = server;
	this.verhuurdId = verhuurId;
	this.Verhuurtijd = verhuurTijd;
	this.klantId = klantId;
	this.StartDatum = startDatum;
}

private Server getServer() {
	return server;
}

private int getKosten(){
	return 0;
}

public String toString()
{
	return "" + verhuurdId;
}

}



