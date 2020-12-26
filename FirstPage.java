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

public class FirstPage  extends JFrame implements ActionListener
{
         JLabel background,lb_Title;
         JButton btnRtouser;
	FirstPage()
	{
		super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
		setLayout(new BorderLayout());
		lb_Title = new JLabel("WELCOME TO TRAVEL AGENCY",JLabel.CENTER);
    	lb_Title.setBounds(250, 300, 450, 50);
    	
    	lb_Title.setForeground(Color.BLUE);
    	lb_Title.setFont(new Font("Serif", Font.BOLD, 25));       
    	add(lb_Title);

    	
           btnRtouser = new JButton("Go TO Next Page");
  		 btnRtouser.setBounds(400, 600, 160, 40);
  		 btnRtouser.addActionListener(this);
  			btnRtouser.setBackground(Color.green);
  		 btnRtouser.setActionCommand(" Login");
  			
  			add(btnRtouser);
		
		background=new JLabel(new ImageIcon("src/travelpkg/p.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
			
			        
           setVisible(true);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new FirstPage();

	}
	@Override
	public void actionPerformed(ActionEvent obj) 
	{
		// TODO Auto-generated method stub
		if(obj.getSource()==btnRtouser)
		{
			new HomePage();
			this.dispose();
     	}
		
	}

}
