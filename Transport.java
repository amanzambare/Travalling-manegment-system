package travelpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Transport extends JFrame implements ActionListener
{
	public JLabel lb_Title, lb_note,background;
	//public JLabel lb_hint0,lb_hint1,lb_hint2,lb_hint3, lb_hint4, lb_hintFinal,show1;	
   // public JTextField tf_ownername,tf_aadhar,tf_chasisno,tf_purchasedate,tf_mob;
    public JTextArea ta_add;
    public  JButton btnHome,btnUser,btnAdmin,btnRtoServices,btnSubmit1,btnSubmit;  
    public  ButtonGroup bg;
	public  String show;
	public  JRadioButton rb1,rb2,rb3;	
	public  JLabel lb_hint0;
	

	Transport()
	{
	    //frame
    	super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
    	
    	//Title Label
    	lb_Title = new JLabel("Select your travel type for tour");
    	lb_Title.setFont(new java.awt.Font("Times Roman New",3,20));
    	lb_Title.setBounds(250, 50, 300, 20);
    	add(lb_Title);
    	lb_Title.setBackground(Color.PINK);
           Font f = new Font("Impact", Font.ITALIC, 22);        
           lb_Title.setFont(f);
    	
    	
		rb1 = new JRadioButton("Airlines");
		rb1.setBounds(200, 120, 80, 20);
		rb2 = new JRadioButton("Travels");
		rb2.setBounds(300, 120, 80, 20);		
		lb_hint0 = new JLabel();
		lb_hint0.setBounds(250, 120, 80, 20);
		
		rb3 = new JRadioButton("Trains");
		rb3.setBounds(400, 120, 80, 20);
		lb_hint0 = new JLabel();
		lb_hint0.setBounds(250, 120, 80, 20);
		add(lb_hint0);				
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		add(rb3);
		
    	
		JButton btnSubmit = new JButton("Back");
		btnSubmit.setBounds(100, 500, 100, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Back");
		
		JButton btnSubmit1 = new JButton("Save");
		btnSubmit1.setBounds(500, 500, 100, 40);
		add(btnSubmit1);		
		btnSubmit1.addActionListener(this);		
		btnSubmit1.setActionCommand("Save");
		
		setLayout(new BorderLayout());
		
		/*background=new JLabel(new ImageIcon("src/travelpkg/p2.jpg"));
			add(background);*/
			background=new JLabel(new ImageIcon("src/travelpkg/1.jpg"));
			add(background);
		
		
			background.setLayout(new FlowLayout());
		
		setVisible(true);
	
		
        setVisible(true);

	}
	public static void main(String[] args)
	{
		new Transport();

	}

	@Override
	public void actionPerformed(ActionEvent obj) {
		// TODO Auto-generated method stub
		String cmd = obj.getActionCommand();
		if (cmd.equals("Back"))
	{
		new Package1();
		this.dispose();
	}
		//String cmd = obj.getActionCommand();

		  if(cmd.equals("Save"))
			{
				new HomePage();
				this.dispose();
			}
	}
}