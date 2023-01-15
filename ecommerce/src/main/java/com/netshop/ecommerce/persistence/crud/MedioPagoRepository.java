package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.domain.dto.PaymentMethodDTO;
import com.netshop.ecommerce.domain.repository.PaymnetMethodRepository;
import com.netshop.ecommerce.persistence.entity.MedioPago;
import com.netshop.ecommerce.persistence.mapper.PaymentMethodMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MedioPagoRepository implements PaymnetMethodRepository {

    @Autowired
    private MedioPagoCrudRepository medioPagoCrudRepository;

    @Autowired
    private PaymentMethodMapper mapper;

    @Override
    public PaymentMethodDTO save(PaymentMethodDTO paymentMethod) {
        return mapper.toPaymentMethod(medioPagoCrudRepository.save(mapper.toMedioPago(paymentMethod)));
    }

    @Override
    public Optional<List<PaymentMethodDTO>> getBySellerId(Integer id) {
        List<MedioPago> mediosPago = medioPagoCrudRepository.findByVendedorId(id);
        return Optional.of(mapper.toPaymentMethods(mediosPago));
    }
}
