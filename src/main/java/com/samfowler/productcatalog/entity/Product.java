package com.samfowler.productcatalog.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

	  private @Id @GeneratedValue Long id;
	  private String name;
	  private String category;
	  private String vendor;
	  private String description;
	  private double price;
	  private String colour;
	  private String size;
	  private String gender;
	  private int quantity;
	  private int reserved;
	  
	  Product(){}
	  
	  public Product(String name, String category, String vendor, String description, double price, String colour, String size, String gender, int quantity, int reserved){
		  this.name = name;
		  this.category = category;
		  this.vendor = vendor;
		  this.description = description;
		  this.price = price;
		  this.colour = colour;
		  this.size = size;
		  this.gender = gender;
		  this.quantity = quantity;
		  this.reserved = reserved;
	  }
	  
	  public Long getId() {
		  return this.id;
	  }
	  public void setId(Long id) {
		  this.id = id;
	  }
	  public String getName() {
		  return this.name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public String getCategory() {
		  return this.category;
	  }
	  public void setCategory(String category) {
		  this.category = category;
	  }
	  public String getVendor() {
		  return this.vendor;
	  }
	  public void setVendor(String vendor) {
		  this.vendor = vendor;
	  }
	  public String getDescription() {
		  return this.description;
	  }
	  public void setDescription(String description) {
		  this.description = description;
	  }
	  public double getPrice() {
		  return this.price;
	  }
	  public void setPrice(double price) {
		  this.price = price;
	  }
	  public String getColour() {
		  return this.colour;
	  }
	  public void setColour(String colour) {
		  this.colour = colour;
	  }	  
	  public String getSize() {
		  return this.size;
	  }
	  public void setSize(String size) {
		  this.size = size;
	  }	  	  
	  public String getGender() {
		  return this.gender;
	  }
	  public void setGender(String gender) {
		  this.gender = gender;
	  }	
	  public int getQuantity() {
		  return this.quantity;
	  }
	  public void setQuantity(int quantity) {
		  this.quantity = quantity;
	  }
	  public int getReserved() {
		  return this.reserved;
	  }
	  public void setReserved(int reserved) {
		  this.reserved = reserved;
	  }	
	  
	  @Override
	  public int hashCode() {
	    return Objects.hash(this.name, this.category, this.vendor, this.description, this.price, this.colour, this.size, this.gender, this.quantity, this.reserved);
	  }

	  @Override
	  public String toString() {
		  return "Location{"
		  		+ "id="+this.id+", "
		  		+ "name="+this.name+", "
		  		+ "category="+this.category+", "
		  		+ "vendor="+this.vendor+", "
		  		+ "description="+this.description+", "
		  		+ "price="+this.price+""
		  		+ "colour="+this.colour+""
		  		+ "size="+this.size+""
		  		+ "gender="+this.gender+""
		  		+ "quantity="+this.quantity+""
		  		+ "reserved="+this.reserved+""
		  		+ "}";		  
	  }
}

