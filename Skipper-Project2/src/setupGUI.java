/* Class used to create the GUI interface that the user sees.
** 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class setupGUI extends JPanel
{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	BigNumber number1 = new BigNumber();
	BigNumber number2 = new BigNumber();
	BigNumberAdder adder1 = new BigNumberAdder();
	
	public setupGUI() {
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(null);
		
		JLabel lblFirstNumber = new JLabel("First Number");
		lblFirstNumber.setBounds(21, 51, 92, 16);
		panel.add(lblFirstNumber);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setBounds(21, 103, 106, 16);
		panel.add(lblSecondNumber);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(21, 218, 61, 16);
		panel.add(lblTotal);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() 
		{
			// A key listener used to check the user's input to see if it is only numbers.
			// If the input is not numbers then it will delete the character automatically upon the keys release.
			public void keyReleased(KeyEvent e) 
			{
				char c = e.getKeyChar();
				if(c > 47 && c < 58 || c == 8 || c == '\n')
				{
					
				}
				else
				{
					textField.setText(textField.getText().substring(0, textField.getText().length()-1));
				}
			}
		});
		textField.setBounds(200, 39, 134, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() 
		{
			// A key listener used to check the user's input to see if it is only numbers.
			// If the input is not numbers then it will delete the character automatically upon the keys release.
			public void keyReleased(KeyEvent e) 
			{
				char c = e.getKeyChar();
				if(c > 47 && c < 58 || c == 8 || c == '\n')
				{
					
				}
				else
				{
					textField_1.setText(textField_1.getText().substring(0, textField_1.getText().length()-1));
				}
			}
		});
		textField_1.setBounds(200, 91, 134, 28);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		
		// Sets this textfield to not be able to be edited by the user.
		textField_2.setEditable(false);
		textField_2.setBounds(200, 199, 134, 28);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() 
		{
			// When the add button is clicked it takes the user's input from the two text
			// fields and puts them into the BigNumber class where the two stacks are setup.
			// Then calls upon the BigNumberAdder class to add the numbers within the stacks up and prints 
			// the sum into the third textfield.
			public void actionPerformed(ActionEvent event) 
			{
				String num1 = textField.getText();
				String num2 = textField_1.getText();
				
				for(int i = 0; i < num1.length(); i++)
				{
					number1.push(Integer.valueOf(num1.substring(i, i + 1)));
				}
				
				for(int a = 0; a < num2.length(); a++)
				{
					number2.push(Integer.valueOf(num2.substring(a, a + 1)));
				}
				
				textField_2.setText(adder1.add(number1, number2));
			}
		});
		btnAdd.setBounds(217, 144, 117, 29);
		panel.add(btnAdd);
		setLayout(groupLayout);
	}
	 
	public void display()
	{
		JFrame frame = new JFrame("Calculator");
		frame.setSize(400, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setVisible(true);
	}
	
}
