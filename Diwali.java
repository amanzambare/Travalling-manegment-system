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
import javax.swing.JTextArea;

public class Diwali extends JFrame implements ActionListener 
{
	public JLabel lb_Title, lb_note,background;

    Diwali()
  {
	super(" DIWALI OFFERS");
	setLayout(null);
	setSize(1070,800);
	
	//Title Label
	JLabel lb_Title = new JLabel("************Diwali Offers****************",JLabel.CENTER);
	lb_Title.setBounds(200, 30, 350, 40);
	lb_Title.setForeground(Color.RED);
	lb_Title.setFont(new Font("Serif", Font.BOLD, 19));


	add(lb_Title);
	JLabel lb_Title1 = new JLabel("1)Free unlimitead Beverages ");
	lb_Title1.setBounds(200, 90, 450, 40);
	lb_Title1.setForeground(Color.white);
	lb_Title1.setFont(new Font("Serif", Font.BOLD, 30));
	add(lb_Title1);
	JLabel lb_Title2 = new JLabel("2)Free Speciality Dining ");
	lb_Title2.setBounds(200, 120, 450, 40);
	lb_Title2.setForeground(Color.white);
	lb_Title2.setFont(new Font("Serif", Font.BOLD, 30));
	add(lb_Title2);
	JLabel lb_Title3 = new JLabel("3)30% OFF For Couples ");
	lb_Title3.setBounds(200, 150, 450, 40);
	lb_Title3.setForeground(Color.white);
	lb_Title3.setFont(new Font("Serif", Font.BOLD, 30));
    add(lb_Title3);
	JLabel lb_Title4 = new JLabel("4)Free Wifi ");
	lb_Title4.setBounds(200, 180, 450, 40);
	lb_Title4.setForeground(Color.white);
	lb_Title4.setFont(new Font("Serif", Font.BOLD, 30));
    add(lb_Title4);
	
	/*JLabel title = new JLabel("Want a Raise?", JLabel.CENTER);
	title.setForeground(Color.white);*/
	
	JButton btnSubmit = new JButton("Back");
	btnSubmit.setBounds(100, 500, 100, 40);
	add(btnSubmit);		
	btnSubmit.addActionListener(this);		
	btnSubmit.setActionCommand("Back");

	
	
	
	
	/*JTextArea ta_add = new JTextArea("1)Free unlimitead Beverages  "
			+ "2)Free Speciality Dining  "
			+ "3)30% OFF For Couples"
			+ "4)Free Wifi ");
	ta_add.setBounds(190, 160, 500, 60);
	add(ta_add);*/
	
	
	
	
	/*setSize(850, 950);
    JLabel lb_Title = new JLabel("************Diwali Offers************");
	lb_Title.setBounds(150, 20, 250, 20);
	add(lb_Title);
	JTextArea ta_add = new JTextArea();
	ta_add.setBounds(190, 20, 300, 60);
	add(ta_add);
	
		/*JTextArea ta_add = new JTextArea("1.Free unlimitead Beverages  "
			+ "2.Free Speciality Dining  "
			+ "3.30% OFF For Couples"
			+ "4.Free Wifi ");
	ta_add.setBounds(190, 160, 300, 60);
	add(ta_add);*/
	
    setLayout(new BorderLayout());
    background = new JLabel(new ImageIcon("src/travelpkg/diwa3.jpg"));
	add(background);

	background.setLayout(new FlowLayout());
	setVisible(true);
	
}
public static void main(String[] args) 
{
	new Diwali();
	// TODO Auto-generated method stub

}

@Override
public void actionPerformed(ActionEvent obj) {
	// TODO Auto-generated method stub
	String cmd = obj.getActionCommand();

	  if(cmd.equals("Back"))
		{
			new Offer();
			this.dispose();
		}


}
}
