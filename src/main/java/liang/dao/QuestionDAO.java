package liang.dao;

import javax.persistence.Entity;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import liang.model.Question;

@Repository
@Transactional
public class QuestionDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public boolean save(Question question){
		getSession().save(question);
		return true;
	}
	
	//通过ID删除
	public boolean delete(int id){
		getSession().delete(new Question(id));
		return true;
		
	}
	

}
