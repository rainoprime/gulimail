package com.liujinshui.gulimall.member.dao;

import com.liujinshui.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:09:12
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
