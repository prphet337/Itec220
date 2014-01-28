import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CardTable extends JPanel 
{
	//Deck deck = new Deck();
	Logic logic = new Logic();
	Random generator = new Random();
	int index = 0;
	JTextField Out;
	
	public CardTable() 
	{
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(0, 0, 386, 343);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblDealer = new JLabel("Dealer");
		lblDealer.setBounds(69, 34, 40, 16);
		panel.add(lblDealer);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setForeground(new Color(0, 0, 0));
		lblPlayer.setBounds(236, 255, 61, 16);
		panel.add(lblPlayer);
		
		JButton btnHit = new JButton("Hit");
		btnHit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				logic.Hit();
			}
		});
		btnHit.setBounds(18, 242, 75, 29);
		panel.add(btnHit);
		
		JButton btnStand = new JButton("Stand");
		btnStand.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				logic.Stand();
			}
		});
		btnStand.setBounds(18, 268, 75, 29);
		panel.add(btnStand);
		
		JButton btnDeal = new JButton("Deal");
		btnDeal.addActionListener(new ActionListener() 
		{	
			public void actionPerformed(ActionEvent arg0) 
			{
				logic.Deal();
			}
		});
		btnDeal.setBounds(18, 308, 75, 29);
		panel.add(btnDeal);
		
		JLabel lblNewLabel = new JLabel("Dealer Stands on Hard 17");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(18, 149, 209, 16);
		panel.add(lblNewLabel);
		
		Out = new JTextField();
		Out.setEditable(false);
		Out.setBounds(246, 143, 134, 28);
		panel.add(Out);
		Out.setColumns(10);
		
		if(logic.outcome.equals("Blackjack"))
		{
			Out.setText("Blackjack");
		}
		
		if(logic.outcome.equals("Win"))
		{
			Out.setText("You Win");
		}
		
		if(logic.outcome.equals("Lose"))
		{
			Out.setText("Dealer Wins");
		}
		
		if(logic.outcome.equals("Tie"))
		{
			Out.setText("You Tied");
		}
	}
	
	public void display()
	{
		JFrame frame = new JFrame("Blackjack");
		frame.setSize(400, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setVisible(true);
	}
}
