package travelpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Payment extends JFrame implements ActionListener 
{
	public static String gender,account;
	public JLabel lb_hint01,background,lb_title,lb_currency, lb_username,lb_password,lb_paymentid,lb_paymenttype,lb_paymentdate,lb_paymentamount,lb_emailid,lb_note,lb_type;
	public  JCheckBox cb1,cb2,cb3;		//for choosing courses java, android
	public  JButton btnSubmit,btnCancel,btnSubmit1;
    public JLabel lb_hint1,lb_hint4,lb_hintFinal,lb_username1,lb_Accountnumber,lb_Accountname;
	public  JTextField tf_username,tf_Accountnumber,tf_Accountname,tf_currency, tf_password, tf_paymentid, tf_paymenttype, tf_paymentdate,tf_paymentamoumt,tf_emailid;
	public  String show;
	JRadioButton rb11,rb21,rb31,rb1,rb2;
	public  JTextArea ta_add;
	public static String stringEmail,stringPassword,stringName,stringGender, stringAddress,stringMobile,StringUserName,stringcurrency;

	
	Payment()
	{
		super(" Payment Form");
		setSize(850, 950);
		lb_title = new JLabel("Payment Form");
		lb_title.setBounds(150, 20, 250, 30);
		lb_title.setForeground(Color.white);
    	lb_title.setFont(new Font("Serif", Font.BOLD, 25));
		add(lb_title);	
		lb_username = new JLabel("Username:");		
		lb_username.setBounds(50, 80, 100, 20);
		lb_username.setForeground(Color.white);
		lb_username.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_username);		
		tf_username = new JTextField();
		tf_username.setBounds(190, 80, 300, 20);
		add(tf_username);
		lb_hint1 = new JLabel();
		lb_hint1.setBounds(500, 80, 300, 20);
		add(lb_hint1);
		JLabel lb_gender = new JLabel("* Gender:");		
		lb_gender.setBounds(50, 120, 80, 20);
		lb_gender.setForeground(Color.white);
		lb_gender.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_gender);
		 rb1 = new JRadioButton("Male");
		rb1.setBounds(190, 120, 60, 20);
		 rb2 = new JRadioButton("Female");
		rb2.setBounds(250, 120, 80, 20);		
		JLabel lb_hint0 = new JLabel();
		lb_hint0.setBounds(250, 120, 80, 20);
		add(lb_hint0);			
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		
		lb_currency = new JLabel("Currency:");		
		lb_currency.setBounds(50, 160, 200, 20);
		lb_currency.setForeground(Color.white);
		lb_currency.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_currency);		
		tf_currency = new JTextField();
		tf_currency.setBounds(190, 160, 300, 20);
		add(tf_currency);
		
		
		JLabel lb_paymenttype = new JLabel("*Payment Type:");		
		lb_paymenttype.setBounds(50, 200, 150, 20);
		lb_paymenttype.setForeground(Color.white);
		lb_paymenttype.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_paymenttype);
		rb11 = new JRadioButton("ATM");
		rb11.setBounds(190, 200, 60, 20);
		 rb21 = new JRadioButton("CASH");
		rb21.setBounds(260, 200, 80, 20);	
		 rb31 = new JRadioButton("MobileApp");
		rb31.setBounds(350, 200, 110, 20);
		 lb_hint01 = new JLabel();
		lb_hint01.setBounds(220, 120, 80, 20);
		add(lb_hint01);			
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb11);
		bg1.add(rb21);
		add(rb11);
		add(rb21);
        add(rb31);
		
         lb_Accountname = new JLabel("*Account Name:");		
        lb_Accountname.setBounds(50, 250, 150, 20);
        lb_Accountname.setForeground(Color.white);
        lb_Accountname.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_Accountname);
		 tf_Accountname = new JTextField();
		tf_Accountname.setBounds(190, 250, 300, 20);
		add(tf_Accountname);
		
		 lb_Accountnumber = new JLabel("*Account Number:");		
        lb_Accountnumber.setBounds(50, 300, 150, 20);
        lb_Accountnumber.setForeground(Color.white);
        lb_Accountnumber.setFont(new Font("Serif", Font.BOLD, 16));
		add(lb_Accountnumber);
		tf_Accountnumber= new JTextField();
		tf_Accountnumber.setBounds(190, 300, 300, 20);
		add(tf_Accountnumber);
		
	    btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(200, 460, 80, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Submit");
		
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBounds(300, 460, 80, 40);
		add(btnCancel);
		btnCancel.addActionListener(this);
		btnCancel.setActionCommand("Close");
		

		btnSubmit1= new JButton("Back");
		btnSubmit1.setBounds(100, 600, 100, 40);
		add(btnSubmit1);		
		btnSubmit1.addActionListener(this);		
		btnSubmit1.setActionCommand("Back");
		add(lb_hint1);
		//add(lb_hintFinal);
		
		
		
setLayout(new BorderLayout());
		
		background=new JLabel(new ImageIcon("src/travelpkg/form.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
			
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	     new Payment();
	}


	@Override
	public void actionPerformed(ActionEvent obj)
	{
		String cmd = obj.getActionCommand();
		 if(obj.getSource()==btnSubmit)
		 {
			
			 if(tf_Accountname.getText().isEmpty() || tf_Accountnumber.getText().isEmpty())
		   	  {
				 System.out.println("Chimneee");
		   		  JOptionPane.showMessageDialog(btnSubmit, "Please enter user id and password");
		   	  }	
			 else
			 {
				 insertDatabaseLogin();
		            JOptionPane.showMessageDialog(btnSubmit, "Data Saved Successfully");

		           // new CourseSelection();
		           // this.dispose();
					
		        
			 }
		 }
		if(cmd.equals("Back"))
		{
			new HomePage();
			this.dispose();
		}
		
	}
	

	private void insertDatabaseLogin()
{
		// TODO Auto-generated method stub
		stringName = tf_username.getText();
		
		stringcurrency = tf_currency.getText();
		// TODO Auto-generated method stub
	
		StringUserName = tf_Accountname.getText();

		stringPassword = tf_Accountnumber.getText();
		//.toString();
		
		String sql="insert into tbl_Payment(col_Name,col_gender,Col_currency,col_Accounttype,col_Accountname,col_Accountnumber)values(?,?,?,?,?,?)";
				try{
				
				
					if(rb1.isSelected())
					{
						 gender = rb11.getText();	
					}else if(rb2.isSelected())
					{
						 gender = rb21.getText();
					}
					
					if(rb11.isSelected())
					{
						account= rb11.getText();	
					}else if(rb21.isSelected())
					{
						account = rb21.getText();
					}else if(rb31.isSelected())
					{
						account = rb31.getText();
					}
					
					
					
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			//Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","system","root");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_TravelAgency","root","1234");
			PreparedStatement ps=cn.prepareStatement(sql);
			
		
			ps.setString(1, stringName);
			ps.setString(2, gender);
			ps.setString(3, stringcurrency);
			ps.setString(4, account);
			ps.setString(5, StringUserName );
			ps.setString(6, stringPassword );
	
			System.out.println(ps.executeUpdate());
		
		
		System.out.println("User is Registred Successfully.......");
			}catch(Exception e1)
		{
			
			System.out.println(e1);
			
	
		}
		
	}
		
	}


	