import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class AdministratieView extends JFrame{
	private Model model;
	private JButton btnVerhuurlijst = new JButton("Verhuurlijst");
	private JButton btnKlantenlijst = new JButton("Klantenlijst");
	private JList list = new JList();
	
	public AdministratieView() {
		getContentPane().setLayout(null);
		
		btnVerhuurlijst.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVerhuurlijst);
		
		btnKlantenlijst.setBounds(10, 42, 89, 23);
		getContentPane().add(btnKlantenlijst);
		
		list.setBounds(109, 14, 315, 236);
		getContentPane().add(list);
		
		this.setTitle("Administratie overzicht");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void reset()
	{
		
	}
	
	protected void verhuurListener(ActionListener al)
	{
		btnVerhuurlijst.addActionListener(al);
	}
	
	protected void fillList(HashMap<Verhuur, Klant> verhuurlijst)
	{
		DefaultListModel test = new DefaultListModel<>();
		test.addElement(verhuurlijst);
		list.setModel(test);
	}
}
