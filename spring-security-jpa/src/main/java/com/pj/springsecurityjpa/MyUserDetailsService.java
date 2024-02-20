package com.pj.springsecurityjpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pj.springsecurityjpa.models.MyUserDetails;
import com.pj.springsecurityjpa.models.User;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
//		return new MyUserDetails(username);
		Optional<User> user = userRepository.findByUserName(username);
//		Optional<User> user = userRepository.findById(1);
		System.out.print(user);
		user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));
		return user.map(MyUserDetails::new).get();
		
	}

	
}
