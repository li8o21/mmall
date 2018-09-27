package com.mmall.service;

import com.mmall.common.ServerResponse;

import java.util.List;

public interface ICategoryService {

    ServerResponse addCatagory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询当前节点的id和递归子节点的id
     * @param categoryId
     * @return
     */
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
