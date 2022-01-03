package com.xoriant.ecart.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.ecart.entities.Brand;
import com.xoriant.ecart.entities.Product;
import com.xoriant.ecart.service.BrandService;
import com.xoriant.ecart.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductResource {
	
	/*
	 * requirements
	 * -------------------
	 * 1. List all Products : Yes
	 * 2. List all products by Brand Title :Yes
	 * 3. List all brands : yes
	 * 4. List all categories : yes
	 * 5. List all products by category name : Yes
	 * 6. List all products with in given price start and end range : yes
	 * 7. List all products above given price range : yes
	 * 8. List all orders of a given user id : yes
	 * 9. save new product
	 * 10. update existing product
	 * 11. delete product by product id
	 * 12. find product by product id
	 * 13. find all products by product name
	 * 14. find all products by keywords
	 * 15. find all brands of a given category name
	 * 16. save more than one product object at a time
	 * 17. sort all products by highest price range
	 * 18. sort all products by lowest price range
	 * 
	 * -----------------------------------------------
	 */
	
	
	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductService productService;
	
	// find all brands
	@GetMapping("/brands")
	public List<Brand> findAllBrands(){
		return brandService.findAllBrands();
	}
	// find single brand using brand id
	@GetMapping("/brands/{brandId}")
	public Brand findByBrandId(@PathVariable int brandId) {
		return brandService.findBrandById(brandId);
	}
	// find all brands by brand name
	@GetMapping("/filter/brands/{brandName}")
	public List<Brand> findByBrandName(@PathVariable String brandName){
		return brandService.findByBrandName(brandName);
	}
	
	// list all products
	@GetMapping
	public List<Product> findAll(){
		return productService.findAllProducts();
	}
	
	//List all products by category title
	@GetMapping("/filter/category/{title}")
	public List<Product> findByCategory_CatTitleEquals(@PathVariable String title){
		return productService.findByCategory_CatTitleEquals(title);
	}
	
	//List all products by price greater than
	@GetMapping("/filter/price/{price}")
	public List<Product> findByProductPriceGreaterThanEqual(@PathVariable double price){
		return productService.findByProductPriceGreaterThanEqual(price);
	}
	
	//List all products by price range
	@GetMapping("/filter/pricerange/{start}/{end}")
	public 	List<Product> findByProductPriceBetween(@PathVariable double start,@PathVariable double end){
		return productService.findByProductPriceBetween(start, end);
	}
	
	//List all products by product name
	@GetMapping("/filter/title/{productTitle}")
	public List<Product> findByProductTitleLike(@PathVariable String productTitle){
		return productService.findByProductTitleLike("%"+productTitle+"%");
	}


	//List all products by Brand Name
	@GetMapping("/filter/brandtitle/{brandTitle}")
	public List<Product> findByBrand_BrandTitleEquals(@PathVariable String brandTitle){
		return productService.findByBrand_BrandTitleEquals(brandTitle);
	}

	// List all products by product keywords
	@GetMapping("/filter/keywords/{keywords}")
	public List<Product> findByProductKeywordsLike(@PathVariable String keywords){
		return productService.findByProductKeywordsLike("%"+keywords+"%");
	}
	
	// find product by id
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return productService.findById(id);
	}
	
	// save Product
	@PostMapping
	public Product save(@RequestBody Product product) {
		return productService.save(product);
	}
	
	// delete product By ID
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable int id) {
		productService.deleteById(id);
		return new ResponseEntity<>("Product ID "+id+" deleted",HttpStatus.OK);
	}
	
	// Delete Product by Product object
	@DeleteMapping
	public ResponseEntity<?> deleteProduct(@RequestBody Product product){
		productService.deleteProduct(product);
		return new ResponseEntity<>("Product ID "+product.getProductId()+" deleted",HttpStatus.OK);
	}
	
	//update Product
	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.save(product);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	

}
