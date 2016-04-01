public class GameServer implements Server {

	String gameNaam;
	HardwareKeuzes hardwareKeuze;
	String locatie;
	int slots;
	
	public GameServer(String GameNaam, HardwareKeuzes HardwareKeuze, String Locatie, int Slots){
		this.gameNaam = GameNaam;
		this.hardwareKeuze = HardwareKeuze;
		this.locatie = Locatie;
		this.slots = Slots;
	}
	
}
