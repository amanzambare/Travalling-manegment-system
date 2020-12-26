package travelpkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public  class RegistrationForm extends JFrame implements ActionListener 
{
public JLabel lb_Title, lb_note, lb_gender,  lb_name, lb_email, lb_add, lb_mob, lb_courses, lb_userName,lb_pass;
	
	public  JLabel lb_hint0, lb_hint1, lb_hint2, lb_hint3, lb_hint4, lb_hintFinal,show1;	//Label for showing text field
	public  JTextField tf_name, tf_email, tf_mob, tf_userName, tf_pass;
	public  JTextArea ta_add;
	public  JCheckBox cb1,cb2,cb3,cb4;		//for choosing courses java, android
	public  JRadioButton rb1,rb2;		//for choosing gender
	public  JButton btnSubmit,btnCancel;
	public  ButtonGroup bg;
	public  String show;
	
	
	RegistrationForm()
	{
		//frame size
		super(" Registration Form");
		setSize(850, 950);
	    lb_Title = new JLabel("************Registration Form************");
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
		tf_pass = new JTextField();		
		tf_pass.setBounds(190, 420, 300, 20);
		add(tf_pass);
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
		add(lb_hint2);	
		add(lb_hint3);		
		add(lb_hint4);		 
		add(lb_hintFinal);	
		
		JButton btnSubmit = new JButton("Back");
		btnSubmit.setBounds(100, 500, 100, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Back");
		setVisible(true);

	}
	public static void main(String[] args)
	{
		new RegistrationForm();

	}


@Override
public void actionPerformed(ActionEvent obj)
{
	// TODO Auto-generated method stub
	String cmd = obj.getActionCommand();
	
	if(cmd.equals("Submit"))
	{
		if(tf_userName.getText().isEmpty() || tf_pass.getText().isEmpty())
       	  {
       		  JOptionPane.showMessageDialog(btnSubmit, "Please enter user id and password");
       	  }	            
            else
            {
                JOptionPane.showMessageDialog(btnSubmit, "Data Saved Successfully");

            }
}
	
			if(obj.getSource()==btnSubmit)
	{
		
		if(tf_name.getText().isEmpty())
		{
			lb_hint1.setText("***blank field");
			lb_hintFinal.setText(null);
		}
		else if(tf_mob.getText().isEmpty())
		{
			lb_hint2.setText("***blank field");
			lb_hintFinal.setText(null);
		}
		else if(tf_userName.getText().isEmpty())
		{
			lb_hint3.setText("***blank field");
			lb_hintFinal.setText(null);
		}
		else if(tf_pass.getText().isEmpty())
		{
			lb_hint4.setText("***blank field");
			lb_hintFinal.setText(null);
		}
		else if(cmd.equals("Back"))
		{
			new HomePage();
			this.dispose();
		}
		
}
	
}
}
