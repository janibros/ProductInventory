package com.company.inventory.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import com.company.product.model.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "sku")
   private String sku;

   @Column(name = "warehouse")
   private String warehouse;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventory")
   private List<Product> products;

   @Column(name = "cost_price")
   private double costPrice;

   @Column(name = "list_price")
   private double listPrice;

   @Column(name = "last_sold_price")
   private double lastSoldPrice;

   @Column(name = "suggested_price")
   private BigDecimal suggestedPrice;

   @Column(name = "quantity_available")
   private int quantityAvailable;

   @Column(name = "quantity_sold")
   private int quantitySold;

   @Column(name = "added_by")
   private int addedBy;

   @Column(name = "updated_by")
   private int updatedBy;

   @Column(name = "added_date")
   private LocalDateTime addedDate;

   @Column(name = "updated_date")
   private LocalDateTime updatedDate;

   public Inventory() {
      // Default constructor required by JPA
   }

   public Inventory(Long id, String sku, String warehouse,  List<Product> products, double costPrice, double listPrice,
                    double lastSoldPrice, BigDecimal suggestedPrice, int quantityAvailable, int quantitySold,
                    int addedBy, int updatedBy, LocalDateTime addedDate, LocalDateTime updatedDate) {
      this.id = id;
      this.sku = sku;
      this.warehouse = warehouse;
      this.products = products;
      this.costPrice = costPrice;
      this.listPrice = listPrice;
      this.lastSoldPrice = lastSoldPrice;
      this.suggestedPrice = suggestedPrice;
      this.quantityAvailable = quantityAvailable;
      this.quantitySold = quantitySold;
      this.addedBy = addedBy;
      this.updatedBy = updatedBy;
      this.addedDate = addedDate;
      this.updatedDate = updatedDate;
   }

   public Long getId() {
      return id;
   }

   public void setId(final Long theId) {
      id = theId;
   }

   public String getSku() {
      return sku;
   }

   public void setSku(final String theSku) {
      sku = theSku;
   }

   public String getWarehouse() {
      return warehouse;
   }

   public void setWarehouse(final String theWarehouse) {
      warehouse = theWarehouse;
   }

   public List<Product> getProducts() {
      return products;
   }

   public void setProducts(final List<Product> theProducts) {
      products = theProducts;
   }

   public double getCostPrice() {
      return costPrice;
   }

   public void setCostPrice(final double theCostPrice) {
      costPrice = theCostPrice;
   }

   public double getListPrice() {
      return listPrice;
   }

   public void setListPrice(final double theListPrice) {
      listPrice = theListPrice;
   }

   public double getLastSoldPrice() {
      return lastSoldPrice;
   }

   public void setLastSoldPrice(final double theLastSoldPrice) {
      lastSoldPrice = theLastSoldPrice;
   }

   public BigDecimal getSuggestedPrice() {
      return suggestedPrice;
   }

   public void setSuggestedPrice(final BigDecimal theSuggestedPrice) {
      suggestedPrice = theSuggestedPrice;
   }

   public int getQuantityAvailable() {
      return quantityAvailable;
   }

   public void setQuantityAvailable(final int theQuantityAvailable) {
      quantityAvailable = theQuantityAvailable;
   }

   public int getQuantitySold() {
      return quantitySold;
   }

   public void setQuantitySold(final int theQuantitySold) {
      quantitySold = theQuantitySold;
   }

   public int getAddedBy() {
      return addedBy;
   }

   public void setAddedBy(final int theAddedBy) {
      addedBy = theAddedBy;
   }

   public int getUpdatedBy() {
      return updatedBy;
   }

   public void setUpdatedBy(final int theUpdatedBy) {
      updatedBy = theUpdatedBy;
   }

   public LocalDateTime getAddedDate() {
      return addedDate;
   }

   public void setAddedDate(final LocalDateTime theAddedDate) {
      addedDate = theAddedDate;
   }

   public LocalDateTime getUpdatedDate() {
      return updatedDate;
   }

   public void setUpdatedDate(final LocalDateTime theUpdatedDate) {
      updatedDate = theUpdatedDate;
   }
}
