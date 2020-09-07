package com.bailiny.gulimall.product.dao;

import com.bailiny.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-07 21:47:01
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
