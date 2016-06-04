
public class Administratie {
	
	public static void main(String[] args) {
	     
		Model model = new Model();
		HardwareBeheer HardwareModel = new HardwareBeheer();
        AdministratieView aView = new AdministratieView();
        VerhuurView vView = new VerhuurView();
        BeheerView bView = new BeheerView();
        @SuppressWarnings("unused")
		Controller controller = new Controller(model, HardwareModel, aView, vView, bView);
        
        aView.setVisible(true);
	}	
}
