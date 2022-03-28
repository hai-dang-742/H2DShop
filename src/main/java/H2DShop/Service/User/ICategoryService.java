package H2DShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import H2DShop.Dto.ProductsDto;
@Service
public interface ICategoryService {
	
	public List<ProductsDto> GetAllProductsByID(int id);
	
}
