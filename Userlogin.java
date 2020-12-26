package travelpkg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Userlogin extends JFrame implements ActionListener
{
	JPasswordField jPasswordField;
	public static JLabel background,lb_userName,lb_hint1,lb_hint2,lb_pass,lb_Title;
	public static JTextField tf_userName,tf_pass ;
	public static JLabel ta_add;
	public static JButton btnSubmit,btnSubmit1,btnCancel;
	public static String stringPassword,StringUserName;
	
	
Userlogin()
{
	super("  Login Form");
	setSize(900, 850);
	lb_Title = new JLabel("*************User Login Form************");
	lb_Title.setBounds(150, 20, 250, 20);
	add(lb_Title);
	lb_userName = new JLabel("* UserName:");		
	lb_userName.setBounds(50, 80, 100, 20);
	add(lb_userName);		
	tf_userName = new JTextField();
	tf_userName.setBounds(190, 80, 300, 20);
	add(tf_userName);
	lb_hint1 = new JLabel();
	lb_hint1.setBounds(500, 80, 300, 20);
	add(lb_hint1);
	
	lb_pass = new JLabel("* Password:");		
	lb_pass.setBounds(50, 150, 100, 20);
	add(lb_pass);	
	jPasswordField = new JPasswordField();
    jPasswordField.setBounds(190, 150, 300, 20);
    add(jPasswordField);
	
	lb_hint2 = new JLabel();
	lb_hint2.setBounds(500, 150, 300, 20);
	add(lb_hint2);
	
	btnSubmit = new JButton("Submit");
	btnSubmit.setBounds(50, 220, 80, 20);
	add(btnSubmit);		
	btnSubmit.addActionListener(this);		
	btnSubmit.setActionCommand("Submit");
	btnCancel = new JButton("Cancel");
	btnCancel.setBounds(200, 220, 80, 20);
	add(btnCancel);
	btnCancel.addActionListener(this);
	btnCancel.setActionCommand("Close");			
		
  
	/*JButton btnSubmit1 = new JButton("Back");
	btnSubmit1.setBounds(100, 600, 100, 40);
	add(btnSubmit1);		
	btnSubmit1.addActionListener(this);		
	btnSubmit1.setActionCommand("Back");*/
	setLayout(null);

	setLayout(new BorderLayout());
	
	background=new JLabel(new ImageIcon("src/travelpkg/d.jpg"));
		add(background);
	
		background.setLayout(new FlowLayout());
	setVisible(true);

}
	public static void main(String[] args) 
	{
		new Login();
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent obj) 
	{
		// TODO Auto-generated method stub
		String cmd = obj.getActionCommand();
		 if(obj.getSource()==btnSubmit)
			{ 
			 if(tf_userName.getText().isEmpty() || jPasswordField.getText().isEmpty())
	   	  
			 {
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
		 if(obj.getSource()== btnCancel)
			 {
				  new HomePage();
	              this.dispose();			 
			 }
		
	}
	private void insertDatabaseLogin() 
	{
		// TODO Auto-generated method stub
		StringUserName = tf_userName.getText();

		stringPassword = jPasswordField.getText();

		String sql="insert into Userlogin(col_username,col_password";
		try{
		Class.forName("com.mysql.jdbc.Driver");
		//Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","system","root");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_TravelAgency","root","1234");
		PreparedStatement ps=cn.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		while ( rs.next())
		{
			if(rs.getString(6).equals(tf_userName.getText().toString()))
			{
				if(rs.getString(7).equals(jPasswordField.getText().toString()))
				{
					new HomePage();
					this.dispose();
					System.out.println("chimneeeeee.......");
				}else
				{
					System.out.println("popat :: tf_pass .......");
				}
			}else
			{
				System.out.println("popat :: tf_userName .......");
			}
		}
		/*System.out.println("Enter rollnumber : ");
		rollnumber = scanner.nextInt();
		
		System.out.println("Enter name : ");
		name = scanner.next();
		*/
		
		/*ps.setString(1, StringUserName);
		ps.setString(2, stringPassword );

		System.out.println(ps.executeUpdate());
	
	
	System.out.println("User is Registred Successfully.......");
*/		}catch(Exception e1)
	{
		
		System.out.println(e1);
		

	}
	


	
	}

}
