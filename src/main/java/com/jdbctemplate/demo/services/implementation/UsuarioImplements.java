package com.jdbctemplate.demo.services.implementation;

import com.jdbctemplate.demo.services.interfaces.IUsuariosService;
import com.jdbctemplate.demo.repository.UsuariosRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author fidel
 */
@Component
public class UsuarioImplements implements IUsuariosService{
    
    @Autowired
    private UsuariosRepository Repository;

    @Override
    public List<Map<String, Object>> findAll() {
        
       return Repository.buscarTodos();
    }
    
}
