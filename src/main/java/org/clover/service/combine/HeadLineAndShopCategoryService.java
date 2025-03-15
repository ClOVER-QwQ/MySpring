package org.clover.service.combine;

import org.clover.entity.dto.MainPageInfo;
import org.clover.entity.dto.Result;

public interface HeadLineAndShopCategoryService {
    Result<MainPageInfo> getMainPageInfo();
}
