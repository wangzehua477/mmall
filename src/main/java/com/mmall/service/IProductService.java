package com.mmall.service;

import com.mmall.commom.ServerResponse;
import com.mmall.pojo.Product;

public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);
}
