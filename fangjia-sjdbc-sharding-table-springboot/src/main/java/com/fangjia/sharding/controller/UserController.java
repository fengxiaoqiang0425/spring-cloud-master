package com.fangjia.sharding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fangjia.sharding.po.User;
import com.fangjia.sharding.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		for (long i = 0; i < 10000000; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳"+i);
			user.setName("李四"+i);
			userService.add(user);
		}
		return "success";
	}

	@GetMapping("/update/{id}")
	public Object update(@PathVariable Long id) {
		User user = userService.findById(id);
//		return user;
		user.setCity("重庆");
		return userService.updateById(user);
	}

	//单个查询
	@GetMapping("/users/{id}")
	public Object get(@PathVariable("id") Long id) {
		return userService.findById(id);
	}

	//排序查询
	@GetMapping("/order/{id}")
	public Object order(@PathVariable("id") Long id) {
		return userService.findOrder(id);
	}

	//排序查询所有
	@GetMapping("/order")
	public Object orderAll() {
		return userService.findOrderAll();
	}

	//分组查询
	@GetMapping("/group/{id}")
	public Object group(@PathVariable("id") Long id) {
		return userService.findGroup(id);
	}

	//分组查询所有
	@GetMapping("/group")
	public Object groupAll() {
		return userService.findGroupAll();
	}

	//分组加排序
	@GetMapping("/groupOrder/{id}")
	public Object groupOrder(@PathVariable("id") Long id) {
		return userService.findGroupOrder(id);
	}

	//分组加排序所有
	@GetMapping("/groupOrder")
	public Object groupOrder() {
		return userService.findGroupOrderAll();
	}

	@GetMapping("/users/query")
	public Object get(String name) {
		return userService.findByName(name);
	}
	
}
