package com.mahendra.Ecom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {
}
