package com.empresa.Hito_2_3T_Programacion.Repository;

import com.empresa.Hito_2_3T_Programacion.Entities.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, Long> {

}
