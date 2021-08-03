package com.tienda.front.shelly.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tienda.front.shelly.service.ProductsService;
import com.tienda.front.shelly.model.Product;
@Controller
public class FrontController {

	@Autowired
	ProductsService productsService;
	
	@GetMapping("/vender/productos")
	public String vender(@RequestParam String search,Model model){
		model.addAttribute("products",productsService.busqueda(search).getBody());
		model.addAttribute("lastsearch",search);
		return "vender";
	}
	
	@PostMapping("/producto/registrar")
	public String exitonuevoproducto(@ModelAttribute Product product,Model model) {
	    model.addAttribute("status",productsService.nuevo(product).getBody()); 
		return "hecho";
	}
	
	@GetMapping("/producto/form/registrar")
	public String nuevoproducto(Model model) {
		return "registrarproducto";
	}
	
	@GetMapping("/producto/vender/buscar")
	public String buscar(Model model) {
		return "buscar";
	}
	
	

}
