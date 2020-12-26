package travelpkg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Admin_register extends JFrame implements ActionListener
{

	
    public static String gender;
	public JLabel lb_Title, lb_note, lb_gender,  lb_name, lb_email, lb_add, lb_mob, lb_courses, lb_userName,lb_pass;
		
		JPasswordField jPasswordField;
		public  JLabel background,lb_hint0, lb_hint1, lb_hint2, lb_hint3, lb_hint4, lb_hintFinal,show1;	//Label for showing text field
		public  JTextField tf_name, tf_email, tf_mob, tf_userName, tf_pass;
		public  JTextArea ta_add;
		public  JCheckBox cb1,cb2,cb3,cb4;		//for choosing courses java, android
		public  JRadioButton rb1,rb2;		//for choosing gender
		public  JButton btnSubmit,btnCancel,btnSubmit1;
		public  ButtonGroup bg;
		public  String show;
		public static String stringEmail,stringPassword,stringName,stringGender, stringAddress,stringMobile,StringUserName;
		
		
		Admin_register()
		{
			//frame size
			super("  Admin Registration Form");
			setSize(850, 950);
		    lb_Title = new JLabel("*** Admin Registration Form*****");
			lb_Title.setBounds(150, 20, 250, 20);
			add(lb_Title);
			lb_name = new JLabel("* Full Name:");		
			lb_name.setBounds(50, 80, 100, 20);
			add(lb_name);		
			tf_name = new JTextField();
			tf_name.setBounds(190, 80, 300, 20);
			add(tf_name);
			lb_hint1 = new JLabel();
			lb_hint1.setBounds(500, 80, 300, 20);
			add(lb_hint1);
			lb_gender = new JLabel("* Gender:");		
			lb_gender.setBounds(50, 120, 80, 20);
			add(lb_gender);
			rb1 = new JRadioButton("Male");
			rb1.setBounds(110, 120, 60, 20);
			rb2 = new JRadioButton("Female");
			rb2.setBounds(180, 120, 80, 20);		
			lb_hint0 = new JLabel();
			lb_hint0.setBounds(250, 120, 80, 20);
			add(lb_hint0);			
			bg = new ButtonGroup();
			bg.add(rb1);
			bg.add(rb2);
			add(rb1);
			add(rb2);
			lb_add = new JLabel("   Permenent Address:");		
			lb_add.setBounds(50, 160, 200, 20);
			add(lb_add);
			ta_add = new JTextArea();
			ta_add.setBounds(190, 160, 300, 60);
			add(ta_add);
			lb_mob = new JLabel("* Mobile Number:");		
			lb_mob.setBounds(50, 240, 200, 20);
			add(lb_mob);
			tf_mob = new JTextField();
			tf_mob.setBounds(190, 240, 300, 20);
			add(tf_mob);
			lb_hint2 = new JLabel();
			lb_hint2.setBounds(500, 240, 300, 20);
			lb_email = new JLabel("   Email Id:");		
			lb_email.setBounds(50, 280, 200, 20);
			add(lb_email);
					tf_email = new JTextField();		
					tf_email.setBounds(190, 280, 300, 20);
					add(tf_email);	
			/*lb_courses = new JLabel("*  Events Available:  (select from below)");
			lb_courses.setBounds(50, 320, 300, 20);
			add(lb_courses);	
			cb1 = new JCheckBox("Marriage");
			cb1.setBounds(100, 360, 100, 20);
			add(cb1);
			cb2 = new JCheckBox("family function");
			cb2.setBounds(250, 360, 100, 20);
			add(cb2);
			cb3 = new JCheckBox("Engagement ceremany");
			cb3.setBounds(100, 400, 100, 20);
			add(cb3);
			cb4 = new JCheckBox("birthday");
			cb4.setBounds(250, 400, 100, 20);
			add(cb4);*/
			lb_note = new JLabel("*** You must have to create unique USERNAME and PASSWORD for future LOGIN purpose.");		
			lb_note.setBounds(50, 340, 2000, 20);
			add(lb_note);
			lb_userName = new JLabel("* Username:");		
			lb_userName.setBounds(50, 380, 200, 20);
			add(lb_userName);
					tf_userName = new JTextField();		
					tf_userName.setBounds(190, 380, 300, 20);
					add(tf_userName);
					lb_hint3 = new JLabel();
					lb_hint3.setBounds(500, 380, 300, 20);
					lb_pass = new JLabel("* Password:");		
					lb_pass.setBounds(50, 420, 200, 20);
					add(lb_pass);
			jPasswordField = new JPasswordField();
		    jPasswordField.setBounds(190, 420, 300, 20);
		    add(jPasswordField);
			
			
			lb_hint4 = new JLabel();
			lb_hint4.setBounds(500, 320, 300, 20);  
			lb_hintFinal = new JLabel();
			lb_hintFinal.setBounds(200, 520, 300, 20); 
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

			add(lb_hint2);	
			add(lb_hint3);		
			add(lb_hint4);		 
			add(lb_hintFinal);
			
			setLayout(new BorderLayout());
			
			background=new JLabel(new ImageIcon("src/travelpkg/d.jpg"));
				add(background);
			
				background.setLayout(new FlowLayout());

			setVisible(true);
	}
		
		
		public static void main(String[] args)
		{
			new Admin_register();

		}

		


		private void validateEmail() 
		{
			// TODO Auto-generated method stub
			System.out.print("chimni.....");
			final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[a-z-]+(\\.[a-z]+)*(\\.[a-z]{2,6})$";
			this.stringEmail = tf_email.getText().toString();
			if(this.stringEmail.matches(EMAIL_PATTERN))
			{
				validatePassword(tf_pass.getText());
			}else 
				//if(this.stringEmail.isEmpty())
			{
				JOptionPane.showMessageDialog(btnSubmit, "Invalid Email.....");
			}
			
		}


		private void validatePassword(String password)
		{
			this.stringPassword = password;
			// TODO Auto-generated method stub
			if(this.stringPassword.isEmpty())
			{
				
				JOptionPane.showMessageDialog(btnSubmit, "password is Empty...");
			}
					
			
			// TODO Auto-generated method stub
			
		}


		@Override
		public void actionPerformed(ActionEvent obj) 
		{
			String cmd = obj.getActionCommand();

							
			 if(obj.getSource()==btnSubmit)
			{ if(tf_userName.getText().isEmpty() || jPasswordField.getText().isEmpty())
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
			}else if(cmd.equals("Back"))
			{
				new HomePage();
				this.dispose();
			}else if(obj.getSource() == btnCancel)
			{
				new HomePage();
				this.dispose();
			}

			// TODO Auto-generated method stub
			
		}


		private void insertDatabaseLogin() 
		{
			stringName = tf_name.getText();
			
			stringAddress = ta_add.getText();
			stringMobile= tf_mob.getText();

			// TODO Auto-generated method stub
			stringEmail = tf_email.getText();
			//.toString();
			StringUserName = tf_userName.getText();

			stringPassword = tf_pass.getText();
			//.toString();
			
			String sql="insert into tbl_Admin_registration(col_Name,col_Gender,Col_Address,col_Mob,col_Email,col_Username,col_Pass)values(?,?,?,?,?,?,?)";
					try{
						if(rb1.isSelected())
						{
							 gender = rb1.getText();	
						}else if(rb2.isSelected())
						{
							 gender = rb2.getText();
						}
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("com.mysql.jdbc.Driver");
				//Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1523:xe","system","root");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_TravelAgency","root","1234");
				PreparedStatement ps=cn.prepareStatement(sql);
				
				/*System.out.println("Enter rollnumber : ");
				rollnumber = scanner.nextInt();
				
				System.out.println("Enter name : ");
				name = scanner.next();
				*/
				ps.setString(1, stringName);
				ps.setString(2, gender);
				ps.setString(3, stringAddress);
				ps.setString(4, stringMobile);
				ps.setString(5, stringEmail);
				ps.setString(6, StringUserName);
				ps.setString(7, stringPassword );
		
				System.out.println(ps.executeUpdate());
			
			
			System.out.println("User is Registred Successfully.......");
				}catch(Exception e1)
			{
				
				System.out.println(e1);
				
		
			}
			
		}
			
		}