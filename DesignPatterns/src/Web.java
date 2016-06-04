public class Web extends Server {
	WebruimteKeuzes Webruimte;
	WebSubdomeinenKeuzes Subdomeinen;
	
	public Web(ServerKlasseKeuze klasseKeuze, int dagen){
		this.klasseKeuze = klasseKeuze;
		this.dagen = dagen;
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			this.Webruimte = WebruimteKeuzes.BUDGET;
			this.Subdomeinen = WebSubdomeinenKeuzes.BUDGET;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			this.Webruimte = WebruimteKeuzes.BASIC;
			this.Subdomeinen = WebSubdomeinenKeuzes.BASIC;
		}
		
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			this.Webruimte = WebruimteKeuzes.PREMIUM;
			this.Subdomeinen = WebSubdomeinenKeuzes.PREMIUM;
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
	ServerKeuzes getType()
	{
		return ServerKeuzes.WEB;
	}

	@Override
	void setNeeds() {
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			coresNeeded = 1;
			ramNeeded = 2;
		}
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
			coresNeeded = 1;
			ramNeeded = 4;
		}
		if(klasseKeuze == ServerKlasseKeuze.PREMIUM)
		{
			coresNeeded = 2;
			ramNeeded = 6;
		}
	}
}