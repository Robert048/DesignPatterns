public class GameServerFactory implements IServerCreator {
	public Server createServer(String type, ServerKlasseKeuze klasseKeuze)
	{
		Server server = null;
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
		server = new GameServer("Stenden Online", HardwareKeuzes.SETUP1, "Lichtenstein", GameSlotsKeuzes.BASIC.getValue());
		}
		return server;
	}

}
