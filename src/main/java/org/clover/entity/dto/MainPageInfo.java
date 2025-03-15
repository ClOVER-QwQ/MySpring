package org.clover.entity.dto;

import lombok.Data;
import org.clover.entity.bo.HeadLine;
import org.clover.entity.bo.ShopCategory;

import java.util.List;

@Data
public class MainPageInfo {
    private List<HeadLine> headLines;
    private List<ShopCategory> shopCategories;
}
