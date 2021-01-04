package br.com.igni.course.repositories;

import br.com.igni.course.entities.OrderItem;
import br.com.igni.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
