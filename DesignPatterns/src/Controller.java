import java.awt.event.*;
import java.util.HashMap;
import java.util.List;

public class Controller {
    private Model model;
    private AdministratieView  Aview;
    private VerhuurView Vview;
    
    Controller(Model model, AdministratieView view, VerhuurView view2) {
        this.model = model;
        Aview  = view;
        Vview = view2;
        
        Aview.verhuurListener(new verhuurListener());
        Vview.registreerListener(new registreerListener());
    }
    
    class verhuurListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) {
        	HashMap<Verhuur, Klant> verhuurlijst = new HashMap<Verhuur, Klant>();
        	verhuurlijst.put(new Verhuur(), new Klant("naam", "adres", "postcode", "land", "stad", "email", "rekeningnummer"));
            try 
            {
            	
            	Aview.fillList(verhuurlijst);
            } 
            catch (Exception ex) 
            {
            }
        }
    }
    
    class registreerListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
            	Klant nieuweKlant = Vview.GetUserInput();
            	model.addKlant(nieuweKlant);
            	Vview.showMessage("Geregistreerd");
            } 
            catch (Exception ex) 
            {
            	Vview.showMessage("Mislukt");
            }
        }
    }
}