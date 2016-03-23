import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HardwareBeheer {
	private List<ServerHardware> Servers = new ArrayList<ServerHardware>();
	
	public void addServer(int ServerID, int Cores, int Ram, Locatie Locatie)
	{
		ServerHardware server = new ServerHardware(ServerID, Cores, Ram, Locatie);
		Servers.add(server);
	}
	
	public List<Boolean> getStatus()
	{
		List<Boolean> Status = new ArrayList<Boolean>();
		for (Iterator<ServerHardware> it = Servers.iterator(); it.hasNext();)
		{
			ServerHardware server = it.next();
			Status.add(server.getStatus());
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
				Status = server.getStatus();
			}
		}
		return Status;
	}
}
