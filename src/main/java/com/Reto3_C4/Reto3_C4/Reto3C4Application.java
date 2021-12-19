package com.Reto3_C4.Reto3_C4;

import com.Reto3_C4.Reto3_C4.crudRepository.OrderCrudRepository;
import com.Reto3_C4.Reto3_C4.crudRepository.SupplementCrudRepository;
import com.Reto3_C4.Reto3_C4.crudRepository.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto3C4Application implements CommandLineRunner {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private SupplementCrudRepository supplementCrudRepository;

    @Autowired
    private OrderCrudRepository orderCrudRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(Reto3C4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userCrudRepository.deleteAll();
        supplementCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();

    }

}

