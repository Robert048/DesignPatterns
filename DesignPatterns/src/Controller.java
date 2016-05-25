import java.awt.event.*;
import java.util.Iterator;
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
        Aview.hardwareListener(new hardwareListener());
        Vview.registreerListener(new registreerListener());
        Vview.nieuweVerhuurListener(new nieuweVerhuurListener());
        BView.registreerListener(new bRegistreerListener());
        BView.updateStatusListener(new updateStatusListener());
    }
    
    class verhuurListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
    		Vview.setVisible(true);
    	}
    }
    
    class hardwareListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
    		BView.setVisible(true);
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
            	List<Klant> klantenlijst = model.getKlanten();
               	Aview.fillKlantenList(klantenlijst);
            } 
            catch (Exception ex) 
            {
            	Vview.showMessage("Mislukt");
            }
        }
    }
    
    class nieuweVerhuurListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
            	Verhuur nieuweVerhuur = Vview.GetUserInputVerhuur();
              	Klant huurder = null;
        		for (Iterator<Klant> it = model.getKlanten().iterator(); it.hasNext();)
        		{
        			Klant klant = it.next();
        			if(klant.getID() == nieuweVerhuur.getKlantID())
        			{
        				huurder = klant;
        			}
        		}
        		ServerHardware serverHardware = hModel.findServer(nieuweVerhuur);
        		if (serverHardware != null)
        		{
	        		serverHardware.addObserver(huurder);
	        		model.addVerhuur(nieuweVerhuur);
	            	Vview.showMessage("Verhuur gedaan");
	            	List<Verhuur> verhuurlijst = model.getVerhuur();
	              	Aview.fillVerhuurList(verhuurlijst);
	              	List<ServerHardware> hardwareLijst = hModel.getHardware();
	            	Aview.fillHardwareList(hardwareLijst);
        		}
        		else
        		{
        			Vview.showMessage("Er zijn helaas geen servers beschikbaar");
        		}
            } 
            catch (Exception ex) 
            {
            	Vview.showMessage("Verhuur gefaald");
            }
        }
    }
    
    
    
    class bRegistreerListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
        		ServerHardware nieuweServer = BView.GetUserInput();
            	hModel.addServer(nieuweServer);
            	BView.showMessage("Geregistreerd");
            	List<ServerHardware> hardwareLijst = hModel.getHardware();
            	Aview.fillHardwareList(hardwareLijst);
            } 
            catch (Exception ex) 
            {
            	BView.showMessage("Mislukt");
            }
        }
    }
    
    class updateStatusListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e) {
        	try 
            {
        		ServerHardware updatedServer = BView.GetUserInputStatus();
        		ServerHardware exists = hModel.getServer(updatedServer.getID());
        		if(exists == null)
        		{
        			BView.showMessageStatus("Server bestaat niet");
        		}
        		else
        		{
        			exists.setStatus(updatedServer.isOnline());
        			BView.showMessageStatus("Server status aangepast");
        			List<ServerHardware> hardwareLijst = hModel.getHardware();
                	Aview.fillHardwareList(hardwareLijst);
        		}
            } 
            catch (Exception ex) 
            {
            	BView.showMessageStatus("mislukt");
            }
        }
    }
}