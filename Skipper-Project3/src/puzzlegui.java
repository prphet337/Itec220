//Created by:Ryan Skipper
//Date started:3/25/2012
//For class:itec 220
//Assignment: project 3 wheel of knowledge

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class puzzlegui extends JFrame {
	private String gethint, getpuzzle;
	final Logic x;
	solvepuzzle y;
	boolean[] clicked = new boolean[26];
	JLabel hint = new JLabel("Hint: ");
	public void buttons(String letter){
		
		}
	private JPanel contentPane;
	private JTextField p1A;
	private JButton btnA;
	private JButton btnB;
	private JButton btnC;
	private JButton btnD;
	private JButton btnE;
	private JButton btnF;
	private JButton btnG;
	private JButton btnH;
	private JButton btnI;
	private JButton btnJ;
	private JButton btnK;
	private JButton btnL;
	private JButton btnM;
	private JButton btnN;
	private JButton btnO;
	private JButton btnP;
	private JButton btnQ;
	private JButton btnR;
	private JButton btnS;
	private JButton btnT;
	private JButton btnU;
	private JButton btnV;
	private JButton btnW;
	private JButton btnX;
	private JButton btnY;
	private JButton btnZ;
	private JButton btnNext;
	private JTextField guess;
	private JButton btnGuess; 
	private boolean initialized = false;
	char[] herp;
	String derp = new String();
	String str = new String();
	char[] ourAlphabet = {'A','B','C','D','E','F','G','H'
			,'I','J','K','L','M','N','O','P','Q'
			,'R','S','T','U','V','W','X','Y','Z'};
	char[] ourLowerAlphabet = {'a','b','c','d','e','f','g','h'
			,'i','j','k','l','m','n','o','p','q'
			,'r','s','t','u','v','w','x','y','z'};
	char[] charArray;
		public puzzlegui(final Logic x, solvepuzzle y) {
			final Logic qusNew = x;
			this.x = x;
			this.y = y;
			
		setTitle("Puzzle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		p1A = new JTextField();
		p1A.setBounds(5, 16, 322, 20);
		p1A.setEditable(false);
		p1A.setColumns(10);
		for(int i = 0; i < 26;i++){
			clicked[i] = true;
		}
		btnA = new JButton("A");
		btnA.setBounds(5, 47, 48, 23);
			btnA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent letterUsed) {
					((JButton) letterUsed.getSource()).getText();
					btnA.setEnabled(false);
					//copy to other button
					clicked[0]=false;
					compareChars('A');
					compareChars('a');
					nqus();
				}});
		btnB = new JButton("B");
		btnB.setBounds(59, 47, 48, 23);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnB.setEnabled(false);
				clicked[1]=false;
				compareChars('B');
				compareChars('b');
				nqus();
			}});
		
		btnC = new JButton("C");
		btnC.setBounds(115, 47, 48, 23);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnC.setEnabled(false);
				clicked[2]=false;
				compareChars('C');
				compareChars('c');
				nqus();
			}});
		
		btnD = new JButton("D");
		btnD.setBounds(171, 47, 48, 23);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnD.setEnabled(false);
				clicked[3]=false;
				compareChars('D');
				compareChars('d');
				nqus();
			}});
		
		btnE = new JButton("E");
		btnE.setBounds(225, 47, 48, 23);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnE.setEnabled(false);
				clicked[4]=false;
				compareChars('E');
				compareChars('e');
				nqus();
			}});
		contentPane.setLayout(null);
		contentPane.add(p1A);
		contentPane.add(btnA);
		contentPane.add(btnB);
		contentPane.add(btnC);
		contentPane.add(btnD);
		contentPane.add(btnE);
		
		btnF = new JButton("F");
		btnF.setBounds(279, 47, 48, 23);
		contentPane.add(btnF);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnF.setEnabled(false);
				clicked[5]=false;
				compareChars('F');
				compareChars('f');
				nqus();
			}});
		
		btnG = new JButton("G");
		btnG.setBounds(337, 47, 48, 23);
		contentPane.add(btnG);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnG.setEnabled(false);
				clicked[6]=false;
				compareChars('G');
				compareChars('g');
				nqus();
			}});
		
		btnH = new JButton("H");
		btnH.setBounds(5, 76, 48, 23);
		contentPane.add(btnH);
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnH.setEnabled(false);
				clicked[7]=false;
				compareChars('H');
				compareChars('h');
				nqus();
			}});
		
		btnI = new JButton("I");
		btnI.setBounds(61, 76, 48, 23);
		contentPane.add(btnI);
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnI.setEnabled(false);
				clicked[8]=false;
				compareChars('I');
				compareChars('i');
				nqus();
			}});
		
		btnJ = new JButton("J");
		btnJ.setBounds(115, 76, 48, 23);
		contentPane.add(btnJ);
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnJ.setEnabled(false);
				clicked[9]=false;
				compareChars('J');
				compareChars('j');
				nqus();
			}});
		
		btnK = new JButton("K");
		btnK.setBounds(171, 76, 48, 23);
		contentPane.add(btnK);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnK.setEnabled(false);
				clicked[10]=false;
				compareChars('K');
				compareChars('k');
				nqus();
			}});
		
		btnL = new JButton("L");
		btnL.setBounds(225, 76, 48, 23);
		contentPane.add(btnL);
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnL.setEnabled(false);
				clicked[11]=false;
				compareChars('L');
				compareChars('l');
				nqus();
			}});
		
		btnM = new JButton("M");
		btnM.setBounds(279, 76, 48, 23);
		contentPane.add(btnM);
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnM.setEnabled(false);
				clicked[12]=false;
				compareChars('M');
				compareChars('m');
				nqus();
			}});
		
		btnN = new JButton("N");
		btnN.setBounds(337, 76, 48, 23);
		contentPane.add(btnN);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnN.setEnabled(false);
				clicked[13]=false;
				compareChars('N');
				compareChars('n');
				nqus();
			}});
		
		btnO = new JButton("O");
		btnO.setBounds(5, 106, 48, 23);
		contentPane.add(btnO);
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnO.setEnabled(false);
				clicked[14]=false;
				compareChars('O');
				compareChars('o');
				nqus();
			}});
		
		btnP = new JButton("P");
		btnP.setBounds(61, 106, 48, 23);
		contentPane.add(btnP);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnP.setEnabled(false);
				clicked[15]=false;
				compareChars('P');
				compareChars('p');
				nqus();
			}});
		
		btnQ = new JButton("Q");
		btnQ.setBounds(115, 106, 48, 23);
		contentPane.add(btnQ);
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnQ.setEnabled(false);
				clicked[16]=false;
				compareChars('Q');
				compareChars('q');
				nqus();
			}});
		
		btnR = new JButton("R");
		btnR.setBounds(171, 106, 48, 23);
		contentPane.add(btnR);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnR.setEnabled(false);
				clicked[17]=false;
				compareChars('R');
				compareChars('r');
				nqus();
			}});
		
		btnS = new JButton("S");
		btnS.setBounds(225, 106, 48, 23);
		contentPane.add(btnS);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnS.setEnabled(false);
				clicked[18]=false;
				compareChars('S');
				compareChars('s');
				nqus();
			}});
		
		btnT = new JButton("T");
		btnT.setBounds(279, 106, 48, 23);
		contentPane.add(btnT);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnT.setEnabled(false);
				clicked[19]=false;
				compareChars('T');
				compareChars('t');
				nqus();
			}});
		
		btnU = new JButton("U");
		btnU.setBounds(337, 106, 48, 23);
		contentPane.add(btnU);
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnU.setEnabled(false);
				clicked[20]=false;
				compareChars('U');
				compareChars('u');
				nqus();
			}});
		
		btnV = new JButton("V");
		btnV.setBounds(59, 141, 48, 23);
		contentPane.add(btnV);
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnV.setEnabled(false);
				clicked[21]=false;
				compareChars('V');
				compareChars('v');
				nqus();
			}});
		
		btnW = new JButton("W");
		btnW.setBounds(115, 141, 48, 23);
		contentPane.add(btnW);
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnW.setEnabled(false);
				clicked[22]=false;
				compareChars('W');
				compareChars('w');
				nqus();
			}});
		
		btnX = new JButton("X");
		btnX.setBounds(171, 141, 48, 23);
		contentPane.add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnX.setEnabled(false);
				clicked[23]=false;
				compareChars('X');
				compareChars('x');
				nqus();
			}});
		
		btnY = new JButton("Y");
		btnY.setBounds(225, 141, 48, 23);
		contentPane.add(btnY);
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnY.setEnabled(false);
				clicked[24]=false;
				compareChars('Y');
				compareChars('y');
				nqus();
			}});
		
		btnZ = new JButton("Z");
		btnZ.setBounds(279, 141, 48, 23);
		contentPane.add(btnZ);
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				((JButton) letterUsed.getSource()).getText();
				btnZ.setEnabled(false);
				clicked[25]=false;
				compareChars('Z');
				compareChars('z');
				nqus();
			}});
		btnNext = new JButton("Next Question");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x.send();
				redoB();
			}
		});
		btnNext.setBounds(238, 186, 168, 38);
		contentPane.add(btnNext);
		
		
		hint.setFont(new Font("Tahoma", Font.PLAIN, 14));
		hint.setForeground(new Color(0, 0, 0));
		hint.setBackground(Color.WHITE);
		hint.setBounds(5, 210, 192, 23);
		contentPane.add(hint);
		
		/*guess = new JTextField();
		guess.setText("Guess the puzzle");
		guess.setBounds(5, 170, 198, 20);
		contentPane.add(guess);
		guess.setColumns(10);
		*/
		btnGuess = new JButton("Guess the Puzzle.");
		btnGuess.setBounds(225, 252, 198, 20);
		contentPane.add(btnGuess);
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent letterUsed) {
				guessPuzzle();
			}});
	}
		public void nqus(){
//stops all buttons from being clicked
			btnA.setEnabled(false);
			btnB.setEnabled(false);
			btnC.setEnabled(false);
			btnD.setEnabled(false);
			btnE.setEnabled(false);
			btnF.setEnabled(false);
			btnG.setEnabled(false);
			btnH.setEnabled(false);
			btnI.setEnabled(false);
			btnJ.setEnabled(false);
			btnK.setEnabled(false);
			btnL.setEnabled(false);
			btnM.setEnabled(false);
			btnN.setEnabled(false);
			btnO.setEnabled(false);
			btnP.setEnabled(false);
			btnQ.setEnabled(false);
			btnR.setEnabled(false);
			btnS.setEnabled(false);
			btnT.setEnabled(false);
			btnU.setEnabled(false);
			btnV.setEnabled(false);
			btnW.setEnabled(false);
			btnX.setEnabled(false);
			btnY.setEnabled(false);
			btnZ.setEnabled(false);
		}
		public void redoB(){
			//remakes all the buttons that were not clicked
						if(clicked [0] == true){
							btnA.setEnabled(true);
						}
						else{
							btnA.setEnabled(false);
						}
						if(clicked [1] == true){
							btnB.setEnabled(true);
						}
						else{
							btnB.setEnabled(false);
						}
						if(clicked [2] == true){
							btnC.setEnabled(true);
						}
						else{
							btnC.setEnabled(false);
						}
						if(clicked [3] == true){
							btnD.setEnabled(true);
						}
						else{
							btnD.setEnabled(false);
						}
						if(clicked [4] == true){
							btnE.setEnabled(true);
						}
						else{
							btnE.setEnabled(false);
						}
						if(clicked [5] == true){
							btnF.setEnabled(true);
						}
						else{
							btnF.setEnabled(false);
						}
						if(clicked [6] == true){
							btnG.setEnabled(true);
						}
						else{
							btnG.setEnabled(false);
						}
						if(clicked [7] == true){
							btnH.setEnabled(true);
						}
						else{
							btnH.setEnabled(false);
						}
						if(clicked [8] == true){
							btnI.setEnabled(true);
						}
						else{
							btnI.setEnabled(false);
						}
						if(clicked [9] == true){
							btnJ.setEnabled(true);
						}
						else{
							btnJ.setEnabled(false);
						}
						if(clicked [10] == true){
							btnK.setEnabled(true);
						}
						else{
							btnK.setEnabled(false);
						}
						if(clicked [11] == true){
							btnL.setEnabled(true);
						}
						else{
							btnL.setEnabled(false);
						}
						if(clicked [12] == true){
							btnM.setEnabled(true);
						}
						else{
							btnM.setEnabled(false);
						}
						if(clicked [13] == true){
							btnN.setEnabled(true);
						}
						else{
							btnN.setEnabled(false);
						}
						if(clicked [14] == true){
							btnO.setEnabled(true);
						}
						else{
							btnO.setEnabled(false);
						}
						if(clicked [15] == true){
							btnP.setEnabled(true);
						}
						else{
							btnP.setEnabled(false);
						}
						if(clicked [16] == true){
							btnQ.setEnabled(true);
						}
						else{
							btnQ.setEnabled(false);
						}
						if(clicked [17] == true){
							btnR.setEnabled(true);
						}
						else{
							btnR.setEnabled(false);
						}
						if(clicked [18] == true){
							btnS.setEnabled(true);
						}
						else{
							btnS.setEnabled(false);
						}
						if(clicked [19] == true){
							btnT.setEnabled(true);
						}
						else{
							btnT.setEnabled(false);
						}
						if(clicked [20] == true){
							btnU.setEnabled(true);
						}
						else{
							btnU.setEnabled(false);
						}
						if(clicked [21] == true){
							btnV.setEnabled(true);
						}
						else{
							btnV.setEnabled(false);
						}
						if(clicked [22] == true){
							btnW.setEnabled(true);
						}
						else{
							btnW.setEnabled(false);
						}
						if(clicked [23] == true){
							btnX.setEnabled(true);
						}
						else{
							btnX.setEnabled(false);
						}
						if(clicked [24] == true){
							btnY.setEnabled(true);
						}
						else{
							btnY.setEnabled(false);
						}
						if(clicked [25] == true){
							btnZ.setEnabled(true);
						}
						else{
							btnZ.setEnabled(false);
						}
		}
		public void sethint(String newhint){
			gethint = newhint;
			hint.setText("Hint: " + gethint);
		}
		//Set the puzzles dashes.
		public void setSolved(String newMask){
			redoB();
			getpuzzle = newMask;
			if(initialized == false){
				herp = new char[newMask.length()];
				Arrays.fill(herp, '-');
				char[] charArray = new char[newMask.length()];
				Arrays.fill(charArray,'-');
				str = new String(charArray);
				p1A.setText(str);
				initialized = true;
				
				for(int i = 0;i<getpuzzle.length();i++){
					if(getpuzzle.charAt(i)==' '){
						herp[i]=' ';
					}
					else{
						herp[i] = '-';
						str = new String(herp);
						p1A.setText(str);
					}
				}
			}
			else{
				for(int j = 0;j<clicked.length;j++){
					if(clicked[j] == false){
						compareChars(ourAlphabet[j]);
						compareChars(ourLowerAlphabet[j]);
					}
				}
			}
			
			p1A.setText(str);
		}
		public void compareChars(char ans){
			for(int i = 0;i<getpuzzle.length();i++){
				if(getpuzzle.charAt(i) == ans){
					herp[i] = ans;
					str = new String(herp);
					p1A.setText(str);
				}
			}
			
			p1A.setText(str);
		}
		public void guessPuzzle(){
			for(int i = 0;i<clicked.length;i++){
				if(clicked[i]==false){
					String str = JOptionPane.showInputDialog(null, "Enter your guess: ", "Guess the puzzle", 1);
					str = str.toUpperCase();
					if(str.matches(getpuzzle)){
						initialized = false;
						switchBoolean();
						x.addPonts(100);
						//setSolved();
					}
				}
			}
		}
		public void switchBoolean(){
			for(int i = 0;i<clicked.length;i++){
				clicked[i] = true;
			}
		}
}
/*if(right == true){
	 player1 += 10;
	JOptionPane.showMessageDialog(null, "Player Score: "+player1, "correct! + 10 Points", JOptionPane.INFORMATION_MESSAGE);
	showpuzzle();
}
else{
	player1 -= 10;
	JOptionPane.showMessageDialog(null, "Player Score: "+player1, "incorrect! - 10 Points", JOptionPane.INFORMATION_MESSAGE);
	send();
}
*/