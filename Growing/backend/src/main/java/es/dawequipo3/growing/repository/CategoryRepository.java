package es.dawequipo3.growing.repository;

import es.dawequipo3.growing.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}