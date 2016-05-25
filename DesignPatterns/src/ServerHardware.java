import java.util.ArrayList;

public class ServerHardware implements Observable
{
	private int ServerID;
	private int Cores;
	private int Ram;
	private int usedCores;
	private int usedRam;
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
		usedCores = 0;
		usedRam = 0;
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
	
	public int getCores() {
		return Cores;
	}
	
	public int getRam() {
		return Ram;
	}
	
	public int getUsedCores() {
		return usedCores;
	}
	
	public int getusedRam() {
		return usedRam;
	}
	
	public void setUsedCores(int cores) {
		usedCores = usedCores + cores;
	}
	
	public void setUsedRam(int ram) {
		usedRam = usedRam + ram;
	}
	
	@Override
	public String toString()
	{
		return "serverID: " + ServerID + " cores: " + usedCores + "/" + Cores + " ram: " + usedRam + "/" + Ram + " locatie: " + Locatie;
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
