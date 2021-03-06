public class VoIP extends Server {

	VoIPSlotsKeuzes Slots;
	
	public VoIP(ServerKlasseKeuze klasseKeuze, int dagen){
		this.klasseKeuze = klasseKeuze;
		this.dagen = dagen;
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			this.Slots = VoIPSlotsKeuzes.BUDGET;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			this.Slots = VoIPSlotsKeuzes.BASIC;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			this.Slots = VoIPSlotsKeuzes.PREMIUM;
		}
	}
	
	@Override
	void addPrice(){
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			prijs = 2 * dagen;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			prijs = 4 * dagen;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			prijs = 6 * dagen;
		}
	}
	
	@Override
	void setNeeds() {
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			coresNeeded = 2;
			ramNeeded = 4;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			coresNeeded = 2;
			ramNeeded = 8;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			coresNeeded = 4;
			ramNeeded = 16;
		}
	}
	
	@Override
	ServerKeuzes getType()
	{
		return ServerKeuzes.VOIP;
	}
}