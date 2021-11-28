package com.liujinshui.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujinshui.common.utils.PageUtils;
import com.liujinshui.gulimall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:04:15
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

