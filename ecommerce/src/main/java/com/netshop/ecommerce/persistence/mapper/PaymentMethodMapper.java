package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.PaymentMethodDTO;
import com.netshop.ecommerce.persistence.entity.MedioPago;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "vendedorId", target = "sellerId"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "cbu", target = "cbu")
    })
    PaymentMethodDTO toPaymentMethod(MedioPago medioPago);
    List<PaymentMethodDTO> toPaymentMethods(List<MedioPago> mediosPago);

    @InheritInverseConfiguration
    MedioPago toMedioPago(PaymentMethodDTO paymentMethod);
}
