package com.bailiny.gulimall.coupon.dao;

import com.bailiny.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-08 23:33:52
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
