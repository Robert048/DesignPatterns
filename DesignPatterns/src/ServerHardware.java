
public class ServerHardware 
{
	private int ServerID;
	private int Cores;
	private int Ram;
	private Locatie Locatie;
	private boolean Status;
	
	public ServerHardware(int ServerID, int Cores, int Ram, Locatie Locatie)
	{
		this.ServerID = ServerID;
		this.Cores = Cores;
		this.Ram = Ram;
		this.Locatie = Locatie;
		Status = true;
	}
	
	public boolean getStatus()
	{
		return Status;
	}
	
	public int getID()
	{
		return ServerID;
	}
}
