
public class Administratie {
	
	public static void main(String[] args) {
	     
		Model model = new Model();
		HardwareBeheer HardwareModel = new HardwareBeheer();
        AdministratieView aView = new AdministratieView();
        VerhuurView vView = new VerhuurView();
        BeheerView bView = new BeheerView();
        Controller controller = new Controller(model, HardwareModel, aView, vView, bView);
        
        aView.setVisible(true);
	}
	
	/* in nieuwe verhuur ofiets??
	Klant klant1 = new Klant("test", "adres", "0000ab", "NL", "stad", "a@b.c", "iban");
	ServerHardware HW1 = new ServerHardware(1, 4, 8, Locatie.Amsterdam);
	public void testje()
	{
		HW1.addObserver(klant1);
		HW1.setOnline();
		HW1.removeObserver(klant1);
	}*/
	
}
