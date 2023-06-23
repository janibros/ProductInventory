package com.company.product.dao;

import java.util.List;
import java.util.Optional;
import com.company.category.model.Category;
import com.company.inventory.model.Inventory;
import com.company.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

   List<Product> findByInventory(Inventory inventory);


   List<Product> findByCategory(Category category);

}
