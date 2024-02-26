package jdbc.controller;

import java.util.List;

import jdbc.model.vo.Salgrade;
import jdbc.service.SalService;

public class SalController {
	private SalService service = new SalService();
	

	public List<Salgrade> selectList() {
		return service.selectList();
	}

	public int insert(Salgrade vo) {
		return service.insert(vo);
	}
	
	public int delete(int grade) {
		return service.delete(grade);
	}
}
