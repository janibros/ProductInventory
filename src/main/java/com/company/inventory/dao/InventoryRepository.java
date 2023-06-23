package com.company.inventory.dao;

import java.util.List;
import com.company.inventory.model.Inventory;
import com.company.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

   void addProductToInventory(Product product, Inventory inventory);

   List<Product> findProductByInventoryId(Long inventoryId);
}
