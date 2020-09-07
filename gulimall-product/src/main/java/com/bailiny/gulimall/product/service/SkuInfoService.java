package com.bailiny.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bailiny.common.utils.PageUtils;
import com.bailiny.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-07 21:47:00
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

