package eCommerce.DAO;

import eCommerce.model.UserDetail;

public interface UserDAO 
{
	public boolean registerUser(UserDetail user);

	
	public UserDetail getUser(String userName);
	boolean updateAddress(UserDetail user);

}
