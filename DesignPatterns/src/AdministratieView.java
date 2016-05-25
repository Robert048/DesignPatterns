import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class AdministratieView extends JFrame{
	private Model model;
	private JButton btnVerhuurlijst = new JButton("Verhuurlijst");
	private JButton btnKlantenlijst = new JButton("Klantenlijst");
	private JButton btnServers = new JButton("Hardwarelijst");
	private JList list = new JList();
	
	public AdministratieView() {
		getContentPane().setLayout(null);
		
		btnVerhuurlijst.setBounds(10, 11, 103, 23);
		getContentPane().add(btnVerhuurlijst);
		
		btnKlantenlijst.setBounds(10, 42, 103, 23);
		getContentPane().add(btnKlantenlijst);
		
		list.setBounds(144, 14, 330, 236);
		getContentPane().add(list);
		
		btnServers.setBounds(10, 76, 103, 23);
		getContentPane().add(btnServers);
		
		this.setTitle("Administratie overzicht");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void reset()
	{
		
	}
	
	protected void verhuurListener(ActionListener al)
	{
		btnVerhuurlijst.addActionListener(al);
	}
	
	protected void klantListener(ActionListener al)
	{
		btnKlantenlijst.addActionListener(al);
	}
	
	protected void hardwareListener(ActionListener al)
	{
		btnServers.addActionListener(al);
	}
	
	protected <E> void fillList(List<E> lijst)
	{
		DefaultListModel model = new DefaultListModel<>();
		model.addElement(lijst.toString());
		list.setModel(model);
	}
}
