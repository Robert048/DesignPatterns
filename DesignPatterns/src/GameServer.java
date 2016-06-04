public class GameServer extends Server {

	HardwareKeuzes hardwareKeuze;
	GameSlotsKeuzes slots;
	
	public GameServer(ServerKlasseKeuze klasseKeuze, int dagen){
		this.klasseKeuze = klasseKeuze;
		this.dagen = dagen;
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
			prijs = 6 * dagen;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			prijs = 8 * dagen;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			prijs = 10 * dagen;
		}
	}
	
	@Override
	void setNeeds() {
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			coresNeeded = 4;
			ramNeeded = 8;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			coresNeeded = 8;
			ramNeeded = 24;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			coresNeeded = 16;
			ramNeeded = 64;
		}
	}
	
	@Override
	ServerKeuzes getType()
	{
		return ServerKeuzes.GAME;
	}
}
