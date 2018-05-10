package uan.edu.co.ospinacamilo.property.manager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import uan.edu.co.ospinacamilo.property.manager.model.Property;
import uan.edu.co.ospinacamilo.property.manager.service.IPropertyService;


@RestController

public class PropertyController {
	@Autowired
	IPropertyService propertyService;
	
	@PutMapping("/save")
	public ResponseEntity<Boolean> process( @RequestBody Property property ){
		return new ResponseEntity<>(propertyService.save(property), HttpStatus.OK);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<Iterable<Property>>  findAll(){
		return new ResponseEntity<>(propertyService.retrieveProperties(), HttpStatus.OK);
	}
	
	@GetMapping("/findByAddress")
	public ResponseEntity<Iterable<Property>>  findByaddress(@RequestParam String address){
		return new ResponseEntity<>(propertyService.retrievePropertiesByAddress(address) ,HttpStatus.OK);
	}
	
	@PutMapping("/update")
    public ResponseEntity<Boolean> update(@RequestBody Property property) {
		return new ResponseEntity<>(propertyService.save(property), HttpStatus.OK);
        
    }
	@RequestMapping("/deleteById")
	public String deleteById(@RequestParam("id") Long id) {
		propertyService.deleteById(id);
 
		return "Done";
	}
}
