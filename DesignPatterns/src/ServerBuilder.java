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
	
	public static Server setupServer(String type){
		if (type.equalsIgnoreCase("web"))
			return new Web(6, 1);
		if (type.equalsIgnoreCase("voip"))
			return new VoIP(VoIPClients.MUMBLE, 3, "test");
		if (type.equalsIgnoreCase("game"))
			return new GameServer("gsg", HardwareKeuzes.SETUP1, "ag", 1);
		
		return null;
			}
}


