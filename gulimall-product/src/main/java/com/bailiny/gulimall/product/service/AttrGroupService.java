package com.bailiny.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bailiny.common.utils.PageUtils;
import com.bailiny.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-07 21:47:01
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

