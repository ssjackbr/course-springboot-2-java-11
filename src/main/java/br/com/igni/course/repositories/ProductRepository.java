package br.com.igni.course.repositories;

import br.com.igni.course.entities.Product;
import br.com.igni.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
