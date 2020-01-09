package top.zhoulis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhoulis.dao.UserRepository;
import top.zhoulis.pojo.User;
import top.zhoulis.service.UserService;
import top.zhoulis.util.MD5Utils;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/25
 * @Version V1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
