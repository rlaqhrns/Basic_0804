package class0805;

public class Question implements Complexity{

	private String question;
	private String answer;
	private int complexityLevel;
	
	
	Question(String newQuestion, String result){
		this.question = newQuestion;
		this.answer = result;
		complexityLevel = 1;
	}
	@Override
	public void setComplexity(int complexity) {
		// TODO Auto-generated method stub
		this.complexityLevel = complexity;
	}

	@Override
	public int getCompexity() {
		// TODO Auto-generated method stub
		return this.complexityLevel;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return this.answer;
	}
	
	public boolean correct(String reply) {
		
		return answer.equals(reply);
	}
	
	
	
	
	

}
