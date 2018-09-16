import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import zwp.food.pojo.UserInfo;
import zwp.food.service.UserService;

import javax.annotation.Resource;

/**
 * 〈〉
 *
 * @author 大娃娃
 * @create 2018/9/15
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class test {

    @Resource
    private UserService userService;
    @Test
    public void testUser() {
        UserInfo userInfo = userService.selectByPrimaryKey("1");
        System.out.println(userInfo.getUserName());
    }

}