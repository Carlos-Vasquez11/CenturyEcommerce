package com.netshop.ecommerce.domain.repository;

import com.netshop.ecommerce.domain.dto.PaymentMethodDTO;

import java.util.List;
import java.util.Optional;

public interface PaymnetMethodRepository {

    PaymentMethodDTO save(PaymentMethodDTO paymentMethod);

    Optional<List<PaymentMethodDTO>> getBySellerId(Integer id);
}
