package com.jdbctemplate.demo.services.interfaces;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author fidel
 */
@Service
public interface IUsuariosService {
    
    List<Map<String, Object>> findAll();
}
