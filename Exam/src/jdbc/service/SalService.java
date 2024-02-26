package jdbc.service;

import static jdbc.common.SalTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbc.dao.SalDao;
import jdbc.model.vo.Salgrade;

public class SalService {
	private SalDao dao = new SalDao();
	
	public List<Salgrade> selectList() {
		List<Salgrade> result = null;
		Connection con = getConnection();
		result = dao.selectList(con);
		close(con);
		return result;
	}

	public int insert(Salgrade vo) {
		Connection con = getConnection();
		autocommit(con, false);
		int result = dao.insert(con, vo);
		if(result > 0) {commit(con);}
		else {rollback(con);}
		close(con);
		return result;
	}
	
	public int delete(int grade) {
		Connection con = getConnection();
		autocommit(con, false);
		int result = dao.delete(con, grade);
		if(result>0 ) {commit(con);}
		else {rollback(con);}
		close(con);
		return result;
		
	}
}
