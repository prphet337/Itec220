//Created by:Ryan Skipper
//Date started:3/25/2012
//For class:itec 220
//Assignment: project 3 wheel of knowledge
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;


@SuppressWarnings("serial")
public class Question extends JFrame {

	private JPanel contentPane;

	Logic x; 
	qAndA y;
	public void bnCorrect(int pressed){
		if (pressed == y.getCorrect()){
			x.rightWrong(true);
		}
		else{
			x.rightWrong(false);
		}
		dispose();
	}
	public Question(Logic x, qAndA y) {
		this.x = x;
		this.y = y;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAnswerA = new JButton("A.) " + y.getAnswerA());
		btnAnswerA.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			 bnCorrect(0);
			}});
		
		JButton btnAnswerB = new JButton("B.) " + y.getAnswerB());
		btnAnswerB.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			 bnCorrect(1);
			}});
		
		
		JButton btnAnswerC = new JButton("C.) " + y.getAnswerC());
		btnAnswerC.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			 bnCorrect(2);
			}});
		
		
		JButton btnAnswerD = new JButton("D.) " + y.getAnswerD());
		btnAnswerD.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
			 bnCorrect(3);
			}});
		
		
		JLabel disQus = new JLabel(y.getQuestion());
		disQus.setFont(new Font("Times New Roman", Font.BOLD, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnAnswerA, GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
						.addComponent(btnAnswerB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAnswerC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAnswerD, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(182, Short.MAX_VALUE))
				.addComponent(disQus, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(disQus, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnAnswerA)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAnswerB)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAnswerC)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAnswerD)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
