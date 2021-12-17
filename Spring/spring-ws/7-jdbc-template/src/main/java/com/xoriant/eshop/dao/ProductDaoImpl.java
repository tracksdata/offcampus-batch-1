package com.xoriant.eshop.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.xoriant.eshop.model.Product;

@Repository
public class ProductDaoImpl {
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public ProductDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	/*
	 * 
	 * 1. single row
	 * 			
	 * 2. multi row
	 * 
	 * 
	 */
	
	// List all Products using  queryForList method
	public void findAllV1() {
		List<Map<String, Object>> products = jdbcTemplate.queryForList("select * from product");
		System.out.println(products);
	}
	
	
	/*
	 * Domain objects
	 * ---------------------
	 * 1. RowMapper
	 * 		-> T mapRow(rs,rowNo)
	 * 
	 * 2. RowCallbackHandler
	 * 		-> void processRow(rs);
	 * 
	 * 2. ResultSetExtractor
	 * 		-> T extractData(rs)
	 * 
	 * 
	 * 
	 */
	
	
	// 1. RowMapper
	// List all Products using  RowMapper interface
	//public List<Product> findAllV2(){
	//	return jdbcTemplate.query("select * from product where id>=?", new RowMapperDemo(),15);
	//å}	
	
	
	// List all Products using  RowMapper interface with lamdas

	public List<Product> findAllV3() {
		return jdbcTemplate.query("select * from product where id>=? and name like ?", (ResultSet rs) -> {
			List<Product> prods = new ArrayList<>();
			while (rs.next()) {
				Product prod = new Product();
				prod.setId(rs.getInt("id"));
				prod.setName(rs.getString("name"));
				prod.setPrice(rs.getDouble("price"));
				prod.setDescription(rs.getString("description"));
				prods.add(prod);
			}
			return prods;
		},15,"%i%");
	}
	
	
}

/*
class  RowMapperDemo implements RowMapper<Product>{
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product prod=new Product();
		
			prod.setId(rs.getInt("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));		
		return prod;
	}
	*/
//}







