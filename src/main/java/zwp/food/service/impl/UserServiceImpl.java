package zwp.food.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zwp.food.mapper.UserInfoMapper;
import zwp.food.pojo.UserInfo;
import zwp.food.service.UserService;

/**
 * 〈用户实现〉
 *
 * @author 大娃娃
 * @create 2018/9/15
 * @since 1.0.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public UserInfo selectByPrimaryKey(String userKey) {
        UserInfo userInfo =  userInfoMapper.selectByPrimaryKey("1");
        return userInfo;
    }

    @Override
    public int findUser(String userName, String passWord) {
        int count = userInfoMapper.findUser(userName,passWord);
        return count;
    }
}