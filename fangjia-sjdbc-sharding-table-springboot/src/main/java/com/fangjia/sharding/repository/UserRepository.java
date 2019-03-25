package com.fangjia.sharding.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fangjia.sharding.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);

    int update(User user);

	List<User> order(Long id);

	List<User> group(Long id);

	List<User> groupOrder(Long id);

	List<User> orderAll();

	List<User> groupAll();

	List<User> groupOrderAll();
}
