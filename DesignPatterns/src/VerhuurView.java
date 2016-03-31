import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class VerhuurView extends JFrame {
    //... Components
    private JTextField m_userInputTf = new JTextField(5);
    private JTextField naam = new JTextField(10);
    private JTextField m_totalTf     = new JTextField(20);
    private JButton    m_inputBtn = new JButton("Input");
    private JButton    m_clearBtn    = new JButton("Clear");
    
    private Model m_model;
    
    //======================================================= constructor
    /** Constructor */
    VerhuurView(Model model) {
        //... Set up the logic
        m_model = model;
        
        
        //... Initialize components
        m_totalTf.setText(m_model.getValue());
        m_totalTf.setEditable(false);
        
        //... Layout the components.      
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(m_userInputTf);
        content.add(m_inputBtn);
        content.add(new JLabel("Total"));
        content.add(m_totalTf);
        content.add(m_clearBtn);
        content.add(naam);
        
        //... finalize layout
        this.setContentPane(content);
        this.pack();
        
        this.setTitle("Huur een server");
        // The window closing event should probably be passed to the 
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void reset() {
        
    }
    
    String getUserInput() {
        return m_userInputTf.getText();
    }
    
    void setTotal(String newTotal) {
        m_totalTf.setText(newTotal);
    }
    
    void setNaam(String naam)
    {
    	this.naam.setText(naam);
    }
    
    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
    
    void addMultiplyListener(ActionListener mal) {
        m_inputBtn.addActionListener(mal);
    }
    
    void addClearListener(ActionListener cal) {
        m_clearBtn.addActionListener(cal);
    }
}