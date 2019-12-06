package controller;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.User;
import service.UserDao;
import tool.Tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;

    @RequestMapping("/login.action")
    @ResponseBody
    public User login(@RequestBody User user) {
        //@RequestBody是作用在形参列表上，用于将前台发送过来固定格式的数据【xml 格式或者 json等】封装为对应的 JavaBean 对象
        HttpSession session = request.getSession();
        User loginUser = userDao.login(user);
        if (loginUser != null){
            session.setAttribute("user",loginUser);
            return loginUser;
        }else{
           return null;
        }
    }

    @RequestMapping("/userList.action")
    @ResponseBody       //加上 @ResponseBody 后，会直接返回 json 数据
    public Map<String, Object> userList(int page, int limit) {
//        HashMap<String, Object> map = new HashMap<>();
//        int pagestart = (page - 1) * limit;
//        map.put("pagestart", pagestart);
//        map.put("size", limit);
//        map.put("loginName", user.getLoginName());//查询条件
        List<User> userList = userDao.getUserList();
        Integer pagecount = userDao.userCount();
        Map<String, Object> returnTable = Tool.testLayui(userList, page, limit);
        returnTable.put("count", pagecount);
        return returnTable;
    }
}
