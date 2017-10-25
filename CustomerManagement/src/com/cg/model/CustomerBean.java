package com.cg.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="Customer_table")
@NamedQueries({
	@NamedQuery(name="getById", query="SELECT cust FROM CustomerBean cust where cust.custId=:cId"),
	@NamedQuery(name="getAll", query="SELECT cust FROM CustomerBean cust"),
	@NamedQuery(name="removeById",query="DELETE  FROM CustomerBean cust where cust.custId=:cId"),
	@NamedQuery(name="retrieveCustomerIds", query="SELECT custId FROM CustomerBean cust")
})
public class CustomerBean {
	
	@Id
	@Column(name="cust_id")
	@NotBlank(message="enter id")//for string and also notempty
	// not null is for Integer - no usage of int datatype
	private String custId;
	@NotEmpty(message="enter name")
	@Column(name="cust_name")
	private String custName;
	
	@Size(min=10,message="enter correct phone number")
	@NotEmpty(message="enter phone number")
	@Column(name="cust_phone")
	private String custPhone;
	@NotBlank(message="enter email id")
	@Column(name="cust_email")
	private String custEmail;
	@NotNull(message="Enter Date of birth")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Past
	@Column(name="cust_dob")
	//@temporal
	private Date custDob;
	
	@Override
	public String toString() {
		return "CustomerBean [custId=" + custId + ", custName=" + custName
				+ ", custPhone=" + custPhone + ", custEmail=" + custEmail
				+ ", custDob=" + custDob + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustPhone() {
		return custPhone;
	}
	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public Date getCustDob() {
		return custDob;
	}
	public void setCustDob(Date custDob) {
		this.custDob = custDob;
	}
	
}
