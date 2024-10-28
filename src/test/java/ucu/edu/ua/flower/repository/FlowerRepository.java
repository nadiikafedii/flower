package ucu.edu.ua.flower.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucu.edu.ua.flower.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
