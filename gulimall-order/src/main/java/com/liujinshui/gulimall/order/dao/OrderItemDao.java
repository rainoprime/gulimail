package com.liujinshui.gulimall.order.dao;

import com.liujinshui.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:14:13
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
