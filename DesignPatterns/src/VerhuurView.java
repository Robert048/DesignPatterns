import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VerhuurView extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	public VerhuurView() {
		getContentPane().setLayout(null);
		
		JLabel lblNaam = new JLabel("Naam");
		lblNaam.setBounds(10, 14, 46, 14);
		getContentPane().add(lblNaam);
		
		textField = new JTextField();
		textField.setBounds(106, 11, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(10, 42, 46, 14);
		getContentPane().add(lblAdres);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 39, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPostcode = new JLabel("Postcode");
		lblPostcode.setBounds(10, 70, 46, 14);
		getContentPane().add(lblPostcode);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 67, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLand = new JLabel("Land");
		lblLand.setBounds(10, 98, 46, 14);
		getContentPane().add(lblLand);
		
		textField_3 = new JTextField();
		textField_3.setBounds(106, 95, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblStad = new JLabel("Stad");
		lblStad.setBounds(10, 126, 46, 14);
		getContentPane().add(lblStad);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 123, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 154, 46, 14);
		getContentPane().add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 151, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRekeningNummer = new JLabel("Rekening nummer");
		lblRekeningNummer.setBounds(10, 182, 86, 14);
		getContentPane().add(lblRekeningNummer);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 179, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton = new JButton("Registreer");
		btnNewButton.setBounds(10, 207, 182, 23);
		getContentPane().add(btnNewButton);
	}
}