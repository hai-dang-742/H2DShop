package H2DShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import H2DShop.Dto.ProductsDto;
import H2DShop.Entity.Categorys;
import H2DShop.Entity.Menus;
import H2DShop.Entity.Slides;


@Service
public interface IHomeService {
	@Autowired
	public List<Slides> GetDataSlides();
	public List<Categorys> GetDataCategorys();
	public List<Menus> GetDataMenus();
	public List<ProductsDto> GetDataProducts();
}
