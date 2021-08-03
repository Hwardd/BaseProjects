package com.tienda.front.shelly.service;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;


import com.tienda.front.shelly.components.RestTemplateService;
import com.tienda.front.shelly.model.Product;
import com.tienda.front.shelly.model.ProductList;
import com.tienda.front.shelly.model.ProductoVender;
@Service
public class ProductsService {
	
	@Autowired
	RestTemplateService restTemplate;
	
	   private static final Logger logger = LoggerFactory.getLogger(ProductsService.class);
	
	   public ResponseEntity<List<ProductoVender>> busqueda(String search){	
			List<ProductoVender> resp=new ArrayList<ProductoVender>();
			List<ProductoVender> respservice=new ArrayList<ProductoVender>();
			try {
			ProductList products=restTemplate.getRestTemplate().getForObject("http://localhost:8080/info/search/"+search, ProductList.class);
			resp=products.getProducts();
			}catch(Exception e){
				logger.info(e.toString());
			}
		
			for(ProductoVender each: resp)
			{
				if(each.getImagenes()!=null)
				{
				each.setFirstimagen(each.getImagenes().get(0));
				}
				respservice.add(each);
			}
			
			return ResponseEntity.ok(respservice);
		}
	   
	public ResponseEntity<List<ProductoVender>> todos(){	
		List<ProductoVender> resp=new ArrayList<ProductoVender>();
		List<ProductoVender> respservice=new ArrayList<ProductoVender>();
		try {
		ProductList products=restTemplate.getRestTemplate().getForObject("http://localhost:8080/info/all", ProductList.class);
		resp=products.getProducts();
		}catch(Exception e){
			logger.info(e.toString());
		}
	
		for(ProductoVender each: resp)
		{
			if(each.getImagenes()!=null)
			{
			each.setFirstimagen(each.getImagenes().get(0));
			}
			respservice.add(each);
		}
		
		return ResponseEntity.ok(respservice);
	}
	
	public ResponseEntity<String> nuevo(@ModelAttribute Product product) {
		String resp="ok";
		
		return ResponseEntity.ok(resp);
	}
	

}
