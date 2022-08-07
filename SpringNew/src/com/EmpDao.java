package com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDao {



private JdbcTemplate jdbcTemplate;

public JdbcTemplate getJdbcTemplate() {

    return jdbcTemplate; 
    }
  
public void setJdbcTemplate (JdbcTemplate jdbcTemplate) { 
	this.jdbcTemplate = jdbcTemplate;
	}

public int insert (Employee e)
{


String query="insert into employee (Name) values("+e.getName()+"')";

System.out.println(query);

return jdbcTemplate.update(query);

}

}
