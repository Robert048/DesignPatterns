
public class Administratie {
	Klant klant1 = new Klant();
	ServerHardware HW1 = new ServerHardware(1, 4, 8, Locatie.Amsterdam);
	public void testje()
	{
		HW1.addObserver(klant1);
		HW1.setOnline();
		HW1.removeObserver(klant1);
	}
}
