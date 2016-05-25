import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Model 
{
	private List<Klant> klantenlijst = new ArrayList<Klant>();
	private List<Verhuur> verhuurlijst = new ArrayList<Verhuur>();
	
    Model() {
        reset();
    }

    public void reset() {
        
    }
    
    protected void addKlant(Klant klant)
    {
    	klantenlijst.add(klant);
    }
    
    protected void addVerhuur(Verhuur verhuur)
    {
    	verhuurlijst.add(verhuur);
    }
    
    protected List<Klant> getKlanten()
    {
    	return klantenlijst;
    }
    
    protected List<Verhuur> getVerhuur()
    {
    	return verhuurlijst;
    }
    
	public Klant getKlant(int klantID)
	{
		Klant returnKlant = null;
		for (Iterator<Klant> it = klantenlijst.iterator(); it.hasNext();)
		{
			Klant klant = it.next();
			if(klant.getID() == klantID)
			{
				returnKlant = klant;
			}
		}
		return returnKlant;
	}
}