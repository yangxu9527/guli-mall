package com.bailiny.gulimall.member.dao;

import com.bailiny.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yangxu
 * @email yangxu9527@foxmail.com
 * @date 2020-09-08 23:18:46
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
