package uan.edu.co.ospinacamilo.property.manager.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface PropertyRepository extends CrudRepository<Property, Long>{
	List<Property> findById(long id);
}
