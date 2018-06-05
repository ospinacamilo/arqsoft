package uan.edu.co.ospinacamilo.property.manager.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uan.edu.co.ospinacamilo.property.manager.model.Property;
import uan.edu.co.ospinacamilo.property.manager.model.PropertyRepository;
import uan.edu.co.ospinacamilo.property.manager.service.IPropertyService;


@Service
public class PropertyServiceImpl implements IPropertyService{
	
	
	@Autowired
	PropertyRepository repository;

	//@Override
	public boolean save(Property property) {
		repository.save(property);
		return true;
	}
	
	//@Override
		public boolean deleteById(long id) {
			repository.deleteById(id);
			return true;
		}
	
	//@Override
		public boolean update(Property property) {
			repository.save(property);
			return true;
		}

	//@Override
	public Iterable<Property> retrieveProperties() {
		return repository.findAll();
	}

	//@Override
	public Iterable<Property> retrievePropertiesByID(long id) {
		return repository.findById(id);
	}

}
