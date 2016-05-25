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
			return new Web(klasseKeuze);

		if (type.equalsIgnoreCase("voip"))
			return new VoIP(klasseKeuze);

		if (type.equalsIgnoreCase("game"))
			return new GameServer(klasseKeuze);
	
		return null;
			}
}


