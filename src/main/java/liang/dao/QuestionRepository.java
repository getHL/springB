package liang.dao;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import liang.model.Question;


//问题实体逻辑处理的仓库类
public interface QuestionRepository extends CrudRepository<Question, Long>{
	
	@SuppressWarnings("unchecked")
	public Question save(Question question);
	
	public void delete(Question question);
	
	public Question findById(Long id);
	
	@Transactional
	@Modifying
	@Query("Update Question q set q.topic = ? where q.id = ?")
	public int update(String topic, long id);

}
