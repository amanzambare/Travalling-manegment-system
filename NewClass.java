package travelpkg;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class NewClass extends JFrame implements ActionListener
{
	
	private static DefaultTableModel model;
	JButton btnSubmit1;
    public static String stringOwnerName,showStringEmail,stringOccpancy,stringAddress,stringMobileNumber,stringEmail_id,stringCity,stringRooms,stringPeople,stringDestination,stringOffer,stringTransportType;
    public static String string_student_name ,string_student_gender ,string_address ,string_student_persnal_contact, string_student_parent_contact ,string_student_email,string_student_password,string_student_course_c;
	NewClass()
	{
		 JFrame frame = new JFrame();
	        JTable table = new JTable(); 
	     /*   Object[] columns = {"Name","Gender","address","mobno","parent","email","password","course"};
	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columns);
	     */   
	        model = new DefaultTableModel(new Object[]{"Owner_Name", "Occpancy","Address","MobileNumber","Email id","City","Rooms","People","Destination","Offer","TransportType"},0);
	        table.setModel(model);
	      
	     //   table.setModel(model);
	       insertData();
	       
	        table.setBackground(Color.LIGHT_GRAY);
	        table.setForeground(Color.black);
	        Font font = new Font("",1,22);
	        table.setFont(font);
	        table.setRowHeight(30);
	        
	        
	        JTextField textname = new JTextField();
	        JTextField textgender = new JTextField();
	        JTextField textaddress = new JTextField();
	        JTextField textmobno = new JTextField();
	        JTextField textparentno= new JTextField();
	        JTextField textemail= new JTextField();
	        JTextField textpassword= new JTextField();
	        JTextField textcourse= new JTextField();
	        JTextField textcourse1= new JTextField();
	        JTextField textcourse2= new JTextField();
	        JTextField textcourse3= new JTextField();
	        
	        //JButton btnAdd = new JButton("Add");
	        JButton btnDelete = new JButton("Delete");
	        JButton btnUpdate = new JButton("Update");     
	        
	        textname.setBounds(20, 220, 100, 25);
	        textgender.setBounds(20, 250, 100, 25);
	        textaddress.setBounds(20, 280, 100, 25);
	        textmobno.setBounds(20, 310, 100, 25);
	        textparentno.setBounds(20, 340, 100, 25);
	        textemail.setBounds(20, 370, 100, 25);
	        textpassword.setBounds(20, 410, 100, 25);
	        textcourse.setBounds(20, 440, 100, 25);
	        textcourse1.setBounds(20, 480, 100, 25);
	        textcourse2.setBounds(20, 510, 100, 25);
	        textcourse3.setBounds(20, 540, 100, 25);
	        
	       // btnAdd.setBounds(150, 220, 100, 25);
	        btnUpdate.setBounds(150, 265, 100, 25);
	        btnDelete.setBounds(150, 310, 100, 25);
	        
	        btnSubmit1 = new JButton("Back");
			btnSubmit1.setBounds(150, 350, 100, 25);
			add(btnSubmit1);		
			btnSubmit1.addActionListener(this);		
			btnSubmit1.setActionCommand("Back");
	        // create JScrollPane
	        JScrollPane pane = new JScrollPane(table);
	        pane.setBounds(0, 0, 1180, 200);
	        
	        frame.setLayout(null);
	        
	        frame.add(pane);
	        
	        // add JTextFields to the jframe
	        frame.add(textname);
	        frame.add(textgender);
	       frame.add(textaddress);
	        frame.add(textmobno);
	        frame.add(textparentno);
	        frame.add(textemail);
	        frame.add(textpassword);
	        frame.add(textcourse);
	        frame.add(textcourse1);
	        frame.add(textcourse2);
	        frame.add(textcourse3);
		        
	    
	    
	        // add JButtons to the jframe
	       // frame.add(btnAdd);
	        frame.add(btnDelete);
	        frame.add(btnUpdate);
	        frame.add(btnSubmit1);
	        
	        
	        Object[] row = new Object[11];
	        /*btnAdd.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					  row[0] = textId.getText();
		                row[1] = textFname.getText();
		                row[2] = textLname.getText();
		                row[3] = textAge.getText();
		                
		                // add row to the model
		                model.addRow(row);
		            }
		        });*/
	        
	        btnDelete.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					  int i = table.getSelectedRow();
		                if(i >= 0){
		                    // remove a row from jtable
		                    model.removeRow(i);
		                }
		                else{
		                    System.out.println("Delete Error");
		                    
		                    
		                }
		            }
		        });
	        
	        
	        
	        table.addMouseListener(new MouseAdapter(){
	            
	            @Override
	            public void mouseClicked(MouseEvent e){
	                
	                // i = the index of the selected row
	                int i = table.getSelectedRow();
	                
	               
	                
	    	        textname.setText(model.getValueAt(i, 0).toString());
	    	        textgender.setText(model.getValueAt(i, 1).toString());
	    	       textaddress.setText(model.getValueAt(i, 2).toString());
	    	        textmobno.setText(model.getValueAt(i, 3).toString());
	    	       textparentno.setText(model.getValueAt(i, 4).toString());
	    	        textemail.setText(model.getValueAt(i, 5).toString());
	    	        textpassword.setText(model.getValueAt(i, 6).toString());
	    	        textcourse.setText(model.getValueAt(i, 7).toString());
	    	        textcourse1.setText(model.getValueAt(i, 8).toString());
	                textcourse2.setText(model.getValueAt(i, 9).toString());
	                textcourse3.setText(model.getValueAt(i, 10).toString());
	            }
	            });
	        
	        
	        btnUpdate.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int i = table.getSelectedRow();
	                
	                if(i >= 0) 
	                {
	                   model.setValueAt(textname.getText(), i, 0);
	                   model.setValueAt(textgender.getText(), i, 1);
	                  model.setValueAt(textaddress.getText(), i, 2);
	                   model.setValueAt(textmobno.getText(), i, 3);
	                   model.setValueAt(textparentno.getText(), i, 4);
	                   model.setValueAt(textemail.getText(), i, 5);
	                   model.setValueAt(textpassword.getText(), i, 6);
	                   model.setValueAt(textcourse.getText(), i, 7);
	                   model.setValueAt(textcourse1.getText(), i, 8);
	                   model.setValueAt(textcourse2.getText(), i, 9);
	                   model.setValueAt(textcourse3.getText(), i, 10);
	                }
	                else{
	                    System.out.println("Update Error");
	                }
	            }
	        });
	        frame.setSize(1200,1000);
	        frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        
	     
	      
	}
	

	private static void insertData() {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_TravelAgency","root","1234");
			Statement stmt=con.createStatement();
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from tbl_Booking");
			

			while(rs.next())
				{
			
				stringOwnerName = rs.getString(1);
				stringOccpancy =  rs.getString(2);
				stringAddress =  rs.getString(3);
				stringMobileNumber =  rs.getString(4);
				stringEmail_id =  rs.getString(5);
				stringCity =  rs.getString(6);
				stringRooms =  rs.getString(7);
				stringPeople =  rs.getString(8);
				stringDestination =  rs.getString(9);
				stringOffer =  rs.getString(10);
				stringTransportType =  rs.getString(11);
				 int count = model.getRowCount()+1;
				 model.addRow(new Object[]{stringOwnerName,stringOccpancy,stringAddress,stringMobileNumber,stringEmail_id,stringCity,stringRooms,stringPeople,stringDestination,stringOffer,stringTransportType});				}
			
			con.close();

			}catch(Exception e){ 
				//System.out.println(e);
			}

		
	}
	
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//col_student_name ,col_student_gender ,col_address ,col_student_persnal_contact ,col_student_parent_contact ,col_student_email ,col_student_password ,col_student_course_c ,col_student_course_cpp ,col_student_course_java ,col_student_course_java_framework ,col_student_course_python ,col_student_course_android ,col_student_course_ios ,col_student_course_php ,col_student_course_dotnet ,col_student_course_plsql ,col_student_course_mysql ,col_student_course_oracle)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
    	new NewClass();
	}

	@Override
	public void actionPerformed(ActionEvent obj) 
	{
		// TODO Auto-generated method stub
		 if(obj.getSource()== btnSubmit1)
		{
			new HomePage();
			this.dispose();
		}
		
	}



}
