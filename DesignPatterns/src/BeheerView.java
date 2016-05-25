import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class BeheerView extends JFrame
{
	private JTextField txtCores;
	private JTextField txtServerID;
	private JTextField txtRam;
	private JButton btnRegistreer;
	private JButton btnUpdateStatus;
	private JTextPane txtMessage;
	private JTextPane txtMessage2;
	private JLabel lblServerID;
	private JLabel lblStatus;
	private JCheckBox cbxOnline;
	private JComboBox<Locatie> boxLocatie;
	public BeheerView() {
		getContentPane().setLayout(null);
		
		JLabel lblCores = new JLabel("Cores");
		lblCores.setBounds(10, 14, 46, 14);
		getContentPane().add(lblCores);
		
		txtCores = new JTextField();
		txtCores.setBounds(66, 11, 126, 20);
		getContentPane().add(txtCores);
		txtCores.setColumns(10);
		
		JLabel lblRam = new JLabel("Ram");
		lblRam.setBounds(10, 42, 46, 14);
		getContentPane().add(lblRam);
		
		txtRam = new JTextField();
		txtRam.setBounds(66, 39, 126, 20);
		getContentPane().add(txtRam);
		txtRam.setColumns(10);
		
		JLabel lblLocatie = new JLabel("Locatie");
		lblLocatie.setBounds(10, 70, 46, 14);
		getContentPane().add(lblLocatie);
		
		btnRegistreer = new JButton("Registreer");
		btnRegistreer.setBounds(10, 95, 182, 23);
		getContentPane().add(btnRegistreer);
		
		txtMessage = new JTextPane();
		txtMessage.setBounds(10, 129, 182, 20);
		getContentPane().add(txtMessage);
		
		lblServerID = new JLabel("Server ID");
		lblServerID.setBounds(233, 14, 46, 14);
		getContentPane().add(lblServerID);
		
		txtServerID = new JTextField();
		txtServerID.setBounds(329, 11, 86, 20);
		getContentPane().add(txtServerID);
		txtServerID.setColumns(10);
		
		lblStatus = new JLabel("Online");
		lblStatus.setBounds(233, 42, 74, 14);
		getContentPane().add(lblStatus);
		
		btnUpdateStatus = new JButton("Update status");
		btnUpdateStatus.setBounds(233, 95, 182, 23);
		getContentPane().add(btnUpdateStatus);
		
		txtMessage2 = new JTextPane();
		txtMessage2.setBounds(233, 129, 182, 20);
		getContentPane().add(txtMessage2);
		
		List<Locatie> locaties = Arrays.asList(Locatie.values());
		
		boxLocatie = new JComboBox<Locatie>();
		for (Locatie locatie : locaties) {
			boxLocatie.addItem(locatie);
		}
		boxLocatie.setBounds(66, 67, 126, 20);
		getContentPane().add(boxLocatie);
		
		cbxOnline = new JCheckBox("");
		cbxOnline.setHorizontalAlignment(SwingConstants.CENTER);
		cbxOnline.setBounds(329, 38, 86, 23);
		getContentPane().add(cbxOnline);
		
		this.setTitle("Server aanmaken");
		this.setSize(438, 201);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	protected void registreerListener(ActionListener al)
	{
		btnRegistreer.addActionListener(al);
	}
	
	protected void updateStatusListener(ActionListener al)
	{
		btnUpdateStatus.addActionListener(al);
	}
}
