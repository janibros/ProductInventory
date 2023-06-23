package com.company.category.model;

import com.company.product.model.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;

   private String name;
   private String description;

   @OneToOne(mappedBy = "category")
   private Product product;

   public Category() {
   }

   public Category(String name, String description, Product product) {
      this.name = name;
      this.description = description;
      this.product =  product;
   }

   // Getters and Setters

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Product getProduct() {
      return product;
   }

   public void setProduct(final Product theProduct) {
      product = theProduct;
   }
}
