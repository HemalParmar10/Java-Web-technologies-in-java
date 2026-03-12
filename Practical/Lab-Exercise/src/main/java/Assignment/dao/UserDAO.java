package Assignment.dao;

import java.sql.*;
import Assignment.model.User;

public class UserDAO {

	Connection con;

	public Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "1234");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	// Register
	public void registerUser(User user) {

		try {

			con = getConnection();

			PreparedStatement ps = con.prepareStatement("INSERT INTO users(username,email,password) VALUES(?,?,?)");

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Login
	public User loginUser(String username, String password) {

		User user = null;

		try {

			con = getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				user = new User();

				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	// Get user by id
	public User getUserById(int id) {

		User user = null;

		try {

			con = getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id=?");

			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				user = new User();

				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	// Update
	public void updateUser(User user) {

		try {

			con = getConnection();

			PreparedStatement ps = con.prepareStatement("UPDATE users SET username=?,email=?,password=? WHERE id=?");

			ps.setString(1, user.getUsername());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setInt(4, user.getId());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Delete
	public void deleteUser(int id) {

		try {

			con = getConnection();

			PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id=?");

			ps.setInt(1, id);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
