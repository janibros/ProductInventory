package com.company.inventory.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import com.company.inventory.dao.InventoryRepository;
import com.company.inventory.model.Inventory;
import com.company.product.model.Product;

public class InventoryService {


   private final InventoryRepository inventoryRepository;

   public InventoryService(final InventoryRepository theInventoryRepository) {inventoryRepository = theInventoryRepository;}

   public void addProductToInventory(Inventory theInventory, List<Product> theProduct){
      theInventory.setProducts(theProduct);
      inventoryRepository.save(theInventory);
   }

   public List<Product> getByInventoryId(Long inventoryId){
     return inventoryRepository.findProductByInventoryId(inventoryId);
   }

  public void deleteProductByInventory(Long inventoryId,Product productToRemove){
     Optional<Inventory> aInventory    = inventoryRepository.findById(inventoryId.intValue());
    List<Product>        listOfProduct =  inventoryRepository.findProductByInventoryId(inventoryId);
     List<Product> listAfterRemovedProduct=  listOfProduct.stream().filter(product -> !product.equals(productToRemove)).collect(Collectors.toList());
     aInventory.get().setProducts(listAfterRemovedProduct);

  }
}
