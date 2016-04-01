
public class Administratie {
	
	public static void main(String[] args) {
	     
		Model model = new Model();
        AdministratieView view = new AdministratieView();
        Controller controller = new Controller(model, view);
        
        view.setVisible(true);
	}
	
	/*
	Klant klant1 = new Klant("test", "adres", "0000ab", "NL", "stad", "a@b.c", "iban");
	ServerHardware HW1 = new ServerHardware(1, 4, 8, Locatie.Amsterdam);
	public void testje()
	{
		HW1.addObserver(klant1);
		HW1.setOnline();
		HW1.removeObserver(klant1);
	}*/
	
}
