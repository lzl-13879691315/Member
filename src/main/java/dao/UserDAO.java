package dao;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.UserDTO;
import entity.QueryType;
import entity.User;
import mapper.UserMapper;
import tools.ExportFileExcel;

@Service
public class UserDAO {
	@Autowired
	UserMapper userMapper;

	public List<User> getValid(User user) {
		return userMapper.getValid(user);
	}

	public List<User> getValidPwd(User user) {
		return userMapper.getValidPwd(user);
	}

	public List<User> checkValid(User user) {
		return userMapper.checkValid(user);
	}

	public int add(User user) {
		return userMapper.add(user);
	}

	public void update(User user) {
		userMapper.update(user);
	}

	public void updatefinish(User user) {
		userMapper.updatefinish(user);
	}

	public List<User> getUser(QueryType queryType) {
		return userMapper.getUser(queryType);
	}

	public List<User> getExist(User user) {
		return userMapper.getExist(user);
	}

	public String getSalt(User user) {
		return userMapper.getSalt(user);
	}

	public String getSalt(int id) {
		return userMapper.getSalt(id);
	}

	/*
	 * 作者:陈泽帆
	 */
	public void print(List<User> list, String[] headers, String path, String title) throws IOException {
		ExportFileExcel ef = new ExportFileExcel();
		ef.exportExcel(title, headers, list, path);
	}

	// 提取数据到利息明细页面
	public List<User> getInfo() {
		return userMapper.getInfo();
	}

	public List<User> getInfoByPage(UserDTO userDTO) {
		return userMapper.getUserByPage(userDTO);
	}

	public void deleteById(int id) {
		userMapper.deleteById(id);
	}

	public String getName(User user) {
		return userMapper.getName(user);
	}

	public List<User> getUserByPage(UserDTO userDTO) {
		return userMapper.getUserByPage(userDTO);
	}

	public User getLastOne() {
		return userMapper.getLastOne();
	}

	public User getUserById(int id) {
		return userMapper.getUserById(id);
	}

	public User getUserByName(String name) {
		return userMapper.getUserByName(name);
	}

	public List<User> getMemberInfo(User user) {
		return userMapper.getMemberInfo(user);
	}

	public User getUserManageinfo(User user) {
		return userMapper.getUserManageinfo(user);
	}

	// 获得所有的User数据
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	};

	// 获取userName小于指定参数的所有user
	public List<User> getUserLtId(Integer id) {
		return userMapper.getUserLtId(id);
	};

	// 根据id修改user所有数据
	public void updateUserById(User user) {
		userMapper.updateUserById(user);
	}
}