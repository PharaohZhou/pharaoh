package top.zhoulis.service;

import org.springframework.stereotype.Service;
import top.zhoulis.pojo.User;

/**
 * @ClassName UserService
 * @Description: TODO
 * @Author zhou
 * @Date 2019/12/25
 * @Version V1.0
 **/

public interface UserService {
    User checkUser(String username, String password);
}
