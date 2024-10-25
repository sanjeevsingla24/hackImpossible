package mycode.hack.demo.repository;

import mycode.hack.demo.dto.OrderResponse;
import mycode.hack.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new mycode.hack.demo.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

    @Query(value = "SELECT * FROM Customer WHERE name = :name")
    public List<Customer> findByName(String name);

    @Query(value = "SELECT * FROM Customer WHERE email in :email")
    public List<Customer> findByEmail(String email);

}