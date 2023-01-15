package com.netshop.ecommerce.persistence.mapper;

import com.netshop.ecommerce.domain.dto.UserDTO;
import com.netshop.ecommerce.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "correo",target = "email"),
            @Mapping(source = "contraseña",target = "password")
    })
    UserDTO toUser(Usuario usuario);

    @InheritInverseConfiguration
    Usuario toUsuario(UserDTO user);
}
