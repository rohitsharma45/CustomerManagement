package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.ICustomerDao;
import com.cg.model.CustomerBean;


@Service

public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public CustomerBean addDetails(CustomerBean cust) {
		return customerDao.addDetails(cust);
	}

	@Override
	public CustomerBean displayById(String custNo) {
		return customerDao.displayById(custNo);
		
	}

	@Override
	public List<CustomerBean> displayAll() {


		return customerDao.displayAll();
	}

	@Override
	public void removeById(String custNo) {
		
		customerDao.removeById(custNo);
	}

	@Override
	public List<String> retrieveIds() {
		// TODO Auto-generated method stub
		return customerDao.retrieveIds();
	}
}
