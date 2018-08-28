package codegym.service;

import codegym.model.Customer;
import codegym.model.Province;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerService {
    Iterable<Customer> findAllByProvince(Province province);

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void update(Long id, Customer customer);

    void remove(Long id);
}
