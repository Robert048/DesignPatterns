public abstract class Server {
	
ServerKlasseKeuze klasseKeuze;
int dagen = 0;
int vastePrijs = 50;
int prijs;
int coresNeeded = 0;
int ramNeeded = 0;

abstract void addPrice();
abstract void setNeeds();
abstract ServerKeuzes getType();

	public final int calculate()
	{
		return vastePrijs + prijs;
	}
	
	@Override
	public String toString()
	{
		return getType().toString() + " " + klasseKeuze;
	}
	
	public int getCoresNeeded()
	{
		return coresNeeded;
	}
	
	public int getRamNeeded()
	{
		return ramNeeded;
	}
}
