package com.company.product.service;

import java.util.List;
import com.company.category.model.Category;
import com.company.product.dao.ProductRepository;
import com.company.product.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

   private final ProductRepository productRepository;

   public ProductService(final ProductRepository theProductRepository) {productRepository = theProductRepository;}

   public Product saveProduct(Product product) {
      return productRepository.save(product);
   }


   public  List<Product> findAllProduct(){
    return   productRepository.findAll();
   }

   public Product getById(int id){
      return productRepository.getReferenceById(id);
   }

   public void delete(Product product){
       productRepository.delete(product);
   }

   public List<Product> getByCategory(Category Category){
   List<Product> listOfProducts=   productRepository.findByCategory(Category);
   return listOfProducts;
   }

   public void deactivateProduct(int id){
      productRepository.delete();
   }

}
