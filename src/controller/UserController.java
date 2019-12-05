package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login.action")
    @ResponseBody
    public User login(@RequestBody User user) {
        HttpSession session = request.getSession();
        User loginUser = userDao.login(user);
        if (loginUser != null){
            session.setAttribute("user",loginUser);
            return loginUser;
        }else{
           return null;
        }
    }

}
