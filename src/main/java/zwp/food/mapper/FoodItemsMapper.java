package zwp.food.mapper;

import org.apache.ibatis.annotations.Param;
import zwp.food.pojo.FoodItems;
import zwp.food.pojo.FoodItemsExample;

import java.util.List;

public interface FoodItemsMapper {
    int countByExample(FoodItemsExample example);

    int deleteByExample(FoodItemsExample example);

    int deleteByPrimaryKey(String foodId);

    int insert(FoodItems record);

    int insertSelective(FoodItems record);

    List<FoodItems> selectByExample(FoodItemsExample example);

    FoodItems selectByPrimaryKey(String foodId);

    int updateByExampleSelective(@Param("record") FoodItems record, @Param("example") FoodItemsExample example);

    int updateByExample(@Param("record") FoodItems record, @Param("example") FoodItemsExample example);

    int updateByPrimaryKeySelective(FoodItems record);

    int updateByPrimaryKey(FoodItems record);
}