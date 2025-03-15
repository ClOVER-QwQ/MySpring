package org.clover.service.combine.impl;

import org.clover.entity.bo.HeadLine;
import org.clover.entity.bo.ShopCategory;
import org.clover.entity.dto.MainPageInfo;
import org.clover.entity.dto.Result;
import org.clover.service.combine.HeadLineAndShopCategoryService;
import org.clover.service.solo.HeadLineService;
import org.clover.service.solo.ShopCategoryService;
import org.clover.service.solo.impl.HeadLineServiceImpl;
import org.clover.service.solo.impl.ShopCategoryServiceImpl;

import java.util.List;

public class HeadLineAndShopCategoryServiceImpl implements HeadLineAndShopCategoryService {
    private HeadLineService headLineService;
    private ShopCategoryService shopCategoryService;
    @Override
    public Result<MainPageInfo> getMainPageInfo() {
        HeadLine headLine = new HeadLine();
        headLine.setEnableStatus(1);
        Result<List<HeadLine>> headLineResult = headLineService.queryHeadLine(headLine,1,4);
        ShopCategory shopCategory = new ShopCategory();
        Result<List<ShopCategory>> shopCategoryResult = shopCategoryService.queryShopCategory(shopCategory,1,100);
        return mergeMainPageInfo(headLineResult,shopCategoryResult);
    }

    private Result<MainPageInfo> mergeMainPageInfo(Result<List<HeadLine>> headLineResult,Result<List<ShopCategory>> shopCategoryResult) {
        return null;
    }
}
