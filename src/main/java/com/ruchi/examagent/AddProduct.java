/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.examagent;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ruchi Devi
 */
@Controller
@RequestMapping("/product")
public class AddProduct {
	
	@Autowired
	ProdectService service;
			
			
	@GetMapping ("/View")
	public ModelAndView getAllProducts() {
		 //List<Products> list = service.getAllProducts();
        return new ModelAndView("/Prodect", "productList", service.getAllProducts());
	}
	
	@RequestMapping("/edit")     
    public ModelAndView insertProductsById(int id) { 
     
    return new ModelAndView("/edtProducts", "products", new Products());
}
    @PostMapping("/AddProducts")
    public ModelAndView updateProducts(@Valid @ModelAttribute("products") Products products, BindingResult result){
      
        if(result.hasErrors()){
            return new ModelAndView("/error");
            
            
        }
          service.updateProducts(products);
        return new ModelAndView("/editProduct");

}
}