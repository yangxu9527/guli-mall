package com.bailiny.gulimall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bailiny.common.utils.PageUtils;
import com.bailiny.common.utils.Query;

import com.bailiny.gulimall.member.dao.UmsMemberLevelDao;
import com.bailiny.gulimall.member.entity.UmsMemberLevelEntity;
import com.bailiny.gulimall.member.service.UmsMemberLevelService;


@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevelEntity> implements UmsMemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLevelEntity> page = this.page(
                new Query<UmsMemberLevelEntity>().getPage(params),
                new QueryWrapper<UmsMemberLevelEntity>()
        );

        return new PageUtils(page);
    }

}