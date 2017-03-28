package com.first.dao;

import java.util.List;


import com.first.entity.customerBean;

public interface customerDao {
	int addCustomer(customerBean customerBean);

	List<customerBean> queryCustomerBeans();

	int updateCustomer(customerBean customerBean);

	void deleteCustomer(customerBean customerBean);
}
