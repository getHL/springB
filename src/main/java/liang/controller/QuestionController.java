package liang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import liang.dao.QuestionRepository;
import liang.model.Question;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionRepository qDAO;
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(String topic, String content, String asker){
		
		Question question = new Question(topic, content, asker);
		qDAO.save(question);
		return "add question success";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int id){
		
		return "delete success";
	}
	
	@RequestMapping("/update")
	public String update(String topic, long id){
		
		qDAO.update(topic, id);
		return "update success!";
	}

}
