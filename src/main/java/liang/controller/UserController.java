package liang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import liang.dao.UserDAO;
import liang.model.User;

@Controller
@RequestMapping(value="/user")
public class UserController {

  @Autowired
  private UserDAO _userDAO;
  
  @RequestMapping(value="/delete")
  @ResponseBody
  public String delete(int id) {
    try {
      User user = new User(id);
      _userDAO.delete(user);
    }
    catch(Exception ex) {
      return ex.getMessage();
    }
    return "User succesfully deleted!";
  }
  
  @RequestMapping(value="/get-by-email")
  @ResponseBody
  public String getByEmail(String email) {
    String userId;
    try {
      User user = _userDAO.getByEmail(email);
      userId = String.valueOf(user.getId());
    }
    catch(Exception ex) {
      return "User not found";
    }
    return "The user id is: " + userId;
  }

  @RequestMapping(value="/save")
  @ResponseBody
  public String create(String email, String username) {
    try {
      User user = new User(email, username);
      _userDAO.save(user);
    }
    catch(Exception ex) {
      return ex.getMessage();
    }
    return "User succesfully saved!";
  }

} // class UserController