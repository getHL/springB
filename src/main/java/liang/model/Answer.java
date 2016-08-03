package liang.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "answer")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private int questionId;

	@NotNull
	@Size(max = 500)
	private String content;

	@NotNull
	private String answerer;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date answertime = new Timestamp(System.currentTimeMillis());
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswerer() {
		return answerer;
	}

	public void setAnswerer(String answerer) {
		this.answerer = answerer;
	}

	public Date getAnswertime() {
		return answertime;
	}

	public void setAnswertime(Date answertime) {
		this.answertime = answertime;
	}
	  
	  
	  
}
