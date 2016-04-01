import java.awt.event.*;
import java.sql.Date;
import java.util.ArrayList;
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
        	List<Verhuur> verhuurlijst = model.verhuurlijst;
        	Server server = ServerBuilder.setupServer("web");
        	verhuurlijst.add(new Verhuur(server,1,2,3,new Date(123)));
            try 
            {
            	
            	Aview.fillList(verhuurlijst);
            } 
            catch (Exception ex) 
            {
            }
        }
    }
    
    class nieuweVerhuurListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
            	Verhuur nieuweVerhuur = Aview.GetUserInput2();
            	model.addKlant(nieuweKlant);
            	Vview.showMessage("Geregistreerd");
            } 
            catch (Exception ex) 
            {
            	Vview.showMessage("Mislukt");
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