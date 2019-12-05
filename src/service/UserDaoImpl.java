package service;

import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
@Service
public class UserDaoImpl implements UserDao {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
