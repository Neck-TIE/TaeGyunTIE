package com.tie.practical_testing.spring.domain.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    INIT("주문생성"),
    CANCELED("주문취소"),
    PAYMENT_COMPETED("결제완료"),
    PAYMENT_FAILED("결제실패"),
    RECEIVED("주문접수"),
    COMPLETED("처리완료");

    private final String text;

}