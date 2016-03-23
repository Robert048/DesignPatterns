public class VoIPServerFactory implements IServerCreator {
	
	public Server createServer(String type, ServerKlasseKeuze klasseKeuze)
	{
		Server server = null;
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
		server = new VoIP(VoIPClients.TEAMSPEAK2, VoIPSlotsKeuzes.BASIC.getValue(), "DankCity");
		}
		return server;
	}
}
