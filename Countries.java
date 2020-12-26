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

public class Countries extends JFrame implements ActionListener
{
	public JLabel background, lb_Title, lb_note;
	//public JLabel lb_hint0,lb_hint1,lb_hint2,lb_hint3, lb_hint4, lb_hintFinal,show1;	
   // public JTextField tf_ownername,tf_aadhar,tf_chasisno,tf_purchasedate,tf_mob;
    public JTextArea ta_add;
    public  JButton btnHome,btnUser,btnAdmin,btnRtoServices,btnRtoServices1,btnRtoServices2;
    public  ButtonGroup bg;
	public  String show;
	public  JTextField tf_name,tf_name1,tf_name2;
	public  JRadioButton rb1,rb2,rb3;		//for choosing gender

	
	Countries()
	{
	    //frame
    	super("Travel Agency");
    	setLayout(null);
    	setSize(1070,800);
    	
    	//Title Label
    	lb_Title = new JLabel("Select your Country for journey");
    	lb_Title.setBounds(200, 30, 250, 40);
    	add(lb_Title);
    	
    	rb1 = new JRadioButton("SWITZARLAND");
		rb1.setBounds(100, 80, 150, 40);
		lb_Title = new JLabel("Cost - 50,000/-");
    	lb_Title.setBounds(300, 80, 700, 40);
    	add(lb_Title);
    	ImageIcon back_image2 = new ImageIcon("src/travelpkg/kerala.jpg");
        JLabel back2 = new JLabel(" ",back_image2,JLabel.RIGHT);
        java.awt.Image im2 = back_image2.getImage();
        back2.setBounds(100, 2,800, 200);
        add(back2);
    	ImageIcon back_image1 = new ImageIcon("src/travelpkg/malaysia.jpg");
        JLabel back1 = new JLabel(" ",back_image1,JLabel.RIGHT);
        java.awt.Image im1 = back_image1.getImage();
        back1.setBounds(100, 133,800, 320);
        add(back1);
    	ImageIcon back_image = new ImageIcon("src/travelpkg/paris.jpg");
        JLabel back = new JLabel(" ",back_image,JLabel.RIGHT);
        java.awt.Image im = back_image.getImage();
        back.setBounds(100, 179,800, 600);
        add(back);
    	lb_Title = new JLabel("Duration - 7 Days & 6 Nights");
    	lb_Title.setBounds(300, 100, 700, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -   1.Taj    2.Star    3.Akasa suit");
    	lb_Title.setBounds(300, 120, 700, 40);
    	add(lb_Title);
		rb2 = new JRadioButton("MALESIA");
		rb2.setBounds(100, 200, 300, 20);
		lb_Title = new JLabel("Cost - 100,000/-");
    	lb_Title.setBounds(300, 220, 850, 20);
    	add(lb_Title);
    	lb_Title = new JLabel("Duration - 10 Days & 9 Nights");
    	lb_Title.setBounds(300, 240, 850, 20);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -   1.Vineyard   2.MultiStar   3.Raw Hotel");
    	lb_Title.setBounds(300, 260, 850, 20);
    	add(lb_Title);
    	
    	rb3 = new JRadioButton("Paris");
		rb3.setBounds(100, 330, 450, 20);
		lb_Title = new JLabel("Cost - 1,50,000/-");
    	lb_Title.setBounds(300, 340, 1000, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Duration - 12 Days & 11 Nights");
    	lb_Title.setBounds(300, 360, 1000, 40);
    	add(lb_Title);
    	lb_Title = new JLabel("Hotels -   1.Ifel Hotel    2.Tower Hotel   3.Swift Suit");
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
		JButton btnSubmit = new JButton("Back");
		btnSubmit.setBounds(100, 500, 100, 40);
		add(btnSubmit);		
		btnSubmit.addActionListener(this);		
		btnSubmit.setActionCommand("Back");

		

    	/*rb1 = new JRadioButton("Switzerland");
		rb1.setBounds(300, 120, 60, 20);
		JLabel lb_Title1 = new JLabel();
		lb_Title1.setBounds(190, 160, 300, 60);
		add(lb_Title1);*/
setLayout(new BorderLayout());
		
		background=new JLabel(new ImageIcon("src/travelpkg/v.jpg"));
			add(background);
		
			background.setLayout(new FlowLayout());
        setVisible(true);

	
        /*ImageIcon back_image = new ImageIcon("src/travelpkg/paris.jpg");
        JLabel back = new JLabel(" ",back_image,JLabel.CENTER);
        java.awt.Image im = back_image.getImage();
        back.setBounds(100, 160,850, 320);
        add(back);
        */
    	
    	/*ImageIcon back_image = new ImageIcon("src/travelpkg/Torism-Malaysia.jpg");
        JLabel back = new JLabel(" ",back_image,JLabel.CENTER);
        java.awt.Image im = back_image.getImage();
        back.setBounds(100, 160,850, 320);
        add(back);*/


        ImageIcon ba_image = new ImageIcon("travelpkg/paris.jpg");
        JLabel ba = new JLabel(" ",ba_image,JLabel.LEFT);
        java.awt.Image i = ba_image.getImage();
        ba.setBounds(650, 212,800, 215);
        add(ba);
        
        
               
	}

	public void actionPerformed1(ActionEvent cmd) {
				// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
            new Countries();
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
