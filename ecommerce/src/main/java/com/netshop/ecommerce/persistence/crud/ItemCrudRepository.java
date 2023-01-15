package com.netshop.ecommerce.persistence.crud;

import com.netshop.ecommerce.persistence.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemCrudRepository extends JpaRepository<Item,Integer> {

    List<Item> findByCompraId(Integer id);
}
