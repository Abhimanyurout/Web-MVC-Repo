package in.abhi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
