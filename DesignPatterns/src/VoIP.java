public class VoIP implements Server {

	VoIPClients Client;
	int Slots;
	String Locatie;
	
	public VoIP(VoIPClients Client, int Slots, String Locatie){
		this.Client = Client;
		this.Slots = Slots;
		this.Locatie = Locatie;
	}

}
