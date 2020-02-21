package com.casestudy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {

	private Integer producttId;
	private String productname;
	private Integer size;
	private String brand;
	private Integer price;
	private String color;
	private Integer sku;
	private Integer availproductseller;
	private Integer catId;
}