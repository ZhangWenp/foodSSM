package zwp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import zwp.food.service.UserService;

/**
 * 〈登录注册〉
 *
 * @author 大娃娃
 * @create 2018/9/16
 * @since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    /**
     * 用户登录方法
     */
    @RequestMapping("/login/{userAccount}/{passWord}")
    public String loginUser(@PathVariable String userAccount,@PathVariable String passWord) {
        int n = userService.findUser(userAccount,passWord);
        if(n==1) {
            return "index";
        }else {
            return "/error.html";
        }
    }

}