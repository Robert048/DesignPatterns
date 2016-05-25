/*
public abstract class ServerBuilder {
	ServerFactory factory;

	public ServerBuilder(ServerFactory factory){
		this.factory = factory;
	}

	public ServerBuilder setupServer(String type) {
		ServerBuilder server;
		server = factory.createServer(type);
		return server;
	}
}
*/

//NIET GEBRUIKT

public class ServerBuilder {
	
	public static Server setupServer(String type, ServerKlasseKeuze klasseKeuze){
		if (type.equalsIgnoreCase("web"))
			if (klasseKeuze.equals(ServerKlasseKeuze.BUDGET))
			return new Web(WebruimteKeuzes.BUDGET, WebSubdomeinenKeuzes.BUDGET);
		
			if (klasseKeuze.equals(ServerKlasseKeuze.BASIC))
			return new Web(WebruimteKeuzes.BASIC, WebSubdomeinenKeuzes.BASIC);
			
			if (klasseKeuze.equals(ServerKlasseKeuze.PREMIUM))
			return new Web(WebruimteKeuzes.PREMIUM, WebSubdomeinenKeuzes.PREMIUM);
			
		if (type.equalsIgnoreCase("voip"))
			if (klasseKeuze.equals(ServerKlasseKeuze.BUDGET))
			return new VoIP(VoIPSlotsKeuzes.BUDGET);
		
			if (klasseKeuze.equals(ServerKlasseKeuze.BASIC))
			return new VoIP(VoIPSlotsKeuzes.BASIC);
				
			if (klasseKeuze.equals(ServerKlasseKeuze.PREMIUM))
			return new VoIP(VoIPSlotsKeuzes.PREMIUM);

		if (type.equalsIgnoreCase("game"))
			if (klasseKeuze.equals(ServerKlasseKeuze.BUDGET))
			return new GameServer(HardwareKeuzes.BUDGET, GameSlotsKeuzes.BASIC);
		
			if (klasseKeuze.equals(ServerKlasseKeuze.BASIC))
			return new GameServer(HardwareKeuzes.BASIC, GameSlotsKeuzes.BASIC);
	
			if (klasseKeuze.equals(ServerKlasseKeuze.PREMIUM))
			return new GameServer(HardwareKeuzes.PREMIUM, GameSlotsKeuzes.PREMIUM);
		
		return null;
			}
}


