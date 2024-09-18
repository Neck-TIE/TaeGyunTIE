package com.tie.practical_testing.spring.api.controller.order;

import com.tie.practical_testing.spring.api.ApiResponse;
import com.tie.practical_testing.spring.api.controller.order.request.OrderCreateRequest;
import com.tie.practical_testing.spring.api.service.order.OrderService;
import com.tie.practical_testing.spring.api.service.order.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/api/v1/orders/new")
    public ApiResponse<OrderResponse> createOrder(@Validated @RequestBody OrderCreateRequest request) {
        LocalDateTime registeredDateTime = LocalDateTime.now();
        OrderResponse response = orderService.createOrder(request.toServiceRequest(), registeredDateTime);
        return ApiResponse.ok(response);
    }

}