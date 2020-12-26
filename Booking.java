package travelpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class Booking extends JFrame implements ActionListener
{
	
	public static final String VERTICAL_SPLIT = null;
	public static String occupancy;
public JLabel lb_Title, lb_note, lb_gender,  lb_name, lb_email, lb_add, lb_mob, lb_courses, lb_userName,lb_pass;
	
	public  JLabel background,lb_hint0, lb_hint1,lb_pass2,lb_pass3,lb_pass1, lb_hint2, lb_hint3, lb_hint4, lb_hintFinal,show1;	//Label for showing text field
	public  JTextField tf_name, tf_email, tf_mob, tf_userName, tf_pass,tf_rooms;
	public  JTextArea ta_add;
	public  JCheckBox cb1,cb2,cb3,cb4;		//for choosing courses java, android
	public  JRadioButton rb1,rb2;		//for choosing gender
	public  JButton btnSubmit,btnCancel,btnSubmit1;
	public  ButtonGroup bg;
	public  String show;
	public static String stringemail,stringTransportType,stringcity,stringName,stringoccupancy, Stringaddress,stringmob,stringrooms,stringpeople;
	public static String stringoffer,StringOffer1;
	public static String stringcountry;
	 
	public static JComboBox cb,cb11,cb12;
	
	Booking()
	{
		//frame size
		super(" Booking Form");
		setSize(850, 950);
	    lb_Title = new JLabel("Booking Form");
		lb_Title.setBounds(150, 20, 250, 30);
		lb_Title.setForeground(Color.white);
    	lb_Title.setFont(new Font("Serif", Font.BOLD, 25));
		add(lb_Title);
		lb_name = new JLabel("* Full Name:");		
		lb_name.setBounds(50, 80, 100, 20);
		lb_name.setForeground(Color.white);
    	lb_name.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_name);		
		tf_name = new JTextField();
		tf_name.setBounds(190, 80, 300, 20);
		add(tf_name);
		lb_hint1 = new JLabel();
		lb_hint1.setBounds(500, 80, 300, 20);
		add(lb_hint1);
		lb_gender = new JLabel("* Occupancy:");		
		lb_gender.setBounds(50, 120, 80, 20);
		lb_gender.setForeground(Color.white);
		lb_gender.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_gender);
		rb1 = new JRadioButton("single");
		rb1.setBounds(190, 120, 60, 20);
		rb2 = new JRadioButton("Double");
		rb2.setBounds(250, 120, 80, 20);
		
		lb_hint0 = new JLabel();
		lb_hint0.setBounds(250, 120, 80, 20);
		add(lb_hint0);			
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		lb_add = new JLabel("   Permenent Address:");		
		lb_add.setBounds(30, 160, 200, 20);
		lb_add.setForeground(Color.white);
		lb_add.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_add);
		ta_add = new JTextArea();
		ta_add.setBounds(190, 160, 300, 60);
		add(ta_add);
		lb_mob = new JLabel("* Mobile Number:");		
		lb_mob.setBounds(50, 240, 200, 20);
		lb_mob.setForeground(Color.white);
		lb_mob.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_mob);
		tf_mob = new JTextField();
		tf_mob.setBounds(190, 240, 300, 20);
		add(tf_mob);
		lb_hint2 = new JLabel();
		lb_hint2.setBounds(500, 240, 300, 20);
		lb_email = new JLabel("  * Email Id:");		
		lb_email.setBounds(50, 280, 200, 20);
		lb_email.setForeground(Color.white);
		lb_email.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_email);
				tf_email = new JTextField();		
				tf_email.setBounds(190, 280, 300, 20);
				add(tf_email);	
		
				
		lb_userName = new JLabel("* City");		
		lb_userName.setBounds(50, 330, 200, 20);
		lb_userName.setForeground(Color.white);
		lb_userName.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_userName);
				tf_userName = new JTextField();		
				tf_userName.setBounds(190, 330, 300, 20);
				add(tf_userName);
				lb_hint3 = new JLabel();
				lb_hint3.setBounds(500, 330, 300, 20);
				JLabel lb_rooms = new JLabel("*Number Of Rooms:");		
				lb_rooms.setBounds(50, 380, 200, 20);
				lb_rooms.setForeground(Color.white);
				lb_rooms.setFont(new Font("Serif", Font.BOLD, 16));
				add(lb_rooms);
				tf_rooms = new JTextField();		
				tf_rooms.setBounds(190, 380, 300, 20);
				add(tf_rooms);
				lb_hint4 = new JLabel();
				lb_hint4.setBounds(500, 320, 300, 20); 
		lb_pass = new JLabel("*Number Of People:");		
		lb_pass.setBounds(50, 430, 200, 20);
		lb_pass.setForeground(Color.white);
		lb_pass.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_pass);
		tf_pass = new JTextField();		
		tf_pass.setBounds(190, 430, 300, 20);
		add(tf_pass);
		lb_hint4 = new JLabel();
		lb_hint4.setBounds(500, 320, 300, 20);  
		lb_hintFinal = new JLabel();
		lb_hintFinal.setBounds(200, 520, 300, 20); 
		btnSubmit = new JButton("Confirm");
		btnSubmit.setBounds(200, 630, 80, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Confirm");
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(300, 630, 80, 40);
		add(btnCancel);
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Close");	
		
		
		
		
		
		
		lb_pass1 = new JLabel("*Select your Destination:");		
		lb_pass1.setBounds(50, 470, 200, 20);
		lb_pass1.setForeground(Color.white);
		lb_pass1.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_pass1);
		String country[]={"SWIZARLAND","MALESIA","PARIS","GUJRAT","JAMMU&KASMIR","KERALA","DELHI","MUMBAI","GOA"};        
	    cb=new JComboBox(country);    
	    cb.setBounds(250, 470,120,20);    
	    add(cb);   
	    
	    lb_pass2 = new JLabel("*Select your Offer:");		
		lb_pass2.setBounds(50, 520, 200, 20);
		lb_pass2.setForeground(Color.white);
		lb_pass2.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_pass2);
		String Offer[]={"DIWALI","SUMMER VACATION","CHRISTMAS"};        
	     cb11=new JComboBox(Offer);    
	    cb11.setBounds(250, 520,120,20);    
	    add(cb11);
	    
	    lb_pass3 = new JLabel("*Select your TransportType:");		
		lb_pass3.setBounds(50, 570, 200, 20);
		lb_pass3.setForeground(Color.white);
		lb_pass3.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_pass3);
		String Offer1[]={"AIRLINES","TRAIN","TRAVELS"};        
	     cb12=new JComboBox(Offer1);    
	    cb12.setBounds(250, 570,120,20);    
	    add(cb12);
	    
		btnSubmit1= new JButton("Back");
		btnSubmit1.setBounds(500, 630, 100, 40);
		add(btnSubmit1);		
		btnSubmit1.addActionListener(this);		
		btnSubmit1.setActionCommand("Back");
		add(lb_hint2);	
		add(lb_hint3);		
		add(lb_hint4);		 
		add(lb_hintFinal);	
		
		  /*DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Item1");  
          l1.addElement("Item2");  
          l1.addElement("Item3");  
          l1.addElement("Item4");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(300, 560, 80, 40);  
		add(list);*/
		setLayout(new BorderLayout());
		
		background=new JLabel(new ImageIcon("src/travelpkg/a.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
			
		setVisible(true);

	

		
	}

	

	public Booking(String verticalSplit, Panel panel1) {
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new Booking();
		
	}

@Override
public void actionPerformed(ActionEvent obj)
{
	// TODO Auto-generated method stub
	String cmd = obj.getActionCommand();
	if(obj.getSource()==btnSubmit)
	 {
		
		 if(tf_mob.getText().isEmpty() || tf_email.getText().isEmpty())
	   	  {
			 System.out.println("Chimneee");
	   		  JOptionPane.showMessageDialog(btnSubmit, "Please enter  Email id and password");
	   	  }	
		 else
		 {
			 insertDatabaseLogin();
	            JOptionPane.showMessageDialog(btnSubmit, "Data Saved Successfully");

	           // new CourseSelection();           // this.dispose();
				
	        
		 }
		 if(obj.getSource() == btnSubmit)
		 {
			 new Payment();
			 this.dispose();
			 
		 }
    }
	
	else if(cmd.equals("Back"))
	{
		new HomePage();
		this.dispose();
	}
}

private void insertDatabaseLogin() 
{
	// TODO Auto-generated method stub
	
	
	stringName = tf_name.getText();
	
	//stringoccupancy = tf_currency.getText();
	// TODO Auto-generated method stub

	Stringaddress = ta_add.getText();

	stringmob = tf_mob.getText();
	stringemail = tf_email.getText();
	stringcity= tf_userName.getText();
	stringrooms = tf_rooms.getText();
	stringpeople = tf_pass.getText();
	stringcountry = (String) cb.getSelectedItem();
	System.out.println("ghgghg::"+stringcountry);
	
			//cb11.getSelectedItem();
	stringoffer = (String) cb11.getSelectedItem();
	stringTransportType = (String) cb12.getSelectedItem();
	String sql="insert into tbl_Booking(col_Name,col_occpancy,Col_address,col_mobile,col_email,col_city,col_rooms,col_people,col_Destination,col_Offer,col_TransportType)values(?,?,?,?,?,?,?,?,?,?,?)";
			try{
			
			
				if(rb1.isSelected())
				{
					occupancy = rb1.getText();	
				}else if(rb2.isSelected())
				{
					occupancy = rb2.getText();
				}
				
				
				
				
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("com.mysql.jdbc.Driver");
		//Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","system","root");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_TravelAgency","root","1234");
		PreparedStatement ps=cn.prepareStatement(sql);
		
	
		ps.setString(1, stringName);
		ps.setString(2, occupancy);
		ps.setString(3, Stringaddress);
		ps.setString(4, stringmob);
		ps.setString(5, stringemail );
		ps.setString(6, stringcity );
		ps.setString(7, stringrooms );
		ps.setString(8, stringpeople );
		ps.setString(9,  stringcountry );
		ps.setString(10, stringoffer );
		ps.setString(11,stringTransportType);

		
		System.out.println(ps.executeUpdate());
	
	
	System.out.println("User is Registred Successfully.......");
		}catch(Exception e1)
	{
		
		System.out.println(e1);
		

	}
	
}
	
}
