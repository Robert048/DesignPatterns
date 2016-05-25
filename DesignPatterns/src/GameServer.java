public class GameServer extends Server {

	HardwareKeuzes hardwareKeuze;
	GameSlotsKeuzes slots;
	
	public GameServer(ServerKlasseKeuze klasseKeuze){
		this.klasseKeuze = klasseKeuze;
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			this.hardwareKeuze = HardwareKeuzes.BUDGET;
			this.slots = GameSlotsKeuzes.BUDGET;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			this.hardwareKeuze = HardwareKeuzes.BASIC;
			this.slots = GameSlotsKeuzes.BASIC;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			this.hardwareKeuze = HardwareKeuzes.PREMIUM;
			this.slots = GameSlotsKeuzes.PREMIUM;
		}
	}
	
	@Override
	void addPrice(){
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			prijs = 125;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			prijs = 175;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			prijs = 225;
		}
	}
	
	@Override
	ServerKeuzes getType()
	{
		return ServerKeuzes.GAME;
	}
	
}
