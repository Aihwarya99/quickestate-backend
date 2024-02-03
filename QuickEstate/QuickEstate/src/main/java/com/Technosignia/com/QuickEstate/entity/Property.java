package com.Technosignia.com.QuickEstate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Property {
@Id
Long id;
String name;
@ManyToOne
Owner owner;
String type;
Double sellingPrice;
Double rentingPrice;
String propertyage;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Owner getOwner() {
	return owner;
}
public void setOwner(Owner owner) {
	this.owner = owner;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Double getSellingPrice() {
	return sellingPrice;
}
public void setSellingPrice(Double sellingPrice) {
	this.sellingPrice = sellingPrice;
}
public Double getRentingPrice() {
	return rentingPrice;
}
public void setRentingPrice(Double rentingPrice) {
	this.rentingPrice = rentingPrice;
}
public String getPropertyage() {
	return propertyage;
}
public void setPropertyage(String propertyage) {
	this.propertyage = propertyage;
}

}
