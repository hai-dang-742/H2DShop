package H2DShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import H2DShop.Dao.CategorysDao;
import H2DShop.Dao.MenusDao;
import H2DShop.Dao.ProductsDao;
import H2DShop.Dao.SlidesDao;
import H2DShop.Dto.ProductsDto;
import H2DShop.Entity.Categorys;
import H2DShop.Entity.Menus;
import H2DShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao catagoryDao;
	@Autowired
	private MenusDao menuDao;
	@Autowired
	private ProductsDao productsDao;
	
	public List<Slides> GetDataSlides() {
		return slidesDao.GetDataSlides();
	}

	public List<Categorys> GetDataCategorys() {
		return catagoryDao.GetDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menuDao.GetDataMenus();
	}

	public List<ProductsDto> GetDataProducts() {
		List<ProductsDto> listProducts = productsDao.GetDataProducts();
		return listProducts;
	}
	
	
	
}
