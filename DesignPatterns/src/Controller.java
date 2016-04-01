import java.awt.event.*;
import java.util.HashMap;
import java.util.List;

public class Controller {
    private Model model;
    private AdministratieView  Aview;
    
    Controller(Model model, AdministratieView view) {
        this.model = model;
        Aview  = view;
        Aview.verhuurListener(new verhuurListener());
    }
    
    class verhuurListener implements ActionListener {
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
}