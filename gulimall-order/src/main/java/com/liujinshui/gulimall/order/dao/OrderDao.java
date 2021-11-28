package com.liujinshui.gulimall.order.dao;

import com.liujinshui.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:14:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
