package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao(); // Isso permite ocultar os métodos da implementação, somente mostrando a interface.
	
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
	}

}
