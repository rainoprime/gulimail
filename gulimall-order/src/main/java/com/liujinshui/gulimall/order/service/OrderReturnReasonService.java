package com.liujinshui.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujinshui.common.utils.PageUtils;
import com.liujinshui.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:14:13
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

