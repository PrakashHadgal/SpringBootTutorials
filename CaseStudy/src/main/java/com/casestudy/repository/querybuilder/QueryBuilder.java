package com.casestudy.repository.querybuilder;

import org.springframework.stereotype.Component;

@Component
public class QueryBuilder {

	public static final String SELECT_BRAND = "select Max(productname) as productname, brand from products group by brand";
	public static final String SELECT_SIZE = "select Max(productname) as productname, size from products group by size";
	public static final String SELECT_COLOR = "select Max(productname) as productname, color  from products group by color";
	public static final String SELECT_SKU = "select Max(productname) as productname, sku  from products group by sku";
	public static final String SELECT_PRICE = "select Max(productname) as productname, price  from products group by price";
	public static final String SELECT_SELLER = "select Max(productname) as productname, availproductseller from products group by availproductseller";

}
