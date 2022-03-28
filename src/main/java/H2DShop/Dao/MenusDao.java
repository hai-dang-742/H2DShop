package H2DShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import H2DShop.Entity.MapperMenus;
import H2DShop.Entity.Menus;


@Repository
public class MenusDao extends BaseDao{
	

	public List<Menus> GetDataMenus(){
		List<Menus> list = new ArrayList<Menus>();
		String sql = "SELECT * FROM menus";
		list = _jdbcTemplate.query(sql, new MapperMenus());
		return list;
	}
}
