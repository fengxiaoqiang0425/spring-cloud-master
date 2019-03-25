package com.fangjia.sharding.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fangjia.sharding.po.User;
import com.fangjia.sharding.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
		return userRepository.list();
	}

	public Long add(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public int updateById(User user) {
		return userRepository.update(user);
	}

	@Override
	public List<User> findOrder(Long id) {
		return userRepository.order(id);
	}

	@Override
	public List<User> findGroup(Long id) {
		return userRepository.group(id);
	}

	@Override
	public List<User> findGroupOrder(Long id) {
		return userRepository.groupOrder(id);
	}

	@Override
	public List<User> findOrderAll() {
		return userRepository.orderAll();
	}

	@Override
	public List<User> findGroupAll() {
		return userRepository.groupAll();
	}

	@Override
	public List<User> findGroupOrderAll() {
		return userRepository.groupOrderAll();
	}


}
