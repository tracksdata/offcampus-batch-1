package com.xoriant.ecart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xoriant.ecart.dao.BrandDao;
import com.xoriant.ecart.entities.Brand;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDao brandDao;

	// find all brands
	@Override
	public List<Brand> findAllBrands() {
		return brandDao.findAll();
	}

	// find by brand id
    @Override
	public Brand findBrandById(int brandId) {
		Brand brand=brandDao.findById(brandId).orElse(null);
		return brand;
	}

	// find all brands by brand name
	@Override
	public List<Brand> findByBrandName(String brandName) {
		return brandDao.findByBrandTitleLike("%"+brandName+"%");
	}
}
