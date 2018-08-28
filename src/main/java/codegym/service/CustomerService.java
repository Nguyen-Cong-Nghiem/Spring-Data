package codegym.service;

import codegym.model.Customer;
import codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);

    Page<Customer> findAll(Pageable pageable);

    Iterable<Customer> findAllByProvince(Province province);

    Customer findById(Long id);

    void save(Customer customer);

    void update(Long id, Customer customer);

    void remove(Long id);
}
