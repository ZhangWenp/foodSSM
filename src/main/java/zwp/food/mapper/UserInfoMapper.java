package zwp.food.mapper;

import org.apache.ibatis.annotations.Param;
import zwp.food.pojo.UserInfo;
import zwp.food.pojo.UserInfoExample;

import java.util.List;


public interface UserInfoMapper {

    /**基本数据类型：包含int,String,Date等。基本数据类型作为传参，只能传入一个。通过#{参数名}获取。
     *复杂数据类型：包含Java实体类、Map。通过#{属性名}或#{map的keyName}获取。
     *方法一：给参数前加 @Param 注解指定其别名
     * 方法二：将多个值存入Map中，输入参数为 Map，用 key 表示其值
     * @param userAccount
     * @param passWord
     * @return
     */
    int findUser(@Param(value="userAccount") String userAccount,@Param(value="passWord") String passWord);




    /*-----------------------------自动生成---------------------------------------------------*/
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(String userKey);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(String userKey);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}