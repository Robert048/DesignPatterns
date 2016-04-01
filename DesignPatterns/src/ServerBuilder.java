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

public abstract class ServerBuilder {
	
	public Server setupServer(String type){
		Server server;
		server = createServer(type);
		return server;
	}
	
	protected abstract Server createServer(String type);
}


