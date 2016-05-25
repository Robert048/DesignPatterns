public abstract class Server {
	
ServerKlasseKeuze klasseKeuze;
int vastePrijs = 50;
int prijs;

abstract void addPrice();
abstract ServerKeuzes getType();

	public final int calculate()
	{
		return vastePrijs + prijs;
	}

}
