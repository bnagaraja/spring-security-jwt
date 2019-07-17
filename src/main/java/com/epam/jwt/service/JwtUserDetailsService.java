package com.epam.jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/*import com.javainuse.dao.UserDao;
import com.javainuse.model.DAOUser;
import com.javainuse.model.UserDTO;*/

@Service
public class JwtUserDetailsService implements UserDetailsService {

	/*
	 * @Autowired private UserDTO user;
	 */

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("epam".equals(username)) {
			return new User("epam", "$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6",
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

	/*
	 * public UserDao save(UserDTO user) { DAOUser newUser = new DAOUser();
	 * newUser.setUsername(user.getUsername());
	 * newUser.setPassword(bcryptEncoder.encode(user.getPassword())); return
	 * userDao.save(newUser); }
	 */

}	
