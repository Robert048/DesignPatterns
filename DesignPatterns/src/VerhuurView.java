import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class VerhuurView extends JFrame{
	private JTextField txtNaam;
	private JTextField txtAdres;
	private JTextField txtPostcode;
	private JTextField txtLand;
	private JTextField txtStad;
	private JTextField txtEmail;
	private JTextField txtRekening;
	private JButton btnRegistreer;
	private JTextPane txtMessage;
	private JLabel lblServerTypeweb;
	private JTextField txtType;
	private JLabel lblHuurperiodeInDagen;
	private JTextField txtPeriode;
	private JLabel lblKlantNummer;
	private JTextField txtNummer;
	private JButton btnHuren;
	public VerhuurView() {
		getContentPane().setLayout(null);
		
		JLabel lblNaam = new JLabel("Naam");
		lblNaam.setBounds(10, 14, 46, 14);
		getContentPane().add(lblNaam);
		
		txtNaam = new JTextField();
		txtNaam.setBounds(106, 11, 86, 20);
		getContentPane().add(txtNaam);
		txtNaam.setColumns(10);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(10, 42, 46, 14);
		getContentPane().add(lblAdres);
		
		txtAdres = new JTextField();
		txtAdres.setBounds(106, 39, 86, 20);
		getContentPane().add(txtAdres);
		txtAdres.setColumns(10);
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(10, 70, 46, 14);
		getContentPane().add(lblPostcode);
		
		txtPostcode = new JTextField();
		txtPostcode.setBounds(106, 67, 86, 20);
		getContentPane().add(txtPostcode);
		txtPostcode.setColumns(10);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(10, 98, 46, 14);
		getContentPane().add(lblLand);
		
		txtLand = new JTextField();
		txtLand.setBounds(106, 95, 86, 20);
		getContentPane().add(txtLand);
		txtLand.setColumns(10);
		
		JLabel lblStad = new JLabel("Stad");
		lblStad.setBounds(10, 126, 46, 14);
		getContentPane().add(lblStad);
		
		txtStad = new JTextField();
		txtStad.setBounds(106, 123, 86, 20);
		getContentPane().add(txtStad);
		txtStad.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 154, 46, 14);
		getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(106, 151, 86, 20);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblRekeningNummer = new JLabel("Rekening nummer");
		lblRekeningNummer.setBounds(10, 182, 86, 14);
		getContentPane().add(lblRekeningNummer);
		
		txtRekening = new JTextField();
		txtRekening.setBounds(106, 179, 86, 20);
		getContentPane().add(txtRekening);
		txtRekening.setColumns(10);
		
		btnRegistreer = new JButton("Registreer");
		btnRegistreer.setBounds(10, 207, 182, 23);
		getContentPane().add(btnRegistreer);
		
		txtMessage = new JTextPane();
		txtMessage.setBounds(10, 241, 182, 20);
		getContentPane().add(txtMessage);
		
		lblServerTypeweb = new JLabel("Server type (Web, Game, VoIP)");
		lblServerTypeweb.setBounds(249, 14, 161, 14);
		getContentPane().add(lblServerTypeweb);
		
		txtType = new JTextField();
		txtType.setBounds(247, 39, 86, 20);
		getContentPane().add(txtType);
		txtType.setColumns(10);
		
		lblHuurperiodeInDagen = new JLabel("Huurperiode in dagen");
		lblHuurperiodeInDagen.setBounds(249, 70, 161, 14);
		getContentPane().add(lblHuurperiodeInDagen);
		
		txtPeriode = new JTextField();
		txtPeriode.setBounds(249, 95, 86, 20);
		getContentPane().add(txtPeriode);
		txtPeriode.setColumns(10);
		
		lblKlantNummer = new JLabel("Klant nummer");
		lblKlantNummer.setBounds(249, 126, 84, 14);
		getContentPane().add(lblKlantNummer);
		
		txtNummer = new JTextField();
		txtNummer.setBounds(247, 151, 86, 20);
		getContentPane().add(txtNummer);
		txtNummer.setColumns(10);
		
		btnHuren = new JButton("Huren");
		btnHuren.setBounds(244, 178, 166, 23);
		getContentPane().add(btnHuren);
		
		this.setTitle("Server huren");
		this.setSize(500, 310);
	}
	
	protected void registreerListener(ActionListener al)
	{
		btnRegistreer.addActionListener(al);
	}
	
	protected Klant GetUserInput() 
	{
		Klant klant = new Klant(txtNaam.getText(), txtAdres.getText(), txtPostcode.getText(), txtLand.getText(), txtStad.getText(), txtEmail.getText(), txtRekening.getText());
		return klant;
	}
	
	protected void showMessage(String Message) 
	{
		txtMessage.setText(Message);
	}
	
	protected void nieuweVerhuurListener(ActionListener al) 
	{
		btnHuren.addActionListener(al);
	}
	
	int verhuurnr = 0;
	protected Verhuur GetUserInputVerhuur()
	{
		Server server = ServerBuilder.setupServer(txtType.getText(),ServerKlasseKeuze.BASIC);
		verhuurnr = verhuurnr + 1;
		Verhuur verhuur = new Verhuur(server, verhuurnr, Integer.parseInt(txtPeriode.getText()),Integer.parseInt(txtNummer.getText()));
		return verhuur;
	}
}