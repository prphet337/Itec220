//Created by:Ryan Skipper
//Date started:3/25/2012
//For class:itec 220
//Assignment: project 3 wheel of knowledge
public class qAndA {
	
private String question;
private String answerA;
private String answerB;
private String answerC;
private String answerD;
private int correct;

public String getQuestion() {
	return question;
}
public String getAnswerA() {
	return answerA;
}

public String getAnswerB() {
	return answerB;
}

public String getAnswerC() {
	return answerC;
}

public String getAnswerD() {
	return answerD;
}
public int getCorrect() {
	return correct;
}
public qAndA(String question, String answerA, String answerB, String answerC, String answerD, int correct){
	this.question = question;
	this.answerA = answerA;
	this.answerB = answerB;
	this.answerC = answerC;
	this.answerD = answerD;
	this.correct = correct;
}
}
