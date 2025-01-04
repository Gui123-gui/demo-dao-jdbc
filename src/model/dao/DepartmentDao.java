package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
//	Interface que define quais serão os métodos e o que eles retornam da classe departamento dentro do banco de dados.
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
