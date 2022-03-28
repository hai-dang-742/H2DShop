package H2DShop.Service.User;

import org.springframework.stereotype.Service;

import H2DShop.Dto.PaginatesDto;
@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
