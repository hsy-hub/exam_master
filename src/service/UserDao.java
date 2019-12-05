package service;

import pojo.User;

import java.util.List;

public interface UserDao {
    User login(User user);
    List<User> getUserList();
    Integer userCount();
}
