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
@Table(name = "question")
public class Question {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private long id;
	  
	  @NotNull
	  @Size(max = 100)
	  private String topic;
	  
	  
	  @NotNull
	  @Size(max = 100)
	  private String content;
	 
	  //提问者用用户的邮箱标示
	  @NotNull
	  @Size(max = 80)
	  private String asker;
	  
	  @NotNull
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date asktime = new Timestamp(System.currentTimeMillis());
	  
	  @NotNull
	  private boolean answered = false;
	
	  public Question(int id){
		  this.setId(id);
	  }
	  
	public Question(String topic, String content, String asker) {
		this.setTopic(topic);
		this.setContent(content);
		this.setAsker(asker);
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getAsker() {
		return asker;
	}

	public void setAsker(String asker) {
		this.asker = asker;
	}


	public Date getAsktime() {
		return asktime;
	}


	public void setAsktime(Date asktime) {
		this.asktime = asktime;
	}


	public boolean isAnswered() {
		return answered;
	}


	public void setAnswered(boolean answered) {
		this.answered = answered;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	  
}
