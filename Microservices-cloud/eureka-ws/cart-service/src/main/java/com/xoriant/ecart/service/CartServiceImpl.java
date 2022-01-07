package com.xoriant.ecart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.xoriant.ecart.dao.CartDao;
import com.xoriant.ecart.entity.Cart;
import com.xoriant.ecart.model.Product;


@Service
@EnableFeignClients
public class CartServiceImpl{
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private ProductServiceProxy productProxy;
	@Autowired
	private PriceServiceProxy priceproxy;

	public Cart save(Cart cart) {

		
		Product product = productProxy.findProduct(cart.getpId());
		System.out.println(">>>> Product:: "+product);
		
		if(product!=null && product.getProductQty()>=cart.getQty()) {	
			    System.out.println(">>>> SAVED <<<<<");
				cartDao.save(cart);
				return cart;
		}
		
		return null;
		
	}
	
	
	public List<Cart> findAll(int userId){
		
		List<Cart> cartItems=cartDao.findAll().stream().filter(cart->cart.getUserId()==userId).collect(Collectors.toList());
	
		List<Cart> cartData=new ArrayList<Cart>();
		
		
		cartItems.forEach(cart->{
			
			double price = priceproxy.getPrice(cart.getpId());
			cart.setTotal(price*cart.getQty());
			cart.setProductPrice(price);
			cartData.add(cart);
		});
				
		return cartData;
	}
	
	
	@Transactional
	public void clearCart(int userId) {
		cartDao.deleteByUserIdEquals(userId);
		// ....
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
