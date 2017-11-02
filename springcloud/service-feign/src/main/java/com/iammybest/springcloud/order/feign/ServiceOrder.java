package com.iammybest.springcloud.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 服务消费方
 */
//指定 服务  value
@FeignClient(value = "service-order",fallback = ServiceOrderHystric.class)
public interface ServiceOrder {
    @RequestMapping(value = "/api/order/create", method = RequestMethod.GET)
    String createOrder(@RequestParam(value = "name") String name,@RequestParam(value = "productId") String productId);

    @RequestMapping(value = "/api/pay/order", method = RequestMethod.GET)
    String payOrder(@RequestParam(value = "name") String name, @RequestParam(value = "orderId") String orderId);
}
