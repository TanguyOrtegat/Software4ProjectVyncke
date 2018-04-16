package be.vyncke.dao;

import be.vyncke.domain.Persoon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersoonRepository extends JpaRepository<Persoon, Integer> {
	Persoon findByEmailadres(String email);
}
