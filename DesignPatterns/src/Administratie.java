
public class Administratie {
	
	public static void main(String[] args) {
	     
		Model model = new Model();
        VerhuurView view = new VerhuurView(model);
        Controller controller = new Controller(model, view);
        
        view.setVisible(true);
	}
}
