package com.young.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.young.customer.dal.entities.Customer;
import com.young.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("MengQing");
		customer.setEmail("mqmq520@gmail.com");
		
		//after create, always remember to SAVE in the repository!!!
		customerRepository.save(customer);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(1l).get();
		customer.setEmail("my1314@gmail.com");
		
		//after update, always remember to SAVE in the repository!!!
		customerRepository.save(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		customerRepository.deleteById(1l);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
