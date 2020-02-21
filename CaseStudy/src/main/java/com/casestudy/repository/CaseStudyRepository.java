package com.casestudy.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.casestudy.model.Product;
import com.casestudy.repository.querybuilder.QueryBuilder;
import com.casestudy.repository.rowmapper.ColumnsRowMapper;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class CaseStudyRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ColumnsRowMapper columnsRowMapper;

	public Object searchBrand() {

		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_BRAND, new Object[] {}, columnsRowMapper);
		return products;
	}

	public Object searchPrice() {
		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_PRICE, new Object[] {}, columnsRowMapper);
		return products;
	}

	public Object searchColor() {
		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_COLOR, new Object[] {}, columnsRowMapper);
		return products;
	}

	public Object searchSize() {
		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_SIZE, new Object[] {}, columnsRowMapper);
		return products;
	}

	public Object searchSku() {
		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_SKU, new Object[] {}, columnsRowMapper);
		return products;
	}

	public Object searchAvailproductbyseller() {
		List<Object> products = jdbcTemplate.query(QueryBuilder.SELECT_SELLER, new Object[] {}, columnsRowMapper);
		return products;
	}

}
