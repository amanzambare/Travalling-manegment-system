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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Package1 extends JFrame implements ActionListener
{
	public JLabel lb_Title, lb_note,background;
	//public JLabel lb_hint0,lb_hint1,lb_hint2,lb_hint3, lb_hint4, lb_hintFinal,show1;	
   // public JTextField tf_ownername,tf_aadhar,tf_chasisno,tf_purchasedate,tf_mob;
    public JTextArea ta_add;
    public  JButton btnHome,btnUser,btnAdmin,btnRtoServices;
    public  ButtonGroup bg;
	public  String show;
	
	Package1()
	{
	    //frame
    	super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
    	
    	//Title Label
    	lb_Title = new JLabel("Select your option for journey");
    	lb_Title.setBounds(200, 30, 350, 40);
    	lb_Title.setForeground(Color.white);
    	lb_Title.setFont(new Font("Serif", Font.BOLD, 21));
    	add(lb_Title);
    	
    	
    	

		//Buttons
//btnHome	
    	/*btnHome = new JButton("Home");
    	btnHome.setBounds(200, 80, 80, 40);
		add(btnHome);
		
		btnHome.addActionListener(this);		//Add action listener to btnHome
*/		//btnHome.setActionCommand("Home");
		
//btnUser
		btnUser = new JButton("Offer");
		btnUser.setBounds(180, 80, 80, 40);
		add(btnUser);
		btnUser.addActionListener(this);
		btnUser.setActionCommand("Offer");	//Add action listener to btnCancel
		
		//btnAdmin
		btnAdmin = new JButton("Transport type");
		btnAdmin.setBounds(300, 80, 100, 40);
		add(btnAdmin);
		btnAdmin.addActionListener(this);
		btnAdmin.setActionCommand("Transport type");
		
		
		JButton btnSubmit = new JButton("Back");
		btnSubmit.setBounds(100, 500, 100, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Back");

		
		//Add action listener to btnCancel
		
        

		
        /*ImageIcon background_image = new ImageIcon("src/swingwithjdbcPkg/img/car.jpg");
        JLabel background = new JLabel(" ",background_image,JLabel.LEFT);
        java.awt.Image img = background_image.getImage();
        background.setBounds(60, 160,850, 320);
        add(background);
        
    	
    	ImageIcon back_image = new ImageIcon("src/swingwithjdbcPkg/img/bike.jpg");
        JLabel back = new JLabel(" ",back_image,JLabel.CENTER);
        java.awt.Image im = back_image.getImage();
        back.setBounds(100, 160,850, 320);
        add(back);
        
        ImageIcon ba_image = new ImageIcon("src/swingwithjdbcPkg/img/activa.jpg");
        JLabel ba = new JLabel(" ",ba_image,JLabel.LEFT);
        java.awt.Image i = ba_image.getImage();
        ba.setBounds(650, 212,800, 215);
        add(ba);*/
		setLayout(new BorderLayout());
		
		background=new JLabel(new ImageIcon("src/travelpkg/off.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
		
               setVisible(true);
	}
	public static void main(String[] args)
	{
		new Package1();

	}
	@Override
	public void actionPerformed(ActionEvent obj) 
	{
		// TODO Auto-generated method stub
		String cmd = obj.getActionCommand();
		 if(cmd.equals("Transport type"))
		{
			new Transport();
			this.dispose();
		}
		 else if(cmd.equals("Offer"))
		 {
			 new Offer();
			 this.dispose();
		 }
		 else if(cmd.equals("Back"))
			{
				new HomePage();
				this.dispose();
			}

		
	}
}
	
	