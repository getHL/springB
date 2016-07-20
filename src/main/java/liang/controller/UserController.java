package liang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import liang.dao.UserDao;
import liang.model.User;

@Controller
@RequestMapping(value="/account")
public class UserController {

    @Autowired
    private UserDao userrDAO;
    
    
    @RequestMapping(value="/create")
    @ResponseBody
    public String create(String username,String email, String password) {

        User user = new User(username, email);
        userrDAO.save(user);

        return "User succesfully saved!";
    }    
    
    
    @RequestMapping(value="/delete")
    @ResponseBody
    public String delete(long id) {
        
    User user = new User(id);
    userrDAO.delete(user);

      return "User succesfully deleted!";
    }
    
    @RequestMapping(value="/get-by-email")
    @ResponseBody
    public String getByEmail(String email) {
        String userId;

        User user = userrDAO.getByEmail(email);
        userId = String.valueOf(user.getId());

        return "The user id is: " + userId;
    }

}
