import java.awt.event.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Controller {
    private Model model;
    private HardwareBeheer hModel;
    private AdministratieView  Aview;
    private VerhuurView Vview;
    private BeheerView BView;
    
    Controller(Model model, HardwareBeheer hardwareBeheer, AdministratieView view, VerhuurView view2, BeheerView view3) {
        this.model = model;
        this.hModel = hardwareBeheer;
        Aview  = view;
        Vview = view2;
        BView = view3;
        
        Aview.verhuurListener(new verhuurListener());
        Aview.klantListener(new klantListener());
        Vview.registreerListener(new registreerListener());
        Vview.nieuweVerhuurListener(new nieuweVerhuurListener());
        BView.registreerListener(new bRegistreerListener());
        BView.updateStatusListener(new updateStatusListener());
    }
    
    class verhuurListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) {
        	List<Verhuur> verhuurlijst = model.verhuurlijst;
            try 
            {
            	
            	Aview.fillList(verhuurlijst);
            } 
            catch (Exception ex) 
            {
            }
        }
    }
    
    class klantListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) {
        	List<Klant> klantenlijst = model.getKlanten();
            try 
            {
            	
            	Aview.fillListKlant(klantenlijst);
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
            	Verhuur nieuweVerhuur = Vview.GetUserInput2();
            	model.addVerhuur(nieuweVerhuur);
            	Vview.showMessage("Verhuur gedaan");
            } 
            catch (Exception ex) 
            {
            	Vview.showMessage("Verhuur gefaald");
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
    
    class bRegistreerListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
            	
            } 
            catch (Exception ex) 
            {
            	
            }
        }
    }
    
    class updateStatusListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
            	
            } 
            catch (Exception ex) 
            {
            	
            }
        }
    }
}