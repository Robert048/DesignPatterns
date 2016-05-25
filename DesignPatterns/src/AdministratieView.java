import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class AdministratieView extends JFrame{
	private Model model;
	private JButton btnVerhuur = new JButton("Nieuwe verhuur/klant aanmaken");
	private JList lstVerhuur = new JList();
	private JList lstServers = new JList();
	private JList lstKlanten = new JList();
	private final JButton btnHardware = new JButton("Nieuwe hardware toevoegen");
	
	public AdministratieView() {
		getContentPane().setLayout(null);
		
		btnVerhuur.setBounds(10, 11, 207, 23);
		getContentPane().add(btnVerhuur);
		
		lstVerhuur.setBounds(406, 49, 368, 236);
		getContentPane().add(lstVerhuur);
		
		lstServers.setBounds(10, 49, 386, 236);
		getContentPane().add(lstServers);
		
		lstKlanten.setBounds(10, 296, 764, 158);
		getContentPane().add(lstKlanten);
		btnHardware.setBounds(227, 11, 207, 23);
		
		getContentPane().add(btnHardware);
		
		this.setTitle("Administratie overzicht");
		this.setSize(800, 499);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void reset()
	{
		
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
		DefaultListModel model = new DefaultListModel<>();
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
