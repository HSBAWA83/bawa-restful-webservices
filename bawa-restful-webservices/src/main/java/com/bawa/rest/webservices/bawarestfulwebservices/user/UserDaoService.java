package com.bawa.rest.webservices.bawarestfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	
	//private static int userCount = 4;
	
	
	static {
		users.add(new User("Bawa", 1, new Date()));
		users.add(new User("Preet", 2, new Date()));
		users.add(new User("Baani", 3, new Date()));
		users.add(new User("Japji", 4, new Date()));
		
	}
	
	
	//
	public List<User> findAll() {
		return users;
	}
	
	public User saveUser(User u) {
		if(u.getId() == null) {
			u.setId((users.size() + 1));
		}
		users.add(u);
		
		return u;
	}
	
	public User findUser(int id) {
		
		for(User user:users) {
			if(user.getId() == id)
				return user;				
		}
		return null;
	}
	
	public User deleteUser(int id) {
		
		Iterator<User> iterator = users.iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			
			if(user.getId() == id) {
				iterator.remove();
				return user;
			}
			
		}
		
		return null;
	}
	
}
