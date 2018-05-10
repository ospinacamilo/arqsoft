package uan.edu.co.ospinacamilo.property.manager.service;
import uan.edu.co.ospinacamilo.property.manager.model.Property;;
public interface IPropertyService {
	/**
	 * 
	 * @param property
	 * @return
	 */
	public boolean save(Property property);
	
	public boolean update(Property property);
	
	public boolean deleteById(long id);
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Property> retrieveProperties();
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	public Iterable<Property> retrievePropertiesByAddress(String address);

}
