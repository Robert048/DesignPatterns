import java.util.ArrayList;
import java.util.List;

public class Model 
{
	private List<Klant> klantenlijst = new ArrayList<Klant>();
	List<Verhuur> verhuurlijst = new ArrayList<Verhuur>();
	
    Model() {
        reset();
    }

    public void reset() {
        
    }
    
    protected void addKlant(Klant klant)
    {
    	klantenlijst.add(klant);
    }
    
    protected List<Klant> getKlanten()
    {
    	return klantenlijst;
    }
}