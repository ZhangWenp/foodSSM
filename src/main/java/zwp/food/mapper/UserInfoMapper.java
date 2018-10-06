package zwp.food.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zwp.food.pojo.UserInfo;
import zwp.food.pojo.UserInfoExample;

import java.util.List;

@Repository
public interface UserInfoMapper {

    int findUser(String userName,String passWord);




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