package com.liujinshui.gulimall.order.dao;

import com.liujinshui.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:14:12
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
