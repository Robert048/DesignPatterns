import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;

public class AdministratieView extends JFrame{
	private JButton btnVerhuur = new JButton("Nieuwe verhuur/klant aanmaken");
	private  JButton btnHardware = new JButton("Nieuwe hardware toevoegen");
	private JList<Verhuur> lstVerhuur = new JList<Verhuur>();
	private JList<ServerHardware> lstServers = new JList<ServerHardware>();
	private JList<Klant> lstKlanten = new JList<Klant>();;
	private JLabel lvlKlanten = new JLabel("Klantenlijst:");
	private JLabel lblHardwareStatus = new JLabel("Hardware status:");
	private JLabel lblVerhuur = new JLabel("Verhuurlijst:");
	
	public AdministratieView() {
		getContentPane().setLayout(null);
		
		btnVerhuur.setBounds(116, 11, 280, 23);
		getContentPane().add(btnVerhuur);
		
		lstVerhuur.setBounds(406, 64, 368, 236);
		getContentPane().add(lstVerhuur);
		
		lstServers.setBounds(10, 64, 386, 236);
		getContentPane().add(lstServers);
		
		lstKlanten.setBounds(10, 328, 764, 158);
		getContentPane().add(lstKlanten);
		
		btnHardware.setBounds(406, 11, 280, 23);
		getContentPane().add(btnHardware);
		
		
		lblHardwareStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHardwareStatus.setBounds(10, 45, 141, 18);
		getContentPane().add(lblHardwareStatus);
		
		lblVerhuur.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVerhuur.setBounds(406, 45, 141, 18);
		getContentPane().add(lblVerhuur);
		
		lvlKlanten.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lvlKlanten.setBounds(10, 311, 141, 18);
		getContentPane().add(lvlKlanten);
		
		this.setTitle("Administratie overzicht");
		this.setSize(800, 525);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void verhuurListener(ActionListener al)
	{
		btnVerhuur.addActionListener(al);
	}
	
	protected void hardwareListener(ActionListener al)
	{
		btnHardware.addActionListener(al);
	}
	
	protected void fillHardwareList(List<ServerHardware> lijst)
	{
		DefaultListModel model = new DefaultListModel();
		for (ServerHardware serverHardware : lijst) {
			model.addElement(serverHardware.toString() + " Status: " + serverHardware.isOnline());
		}
		lstServers.setModel(model);
	}
	
	protected void fillKlantenList(List<Klant> lijst)
	{
		DefaultListModel model = new DefaultListModel<>();
		for (Klant klant : lijst) {
			model.addElement(klant.toString());
		}
		lstKlanten.setModel(model);
	}
	
	protected void fillVerhuurList(List<Verhuur> lijst)
	{
		DefaultListModel model = new DefaultListModel<>();
		for (Verhuur verhuur : lijst) {
			model.addElement(verhuur.toString());
		}
		lstVerhuur.setModel(model);
	}
}
