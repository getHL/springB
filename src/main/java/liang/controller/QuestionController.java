package liang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import liang.dao.QuestionDAO;
import liang.model.Question;

@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	QuestionDAO qDAO;
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(String content, String asker){
		
		Question question = new Question(content, asker);
		qDAO.save(question);
		
		return "add question success";
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int id){
		
		qDAO.delete(id);
		return "delete success";
	}

}
