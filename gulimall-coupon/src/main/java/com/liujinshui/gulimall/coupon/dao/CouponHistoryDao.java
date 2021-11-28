package com.liujinshui.gulimall.coupon.dao;

import com.liujinshui.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:04:14
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
