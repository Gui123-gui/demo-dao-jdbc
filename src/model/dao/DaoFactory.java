package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
//	Essa classe vai ter métodos estáticos que instancie os "Daos".

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(); // Instanciando a classe que terá os métodos do banco de dados.
	}
}
