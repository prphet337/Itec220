import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display extends JFrame
{
	private JTextField userName;
	private JTextField Link;
	private JTextField ID;
	private JTextField Mail;
	private JTextField Comment;
	Login login = new Login();
	
	public Display() {
		getContentPane().setBackground(new Color(50, 205, 50));
		setTitle("Reddit User Information Display\n");
		getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setBounds(56, 20, 83, 16);
		getContentPane().add(lblUserName);
		
		JLabel lblNewLabel = new JLabel("Link Karma:");
		lblNewLabel.setBounds(19, 100, 92, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblCommentKarma = new JLabel("Comment Karma:");
		lblCommentKarma.setBounds(19, 217, 120, 16);
		getContentPane().add(lblCommentKarma);
		
		Link = new JTextField();
		Link.setEditable(false);
		Link.setBounds(139, 94, 134, 28);
		getContentPane().add(Link);
		Link.setColumns(10);
		
		Comment = new JTextField();
		Comment.setEditable(false);
		Comment.setBounds(139, 211, 134, 28);
		getContentPane().add(Comment);
		Comment.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Information");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					login.login(getUName());
				} 
				catch (Exception e1) 
				{
					e1.printStackTrace();
				}
				
				Link.setText(login.getLKarma());	
				Comment.setText(login.getCKarma());
				Mail.setText(login.getMail());
				ID.setText(login.getID());
					
				}
			}
			);
			btnNewButton.setBounds(260, 53, 143, 29);
			getContentPane().add(btnNewButton);
			
			JPanel panel = new JPanel();
			panel.setBackground(new Color(50, 205, 50));
			panel.setBounds(0, 0, 450, 278);
			getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblId = new JLabel("ID:");
			lblId.setBounds(22, 135, 18, 16);
			panel.add(lblId);
			
			userName = new JTextField();
			userName.setBounds(140, 16, 134, 28);
			panel.add(userName);
			userName.setColumns(10);
			
			JLabel lblMail = new JLabel("Mail:");
			lblMail.setBounds(22, 185, 61, 16);
			panel.add(lblMail);
			
			Mail = new JTextField();
			Mail.setBounds(140, 179, 134, 28);
			panel.add(Mail);
			Mail.setEditable(false);
			Mail.setColumns(10);
			
			ID = new JTextField();
			ID.setBounds(140, 129, 134, 28);
			panel.add(ID);
			ID.setEditable(false);
			ID.setColumns(10);
		}
	
		public String getUName()
		{
			String uName = userName.getText();
			System.out.println(uName);
			return uName;
		}
		
		public void display()
		{
			JFrame frame = new JFrame("Reddit Information");
			frame.setSize(400, 296);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setContentPane(this);
			frame.setVisible(true);
		}
}
