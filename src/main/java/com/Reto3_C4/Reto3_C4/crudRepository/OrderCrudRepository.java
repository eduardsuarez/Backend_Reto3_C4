/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Reto3_C4.Reto3_C4.crudRepository;

import com.Reto3_C4.Reto3_C4.entity.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author eduardsuarez21
 */
public interface OrderCrudRepository  extends MongoRepository<Order, Integer>{
    @Query("{'salesMan.zone' : ?0}")
    List<Order> findByZone(String zone);
    
    //Para seleccionar la orden con el id maximo
    Optional<Order> findTopByOrderByIdDesc();
}
