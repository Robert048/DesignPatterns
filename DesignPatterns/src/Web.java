public class Web extends Server {
	WebruimteKeuzes Webruimte;
	WebSubdomeinenKeuzes Subdomeinen;
	
	public Web(ServerKlasseKeuze klasseKeuze){
		this.klasseKeuze = klasseKeuze;
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
			prijs = 100;
		}
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			prijs = 200;
		}
		if(klasseKeuze == ServerKlasseKeuze.BUDGET)
		{
			prijs = 350;
		}
	}
	
	@Override
	ServerKeuzes getType()
	{
		return ServerKeuzes.WEB;
	}

}