package com.bailiny.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bailiny.common.utils.PageUtils;
import com.bailiny.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-07 21:47:00
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

