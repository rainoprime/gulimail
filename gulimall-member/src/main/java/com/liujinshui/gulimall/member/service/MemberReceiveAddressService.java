package com.liujinshui.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liujinshui.common.utils.PageUtils;
import com.liujinshui.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author liujinshui
 * @email it@liujinshui.com
 * @date 2021-11-19 22:09:12
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

