//Created by: Ryan Skipper
//Date started:3/25/2012
//For class:itec 220
//Assignment: project 3 wheel of knowledge
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Logic {
	private static final solvepuzzle solvepuzzle = null;
	private LinkedList<qAndA> question = new LinkedList<qAndA>();
	private LinkedList<solvepuzzle> puzzle = new LinkedList<solvepuzzle>();
	private boolean initialized = false;
	int wordHint = 0;
	int questionNumber = 0;
	int player1 = 0; 
	int length;
	int pLength = 0;
	int puzzleNum = 0;
	puzzlegui frame = new puzzlegui(this, solvepuzzle);
	public void question(){
		Scanner scan;
		try {
			scan = new Scanner(new File("Questions.txt"));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "document not found", "error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			return;
		}
		
		while(scan.hasNextLine()){
			String qus = scan.nextLine();
			System.out.println(qus);
			String anA = scan.nextLine();
			String anB = scan.nextLine();
			String anC = scan.nextLine();
			String anD = scan.nextLine();
			int correct = 0;
			if(anA.charAt(0) == 'C'){
				correct = 0;
			}
			else if(anB.charAt(0) == 'C'){
				correct = 1;
			}
			else if(anC.charAt(0) == 'C'){
				correct = 2;
			}
			else{
				correct = 3;
			}
			anA = anA.substring(2);
			anB = anB.substring(2);
			anC = anC.substring(2);
			anD = anD.substring(2);
			//pass in stings
			qAndA store = new qAndA(qus,anA,anB,anC,anD,correct);
			question.add(store);
		}
		 Collections.shuffle(question);
		 length = question.size();
	}
	public void send(){
		frame.setVisible(false);
		 Question frame = new Question(this, question.get(questionNumber));
		 questionNumber++;
		frame.setVisible(true);
		if(questionNumber == length){
			Collections.shuffle(question);
			questionNumber = 0;
		}

	}
	public void rightWrong(boolean right){
//create a scored method and display window link in puzzle
		if(right == true){
			 player1 += 10;
			JOptionPane.showMessageDialog(null, "Player Score: "+player1, "Correct! + 10 Points", JOptionPane.INFORMATION_MESSAGE);
			showpuzzle();
		}
		else{
			player1 -= 10;
			JOptionPane.showMessageDialog(null, "Player Score: "+player1, "Incorrect! - 10 Points", JOptionPane.INFORMATION_MESSAGE);
			send();
		}
	}
//scans in the puzzle.txt file
	public void puzzle(){
		Scanner scan;
	//	int pLength = 0;
	//  int puzzleNum = 0;
		try {
			scan = new Scanner(new File("puzzles.txt"));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "document not found", "error", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
			return;
		}
		
		while(scan.hasNextLine()){
			String hint = scan.nextLine();
			String word = scan.nextLine();
			word = word.toUpperCase();
		solvepuzzle store = new solvepuzzle(hint,word);
		puzzle.add(store);
		}
		
		//Collections.shuffle(puzzle);
		pLength = puzzle.size();
		frame.sethint(puzzle.get(puzzleNum).gethint());
		frame.setSolved(puzzle.get(puzzleNum).getsolved());
		//puzzleNum++;
		System.out.println(puzzleNum);
	}
	
	//sends the hint to the puzzle
	public void showpuzzle(){
		puzzle();
		frame.setVisible(true);
		wordHint = 0;
		if(wordHint == length){
			Collections.shuffle(puzzle);
			wordHint++;
		}
	}
	public Logic(){
		question();
		send();
		//showpuzzle();
		}
	public void addPonts(int i) {
		player1+=i;
		JOptionPane.showMessageDialog(null, "Player Score: "+player1, "Correct! + 100 Points", JOptionPane.INFORMATION_MESSAGE);
		send();
		//puzzleNum ++;
	}
}
