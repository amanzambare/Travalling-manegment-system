		package travelpkg;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Cities extends JFrame implements ActionListener
{
	public JLabel background,lb_Title, lb_note;
	//public JLabel lb_hint0,lb_hint1,lb_hint2,lb_hint3, lb_hint4, lb_hintFinal,show1;	
   // public JTextField tf_ownername,tf_aadhar,tf_chasisno,tf_purchasedate,tf_mob;
    public JTextArea ta_add;
    public  JButton btnHome,btnUser,btnAdmin,btnRtoServices,btnRtoServices1,btnRtoServices2;
    public  ButtonGroup bg;
	public  String show;
	public  JTextField tf_name,tf_name1,tf_name2;
	public  JRadioButton rb1,rb2,rb3;		//for choosing gender

	
	Cities()
	{
	    //frame
    	super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
    	
    	//Title Label
    	lb_Title = new JLabel("Select your City for journey");
    	lb_Title.setBounds(200, 30, 250, 40);
    	add(lb_Title);
    	
    	rb1 = new JRadioButton("Delhi");
		rb1.setBounds(100, 80, 150, 40);
		lb_Title = new JLabel("Cost - 20,000/-");
    	lb_Title.setBounds(300, 80, 700, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Duration - 3 Days & 2 Nights");
    	lb_Title.setBounds(300, 100, 700, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -       1.Taj         2.Star         3.Mayur Hotel ");
    	lb_Title.setBounds(300, 120, 700, 40);
    	add(lb_Title);
		rb2 = new JRadioButton("Mumbai");
		rb2.setBounds(100, 200, 300, 20);
		lb_Title = new JLabel("Cost - 15,000/-");
    	lb_Title.setBounds(300, 220, 850, 20);
    	add(lb_Title);
    	lb_Title = new JLabel("Duration - 2 Days & 2 Night");
    	lb_Title.setBounds(300, 240, 850, 20);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -       1.Vineyard        2.Taj Hotel        3.Oberoy  Hotel");
    	lb_Title.setBounds(300, 260, 850, 20);
    	add(lb_Title);
    	
    	rb3 = new JRadioButton("Goa");
		rb3.setBounds(100, 320, 450, 20);
		lb_Title = new JLabel("Cost - 40,000/-");
    	lb_Title.setBounds(300, 340, 1000, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Duration - 4 Days & 3 Nights");
    	lb_Title.setBounds(300, 360, 1000, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -      1.Hotel Beach     2. Hotel Space      3.Hotel Suit");
    	lb_Title.setBounds(300, 380, 1000, 40);
    	add(lb_Title);
		JLabel lb_hint0 = new JLabel();
		lb_hint0.setBounds(250, 120, 80, 20);
		add(lb_hint0);			
		bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		add(rb1);
		add(rb2);
		add(rb3);


    	/*rb1 = new JRadioButton("Switzerland");
		rb1.setBounds(300, 120, 60, 20);
		JLabel lb_Title1 = new JLabel();
		lb_Title1.setBounds(190, 160, 300, 60);
		add(lb_Title1);*/
		JButton btnSubmit = new JButton("Back");
		btnSubmit.setBounds(100, 500, 100, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Back");

		   ImageIcon back_image2 = new ImageIcon("src/travelpkg/delhi.jpg");
	        JLabel back2 = new JLabel(" ",back_image2,JLabel.RIGHT);
	        java.awt.Image im2 = back_image2.getImage();
	        back2.setBounds(150, 3,800, 200);
	        add(back2);
	    	ImageIcon back_image1 = new ImageIcon("src/travelpkg/mumbai.jpg");
	        JLabel back1 = new JLabel(" ",back_image1,JLabel.RIGHT);
	        java.awt.Image im1 = back_image1.getImage();
	        back1.setBounds(200, 133,800, 320);
	        add(back1);
	    	ImageIcon back_image = new ImageIcon("src/travelpkg/goa.jpg");
	        JLabel back = new JLabel(" ",back_image,JLabel.RIGHT);
	        java.awt.Image im = back_image.getImage();
	        back.setBounds(170, 179,800, 600);
	        add(back);
		

setLayout(new BorderLayout());
		
		background=new JLabel(new ImageIcon("src/travelpkg/v.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
        setVisible(true);

	
       }

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            new Cities();
	}

	@Override
	public void actionPerformed(ActionEvent obj) {
		// TODO Auto-generated method stub
		String cmd = obj.getActionCommand();

		  if(cmd.equals("Back"))
			{
				new Touristplaces();
				this.dispose();
			}
	}

}
