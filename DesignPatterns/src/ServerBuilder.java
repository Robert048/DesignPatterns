public class ServerBuilder {
	
	public static Server setupServer(ServerKeuzes type, ServerKlasseKeuze klasseKeuze, int dagen){
		if (type == ServerKeuzes.WEB)
			return new Web(klasseKeuze, dagen);

		if (type == ServerKeuzes.VOIP)
			return new VoIP(klasseKeuze, dagen);

		if (type == ServerKeuzes.GAME)
			return new GameServer(klasseKeuze, dagen);
	
		return null;
			}
}


