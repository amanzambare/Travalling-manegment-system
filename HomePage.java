package travelpkg;

import java.awt.BorderLayout;
import java.awt.Button;
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

public class HomePage extends JFrame implements ActionListener
{
	public JLabel lb_Title, lb_note, background;
	//public JLabel lb_hint0,lb_hint1,lb_hint2,lb_hint3, lb_hint4, lb_hintFinal,show1;	
   // public JTextField tf_ownername,tf_aadhar,tf_chasisno,tf_purchasedate,tf_mob;
    public JTextArea ta_add;
    public  JButton btnHome,btnUser,btnUser4,btnUser3,btnAdmin,btnRtoServices, btnRtoAdmin,btnRtoServices1,btnRtouser,btnRtouser1;
    public  ButtonGroup bg;
	public  String show;
	
	HomePage()
	{
	    //frame
    	super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
    	
    	//Title Label
    	lb_Title = new JLabel("WELCOME TO KESHRI TRAVEL AGENCY");
   

    	lb_Title.setFont(new java.awt.Font("Times Roman New",3,20));
    	lb_Title.setBounds(380, 30, 450, 50);
    	add(lb_Title);
    	lb_Title.setBackground(Color.BLUE);
           Font f = new Font("Impact", Font.ITALIC, 22);        
           lb_Title.setFont(f);
           
    		//Add action listener to btnCancel
		
		//btnAdmin
		btnAdmin = new JButton("Package1");
		btnAdmin.setBounds(250, 80, 100, 40);
		add(btnAdmin);
		btnAdmin.addActionListener(this);
		btnAdmin.setBackground(Color.green);
		btnAdmin.setActionCommand("Package1");
		
		btnAdmin = new JButton("Touristplaces");
		btnAdmin.setBounds(400, 80, 120, 40);
		add(btnAdmin);
		btnAdmin.addActionListener(this);
		btnAdmin.setBackground(Color.green);
		btnAdmin.setActionCommand("Touristplaces");
		
		//Add action listener to btnCancel
		btnRtoServices = new JButton("Booking");
		btnRtoServices.setBounds(570, 80, 140, 40);
		add(btnRtoServices);
		btnRtoServices.addActionListener(this);
		btnRtoServices.setBackground(Color.green);
		btnRtoServices.setActionCommand(" Booking");	//Add action listener to btnCancel
		
		btnRtoServices1 = new JButton("Payment");
		btnRtoServices1.setBounds(750, 80, 160, 40);
		add(btnRtoServices1);
		btnRtoServices1.addActionListener(this);
		btnRtoServices1.setBackground(Color.green);
		btnRtoServices1.setActionCommand(" Payment");	//Add action listener to btnCancel
		
		 btnRtoAdmin = new JButton("Admin_registeration");
		btnRtoAdmin.setBounds(330, 140, 160, 40);
		btnRtoAdmin.addActionListener(this);
		btnRtoAdmin.setBackground(Color.green);
		btnRtoAdmin.setActionCommand(" Admin_register");
		
		add(btnRtoAdmin);
		btnUser = new JButton(" User Registration");
		btnUser.setBounds(640, 140, 160, 40);
		add(btnUser);
		btnUser.addActionListener(this);
		btnUser.setBackground(Color.green);
		btnUser.setActionCommand("Registration Form");
		
		
		btnUser3 = new JButton("Booking Details");
		btnUser3.setBounds(200, 200, 160, 40);
		add(btnUser3);
		btnUser3.addActionListener(this);
		btnUser3.setBackground(Color.green);
		btnUser3.setActionCommand("Booking Details");
		
		btnUser4 = new JButton("User Details");
		btnUser4.setBounds(740, 200, 160, 40);
		add(btnUser4);
		btnUser4.addActionListener(this);
		btnUser4.setBackground(Color.green);
		btnUser4.setActionCommand("User Details");
		
		 btnRtouser = new JButton("Admin Login");
		 btnRtouser.setBounds(400, 600, 160, 40);
		 btnRtouser.addActionListener(this);
			btnRtouser.setBackground(Color.green);
		 btnRtouser.setActionCommand(" Login");
			
			add(btnRtouser);
	    
		btnRtouser1 = new JButton("User Login");
		btnRtouser1.setBounds(600, 600, 160, 40);
		btnRtouser1.addActionListener(this);
		btnRtouser1.setBackground(Color.GREEN);
		btnRtouser1.setActionCommand("UserLogin");
				
				add(btnRtouser1);
       
    	
    	/*ImageIcon back_image = new ImageIcon("src/travelpkg/travel-agency.jpg");
        JLabel back = new JLabel(" ",back_image,JLabel.CENTER);
        java.awt.Image im = back_image.getImage();
        back.setBounds(100, 200,850, 320);
        add(back);*/
			setLayout(new BorderLayout());
				
			background=new JLabel(new ImageIcon("src/travelpkg/travel.jpeg"));
				add(background);
			
				background.setLayout(new FlowLayout());
				
				        
               setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new HomePage();
	}

	@Override
	public void actionPerformed(ActionEvent obj)
	{
		// TODO Auto-generated method stub
		String cmd = obj.getActionCommand();
		if(cmd.equals("Registration Form"))
		{
			new Project();
			this.dispose();
			
		     	}
		else if(cmd.equals("Package1"))
		{
			new Package1();
			this.dispose();
     	}
		else if(cmd.equals("Transport"))
		{
			new Transport();
			this.dispose();
     	}
		
		else if(cmd.equals("Touristplaces"))
		{
			new Touristplaces();
			this.dispose();
     	}
		
		else if(cmd.equals("Countries"))
		{
			new Countries();
			this.dispose();
     	}
	
		else if(cmd.equals("States"))
		{
			new States();
			this.dispose();
     	}
		
		else if(obj.getSource() == btnRtoServices1)
		{
			new Payment();
			this.dispose();
     	}
		else if(obj.getSource() == btnRtoServices)
		{
			new Booking();
			this.dispose();
     	}

			
		else if(obj.getSource()==btnAdmin)
		{
			new Cities();
			this.dispose();
     	}
		else if(cmd.equals("Offer"))
		{
			new Offer();
			this.dispose();
			
		 }	else if(obj.getSource() == btnRtoAdmin) 
			 //if(cmd.equals("Admin_register"))
			{
				new Admin_register();
				this.dispose();
				
			 }	else if(obj.getSource() == btnRtouser) 
				 //if(cmd.equals("Admin_register"))
				{
					new Login();
					this.dispose();
					
				 }	
			 else if(obj.getSource() == btnRtouser1) 
				 //if(cmd.equals("Admin_register"))
				{
					new Userlogin();
					this.dispose();
					
				 }	 else if(obj.getSource() == btnUser3) 
					 //if(cmd.equals("Admin_register"))
					{
						new NewClass();
						this.dispose();
						
					 }	
				 else if(obj.getSource() == btnUser4) 
					 //if(cmd.equals("Admin_register"))
					{
						new UserRegisterationDetails();
						this.dispose();
						
					 }	

			
		}



}

