package geym.dg.ch9.demo4;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {

	// 使用JdbcTemplate可以简化对数据库的操作
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void inMoney(String in, Double money) {
		this.jdbcTemplate.update(
				"update account set money = (money + ?) where name = ?",
				money, in);
	}

	@Override
	public void outMoney(String out, Double money) {
		this.jdbcTemplate.update(
				"update account set money = (money - ?) where name = ?",
				money, out);
	}
}
