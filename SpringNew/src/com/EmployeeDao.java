package com;
import java.sql.ResultSet; import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException; 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sun.org.apache.xalan.internal.xsite.compiler.Template;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate;

public void setJdbcTemplate (JdbcTemplate jdbcTemplate) { 
	this.jdbcTemplate - jdbcTemplate;
}
public int saveEmployee (Employee e) { 
	String query="insert into employee (Name, Salary) values ("+e.getName()+","+e.getSalary()+");"
	System.out.println(query);
	 return jdbciemplate.update(query);
	
}
public int updateEmployee (Employee e) {
String query "update employee set name "+e.getName()+", salary""+e.getSalary()+");

where in



}
