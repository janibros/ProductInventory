package com.company.product.model;

import java.time.LocalDateTime;
import com.company.category.model.Category;
import com.company.inventory.model.Inventory;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @OneToOne(mappedBy = "product")
   private Category category;

   @Column(name = "grade")
   private String grade;

   @Column(name = "manufacturer")
   private String manufacturer;

   @Column(name = "name")
   private String name;

   @ManyToOne
   @JoinColumn(name = "inventory_id")
   private Inventory inventory;

   @Column(name = "description")
   private String description;

   @Column(name = "create_time")
   private LocalDateTime createTime;

   @Column(name = "update_time")
   private LocalDateTime updateTime;

   @Column(name = "updated_by")
   private int updatedBy;

   @Column(name = "has_accessories")
   private boolean hasAccessories;

   public Product() {
      // Default constructor required by JPA
   }

   public Product(int id, Category category, String grade, String manufacturer, String name, String description,
                  LocalDateTime createTime, LocalDateTime updateTime, int updatedBy, boolean hasAccessories,Inventory inventory) {
      this.id = id;
      this.category = category;
      this.grade = grade;
      this.manufacturer = manufacturer;
      this.name = name;
      this.description = description;
      this.createTime = createTime;
      this.updateTime = updateTime;
      this.updatedBy = updatedBy;
      this.hasAccessories = hasAccessories;
      this.inventory = inventory;
   }

   public int getId() {
      return id;
   }

   public void setId(final int theId) {
      id = theId;
   }

   public Category getCategory() {
      return category;
   }

   public void setCategory(final Category theCategory) {
      category = theCategory;
   }

   public String getGrade() {
      return grade;
   }

   public void setGrade(final String theGrade) {
      grade = theGrade;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public void setManufacturer(final String theManufacturer) {
      manufacturer = theManufacturer;
   }

   public String getName() {
      return name;
   }

   public void setName(final String theName) {
      name = theName;
   }

   public Inventory getInventory() {
      return inventory;
   }

   public void setInventory(final Inventory theInventory) {
      inventory = theInventory;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(final String theDescription) {
      description = theDescription;
   }

   public LocalDateTime getCreateTime() {
      return createTime;
   }

   public void setCreateTime(final LocalDateTime theCreateTime) {
      createTime = theCreateTime;
   }

   public LocalDateTime getUpdateTime() {
      return updateTime;
   }

   public void setUpdateTime(final LocalDateTime theUpdateTime) {
      updateTime = theUpdateTime;
   }

   public int getUpdatedBy() {
      return updatedBy;
   }

   public void setUpdatedBy(final int theUpdatedBy) {
      updatedBy = theUpdatedBy;
   }

   public boolean isHasAccessories() {
      return hasAccessories;
   }

   public void setHasAccessories(final boolean theHasAccessories) {
      hasAccessories = theHasAccessories;
   }
}

