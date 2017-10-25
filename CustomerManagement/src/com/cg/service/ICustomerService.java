package com.cg.service;

import java.util.List;

import com.cg.model.CustomerBean;

public interface ICustomerService {

	CustomerBean addDetails(CustomerBean cust);

	CustomerBean displayById(String custNo);

	List<CustomerBean> displayAll();

	void removeById(String custNo);

	List<String> retrieveIds();

}
