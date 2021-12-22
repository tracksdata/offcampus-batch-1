package com.xoriant.ecart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.ecart.dao.ProductDao;
import com.xoriant.ecart.model.Product;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public void save(Product product) {
		prodDao.save(product);

	}

	@Override
	public void update(Product product) {
		prodDao.update(product);

	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Override
	public void delete(int id) {
		prodDao.delete(id);
	}

}
