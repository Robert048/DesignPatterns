import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HardwareBeheer {
	private List<ServerHardware> Servers = new ArrayList<ServerHardware>();
	
	public void addServer(ServerHardware server)
	{
		Servers.add(server);
	}
	
	protected List<ServerHardware> getHardware()
    {
    	return Servers;
    }
	
	public ServerHardware getServer(int serverID)
	{
		ServerHardware returnServer = null;
		for (Iterator<ServerHardware> it = Servers.iterator(); it.hasNext();)
		{
			ServerHardware server = it.next();
			if(server.getID() == serverID)
			{
				returnServer = server;
			}
		}
		return returnServer;
	}
	
	public ServerHardware findServer(Verhuur verhuur)
	{
		Server server = verhuur.getServer();
		int coresNeeded = 4;
		int ramNeeded = 2;
		ServerHardware foundServer = null;
		boolean found = false;
		for (ServerHardware serverHardware : Servers) {
			if(!found && serverHardware.getUsedCores() + coresNeeded <= serverHardware.getCores() && serverHardware.getusedRam() + ramNeeded <= serverHardware.getRam())
			{
				found = true;
				foundServer = serverHardware;
				serverHardware.setUsedCores(coresNeeded);
				serverHardware.setUsedRam(ramNeeded);
			}
		}
		return foundServer;
	}
}
