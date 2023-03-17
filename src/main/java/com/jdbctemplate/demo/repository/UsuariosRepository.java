package com.jdbctemplate.demo.repository;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fidel
 */
@Repository
public class UsuariosRepository {
    
    private JdbcTemplate plantilla;
    
    public UsuariosRepository(JdbcTemplate plantilla) {
    this.plantilla = plantilla;
  }
    
    
    public List<Map<String, Object>> buscarTodos() {
    return plantilla.queryForList("select * from \"USUARIOS\"");
  }
    
    
}
