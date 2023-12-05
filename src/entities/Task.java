package entities;

public class Task extends Lesson {

	private String descripton;
	private int questionCount;
	
	public Task(String title, String description, int questionNumbers){
		this.setTitle(title);
		this.setDescripton(description);
		this.setQuestionCount(questionNumbers);
	}	
	
	@Override
	public int duration() {
		// TODO Auto-generated method stub
		return 60*5*this.getQuestionCount();
	}
	public String getDescripton() {
		return descripton;
	}
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	public int getQuestionCount() {
		return questionCount;
	}
	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	
	
	
}
