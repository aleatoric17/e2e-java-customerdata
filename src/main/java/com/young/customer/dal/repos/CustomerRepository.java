package com.young.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.young.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
