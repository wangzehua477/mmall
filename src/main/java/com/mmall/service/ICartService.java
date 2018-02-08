package com.mmall.service;

import com.mmall.commom.ServerResponse;
import com.mmall.vo.CartVo;

public interface ICartService {

    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
}
