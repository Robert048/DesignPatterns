public class VoIP extends Server {

	VoIPSlotsKeuzes Slots;
	
	public VoIP(ServerKlasseKeuze klasseKeuze){
		this.klasseKeuze = klasseKeuze;
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
			prijs = 50;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			prijs = 100;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			prijs = 150;
		}
	}
	
	@Override
	ServerKeuzes getType()
	{
		return ServerKeuzes.VOIP;
	}

}