package com.liujinshui.gulimall.product.dao;

import com.liujinshui.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 21:41:47
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
