package H2DShop.Service.User;

import org.springframework.stereotype.Service;

import H2DShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	
	public Users CheckAccount(Users user);
}
