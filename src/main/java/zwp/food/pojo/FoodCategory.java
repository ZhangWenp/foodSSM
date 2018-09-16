package zwp.food.pojo;

import java.util.Date;

public class FoodCategory {
    private String foodCategoryKey;

    private String categoryName;

    private Date createTime;

    private Date modifiTime;

    public String getFoodCategoryKey() {
        return foodCategoryKey;
    }

    public void setFoodCategoryKey(String foodCategoryKey) {
        this.foodCategoryKey = foodCategoryKey == null ? null : foodCategoryKey.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiTime() {
        return modifiTime;
    }

    public void setModifiTime(Date modifiTime) {
        this.modifiTime = modifiTime;
    }
}