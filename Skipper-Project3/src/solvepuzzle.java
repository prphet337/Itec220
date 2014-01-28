//Created by:Ryan Skipper
//Date started:3/25/2012
//For class:itec 220
//Assignment: project 3 wheel of knowledge


public class solvepuzzle {
	private String hint;
	private String solved;

	public String gethint() {
		return hint;
	}
	
	public String getsolved() {
		return solved;
	}

	public solvepuzzle(String hint,String solved){
		this.hint = hint;
		this.solved = solved;
	}
}