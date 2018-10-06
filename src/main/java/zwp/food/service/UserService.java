package zwp.food.service;

import zwp.food.pojo.UserInfo;

/**
 * Created by 大娃娃 on 2018/9/15.
 */
public interface UserService {

    UserInfo selectByPrimaryKey(String userKey);

    int findUser(String userName,String passWord);



}
