package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;





import com.cg.model.CustomerBean;

@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	public CustomerBean addDetails(CustomerBean cust){
		
		entityManager.persist(cust);
		entityManager.flush();
		
		return cust;
		
		
	}

	public CustomerBean displayById(String custNo) {
		
		//CustomerBean customer=entityManager.find(CustomerBean.class, custNo);

		TypedQuery<CustomerBean> query = entityManager.createNamedQuery("getById", CustomerBean.class).setParameter("cId", custNo);
		CustomerBean customer = query.getSingleResult();
		return customer;
	}

	@Override
	public List<CustomerBean> displayAll() {
		
		TypedQuery<CustomerBean> query = entityManager.createNamedQuery("getAll", CustomerBean.class);
		List<CustomerBean> list = query.getResultList();
		return list;
	}

	@Override
	public void removeById(String custNo) {
	
		Query query = entityManager.createNamedQuery("removeById");
		query.setParameter("cId", custNo);
		query.executeUpdate();
		
	}

	@Override
	public List<String> retrieveIds() {
		// TODO Auto-generated method stub
		TypedQuery<String> query = entityManager.createNamedQuery("retrieveCustomerIds",String.class);
		List<String> idList=query.getResultList();
		return idList;
	}
	
	
	
}
