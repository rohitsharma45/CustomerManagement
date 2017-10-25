package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.CustomerBean;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.ICustomerService;

@Controller
public class CustomerController {

	
	@Autowired
	public ICustomerService customerService;
/*@RequestMapping("/start")
public String Start(){
	return "custRegForm";
}
@RequestMapping("/regForm")
public String Register(){
	return "customerSuccess";
}
@RequestMapping("/register")
public ModelAndView registerFormSubmission(CustomerBean cust){
	return new ModelAndView("success","k",cust);
}

@RequestMapping("/update")
public String update(){
	return "updateInfo";
}
@RequestMapping("/update1")
public ModelAndView updateInfo(CustomerBean cust){
	return new ModelAndView("successU","u",cust);	
}
*/
	
	@RequestMapping("/index")
	public String StartHome(){
		return "index";
	}
	
	@RequestMapping("/start")
	public String Start(Model m){
		m.addAttribute("beanObj",new CustomerBean());
		return "custRegForm";
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView registerFormSubmission(@Valid @ModelAttribute("beanObj") CustomerBean cust,BindingResult br){
		System.out.println("in reg");
		if(br.hasErrors())
		{
			return new ModelAndView("custRegForm");
		}
		customerService.addDetails(cust);
		return new ModelAndView("success","k",cust);
	}
	
	@RequestMapping(value="/display")
	public String Display(Model m){
		List<String> idList = customerService.retrieveIds();
		m.addAttribute("idList", idList);
		return "display";
	}
	
	@RequestMapping(value="/displaySubmission",method=RequestMethod.POST)
	public ModelAndView displaySubmission(@RequestParam("custId") String custNo){
		//System.out.println("in disp");
		
		
		CustomerBean bean=customerService.displayById(custNo);
		//System.out.println(bean.getCustEmail());
		return new ModelAndView("displayById","d",bean);
		
	}

	@RequestMapping(value="/displayAll")
	public ModelAndView DisplayAll(){
	
		List<CustomerBean> beanList=customerService.displayAll();
		return new ModelAndView("displayAllDetails","list",beanList);
	}
	
	@RequestMapping(value="/remove")
	public String Remove(Model m){
		List<String> idList = customerService.retrieveIds();
		System.out.println(idList);
		m.addAttribute("idList", idList);
		return "removeById";
	}
	
	@RequestMapping(value="/removeSubmission",method=RequestMethod.POST)
	public String removeSubmission(@RequestParam("custId") String custNo){
	System.out.println(custNo);	
	customerService.removeById(custNo);
		
		return "deleteSuccess";
		
	}
	
	}
