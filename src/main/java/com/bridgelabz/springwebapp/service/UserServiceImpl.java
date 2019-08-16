
package com.bridgelabz.springwebapp.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.bridgelabz.springwebapp.model.LoginForm;
import com.bridgelabz.springwebapp.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void register(User user) {

		String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getFirstName(), user.getLastName(), user.getEmail(),
				user.getAddress(), user.getPhone(), user.getUserName(), user.getPassword() });
	}

	public User validateUser(LoginForm login) {

		String sql = "select * from users where username='" + login.getUserName() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());

		return users.size() > 0 ? users.get(0) : null;
	}
}

class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {

		User user = new User();

		user.setFirstName(rs.getString("firstName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setPhone(rs.getLong("phone"));
		user.setUserName(rs.getString("userName"));
		user.setPassword(rs.getString("password"));
		return user;
	}
}
