package zwp.food.mapper;

import org.apache.ibatis.annotations.Param;
import zwp.food.pojo.FoodCategory;
import zwp.food.pojo.FoodCategoryExample;

import java.util.List;

public interface FoodCategoryMapper {
    int countByExample(FoodCategoryExample example);

    int deleteByExample(FoodCategoryExample example);

    int deleteByPrimaryKey(String foodCategoryKey);

    int insert(FoodCategory record);

    int insertSelective(FoodCategory record);

    List<FoodCategory> selectByExample(FoodCategoryExample example);

    FoodCategory selectByPrimaryKey(String foodCategoryKey);

    int updateByExampleSelective(@Param("record") FoodCategory record, @Param("example") FoodCategoryExample example);

    int updateByExample(@Param("record") FoodCategory record, @Param("example") FoodCategoryExample example);

    int updateByPrimaryKeySelective(FoodCategory record);

    int updateByPrimaryKey(FoodCategory record);
}