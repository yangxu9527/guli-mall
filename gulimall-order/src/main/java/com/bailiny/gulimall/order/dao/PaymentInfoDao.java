package com.bailiny.gulimall.order.dao;

import com.bailiny.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-08 23:15:03
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
