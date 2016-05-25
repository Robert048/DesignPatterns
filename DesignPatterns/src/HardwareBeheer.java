import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HardwareBeheer {
	private List<ServerHardware> Servers = new ArrayList<ServerHardware>();
	
	public void addServer(ServerHardware server)
	{
		Servers.add(server);
	}
	
	/*
	public List<Boolean> getStatus()
	{
		List<Boolean> Status = new ArrayList<Boolean>();
		for (Iterator<ServerHardware> it = Servers.iterator(); it.hasNext();)
		{
			ServerHardware server = it.next();
			Status.add(server.isOnline());
		}
		return Status;
	}
	
	public Boolean getStatus(int serverID)
	{
		boolean Status = false;
		for (Iterator<ServerHardware> it = Servers.iterator(); it.hasNext();)
		{
			ServerHardware server = it.next();
			if(server.getID() == serverID)
			{
				Status = server.isOnline();
			}
		}
		return Status;
	}*/
	
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
}
