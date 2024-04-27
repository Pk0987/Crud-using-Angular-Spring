package com.practice.CrudBasicWithAngular.Repository;

import com.practice.CrudBasicWithAngular.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRespository extends JpaRepository<Customer,Long> {
}
