package com.jdbctemplate.demo;

import com.jdbctemplate.demo.services.interfaces.IUsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fidel
 */
@RestController
@CrossOrigin("*")
@RequestMapping("api")
public class ApiController {
    
     @Autowired
    private IUsuariosService services;
    
    @GetMapping(value ="/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> index() {
        
        return  ResponseEntity.ok(this.services.findAll());
    
    }
    
}
