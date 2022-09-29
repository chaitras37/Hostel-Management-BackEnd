package practise_security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practise_security.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review,Integer>{

}
