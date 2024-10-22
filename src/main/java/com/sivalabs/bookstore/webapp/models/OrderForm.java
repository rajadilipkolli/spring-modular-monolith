package com.sivalabs.bookstore.webapp.models;

import com.sivalabs.bookstore.orders.domain.models.Customer;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;

public record OrderForm(@Valid Customer customer, @NotEmpty String deliveryAddress) {}