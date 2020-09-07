package com.bailiny.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bailiny.common.utils.PageUtils;
import com.bailiny.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-07 21:47:01
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

