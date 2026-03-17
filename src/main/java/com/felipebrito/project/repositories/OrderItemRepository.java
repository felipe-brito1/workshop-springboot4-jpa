package com.felipebrito.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipebrito.project.entities.OrderItem;
import com.felipebrito.project.entities.pk.OrderItemPK;


@Repository	
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
