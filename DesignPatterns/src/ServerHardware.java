import java.util.ArrayList;

public class ServerHardware implements Observable
{
	private int ServerID;
	private int Cores;
	private int Ram;
	private Locatie Locatie;
	private boolean Online;
	private ArrayList<Observer> klanten = new ArrayList<Observer>();
	
	public ServerHardware(int ServerID, int Cores, int Ram, Locatie Locatie)
	{
		this.ServerID = ServerID;
		this.Cores = Cores;
		this.Ram = Ram;
		this.Locatie = Locatie;
		Online = true;
	}
	
	public boolean isOnline()
	{
		return Online;
	}
	
	public void setStatus(boolean status) 
	{
		Online = status;
		notifyObserver();
	}
	
	public int getID()
	{
		return ServerID;
	}
	
	@Override
	public String toString()
	{
		return "serverID: " + ServerID + " cores: " + Cores + " ram: " + Ram + " locatie: " + Locatie;
	}
	
	@Override
	public void addObserver(Observer o){
		klanten.add(o);
	}
	@Override
	public void removeObserver(Observer o){
		klanten.remove(o);
	}
	@Override
	public void notifyObserver(){
		for(Observer klant :klanten){
			klant.update(Online);
		}
	}
}
