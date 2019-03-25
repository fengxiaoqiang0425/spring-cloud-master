package com.fangjia.sharding.service;

import java.util.List;
import com.fangjia.sharding.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);

    int updateById(User user);

	List<User> findOrder(Long id);

	List<User> findGroup(Long id);

	List<User> findGroupOrder(Long id);

	List<User> findOrderAll();

	List<User> findGroupAll();

	List<User> findGroupOrderAll();
}
