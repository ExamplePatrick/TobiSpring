import java.sql.SQLException;

import DAO.UserDAO;
import DTO.User;

public class TestMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		UserDAO dao = new UserDAO();
		
		User user = new User();
		user.setId("patrick");
		user.setName("심의석");
		user.setPassword("123123");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
		
	}
}
