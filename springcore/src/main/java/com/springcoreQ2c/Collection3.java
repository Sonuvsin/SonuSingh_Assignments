package com.springcoreQ2c;
import java.util.List;
import java.util.Set;
import java.util.Map;



public class Collection3 {
	private List<String> QuestionId;
	private Map<Integer,String> Questions;
	private Set<String> Answers;
	public List<String> getQuestionId() {
		return QuestionId;
	}
	public void setQuestionId(List<String> questionId) {
		QuestionId = questionId;
	}
	public Map<Integer, String> getQuestions() {
		return Questions;
	}
	public void setQuestions(Map<Integer, String> questions) {
		Questions = questions;
	}
	public Set<String> getAnswers() {
		return Answers;
	}
	public void setAnswers(Set<String> answers) {
		Answers = answers;
	}
	public Collection3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}