package com.company.inventory.controller;

import java.util.List;
import com.company.inventory.service.InventoryService;
import com.company.product.model.Product;
import com.company.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class InventoryController {

   @Autowired
private InventoryService inventoryService;

   @Autowired
   private ProductService productService;


@PostMapping("/product/{inventoryId}")
public void saveProduct(@PathVariable("inventoryId") long inventoryId, @RequestBody Product product){
 List<Product> productList = inventoryService.getByInventoryId(inventoryId);
 productList.add(product);
}


   @DeleteMapping("/product/{id}")
   public void deactivateProduct(@PathVariable("id") Long id){
      Product aProduct =   productService.getById(id.intValue());
      inventoryService.deleteProductByInventory(id,aProduct);
   }

}
