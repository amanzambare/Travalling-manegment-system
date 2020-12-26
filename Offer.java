package travelpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Offer extends JFrame implements ActionListener
{
	public JLabel lb_Title, lb_note, background;
  Offer()
  {
	  super("OFFER");
  	setLayout(null);
  	setSize(1070,800);
  	
  	//Title Label
  	JLabel lb_Title = new JLabel("Select your option for Offer");
  	lb_Title.setBounds(200, 20, 250, 30);
  	lb_Title.setForeground(Color.BLUE);
	lb_Title.setFont(new Font("Serif", Font.BOLD, 21));
  	add(lb_Title);
  	
	JButton btnUser = new JButton("Diwali");
	btnUser.setBounds(100, 80, 80, 40);
	add(btnUser);
	btnUser.addActionListener(this);
	btnUser.setActionCommand("Diwali");	//Add action listener to btnCancel
	
	//btnAdmin
	JButton btnAdmin = new JButton("Summervacation");
	btnAdmin.setBounds(200, 80, 180, 40);
	add(btnAdmin);
	btnAdmin.addActionListener(this);
	btnAdmin.setActionCommand("Summervacation");
	
	JButton btnUser1 = new JButton("Christmas");
	btnUser1.setBounds(400, 80, 120, 40);
	add(btnUser1);
	btnUser1.addActionListener(this);
	btnUser1.setActionCommand("Christmas");
	JButton btnSubmit = new JButton("Back");
	btnSubmit.setBounds(100, 500, 100, 40);
	add(btnSubmit);		
	btnSubmit.addActionListener(this);		
	btnSubmit.setActionCommand("Back");//Add action listener to btnCancel
	
	setLayout(new BorderLayout());
	
	 background = new JLabel(new ImageIcon("src/travelpkg/offer1.jpg"));
		add(background);
	
		background.setLayout(new FlowLayout());
	
	 setVisible(true);
  }
	public static void main(String[] args) 
	{
		new Offer();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent obj) 
	{
		String cmd = obj.getActionCommand();
		if(cmd.equals("Diwali"))
		{
			new Diwali();
			this.dispose();
			
		 }
		//String cmd1 = obj.getActionCommand();
		if(cmd.equals("Christmas"))
		{
			new Christmas();
			this.dispose();
			
		 }
		//String cmd2 = obj.getActionCommand();
		if(cmd.equals("Summervacation"))
		{
			new Summervacation();
			this.dispose();
			
		 }

		  if(cmd.equals("Back"))
			{
				new Package1();
				this.dispose();
			}
		// TODO Auto-generated method stub
		
	}

}
