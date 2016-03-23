public class WebServerFactory implements IServerCreator {

	public Server createServer(String type, ServerKlasseKeuze klasseKeuze)
	{
		Server server = null;
		if(klasseKeuze == ServerKlasseKeuze.BASIC)
		{
		server = new Web(WebruimteKeuzes.BASIC.getValue(), WebSubdomeinenKeuzes.BASIC.getValue());
		}
		return server;
	}
}
