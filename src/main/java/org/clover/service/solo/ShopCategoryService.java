package org.clover.service.solo;

import org.clover.entity.bo.ShopCategory;
import org.clover.entity.dto.Result;

import java.util.List;

public interface ShopCategoryService {
    Result<Boolean> addShopCategory(ShopCategory ShopCategory);
    Result<Boolean> removeShopCategory(String id);
    Result<Boolean> modifyShopCategory(ShopCategory ShopCategory);
    Result<ShopCategory> queryShopCategoryById(String id);
    Result<List<ShopCategory>> queryShopCategory(ShopCategory ShopCategoryCondition, int pageIndex, int pageSize);
}
