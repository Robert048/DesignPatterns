import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.ResolutionSyntax;

public class Klant implements Observer{

	private int klantId;
	private String naam;
	private String adres;
	private String postcode;
	private String land;
	private String stad;
	private String email;
	private String rekeningnummer;
	
	public Klant(String naam, String adres, String postcode, String land, String stad, String email, String rekeningnummer){
		this.naam = naam;
		this.adres = adres;
		this.postcode = postcode;
		this.land = land;
		this.stad = stad;
		this.email = email;
		this.rekeningnummer = rekeningnummer;
	}
	
	@Override
	public void update(boolean Online) {
		// server online status changed
		String status = "";
		if(Online == true) status = "Online";
		if(Online == false) status = "Offline";
		System.out.println("Server status changed to: " + status);
		
	}
	
	public List<String> getKlantGegevens()
	{
		List<String> gegevens = new ArrayList<String>();
		gegevens.add(naam);
		gegevens.add(adres);
		gegevens.add(postcode);
		gegevens.add(land);
		gegevens.add(stad);
		gegevens.add(email);
		gegevens.add(rekeningnummer);
		return gegevens;
	}

	@Override
	public String toString()
	{
		return naam;
	}
}
