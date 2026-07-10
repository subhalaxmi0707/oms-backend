package com.oms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.entity.User;
import com.oms.repository.UserRepository;
import com.oms.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	
	@Override
	public User updateUser(Long id, User user) {
	    User existingUser = userRepository.findById(id).orElseThrow();

	    existingUser.setFullName(user.getFullName());
	    existingUser.setEmail(user.getEmail());
	    existingUser.setMobile(user.getMobile());
	    existingUser.setPassword(user.getPassword());
	    existingUser.setRole(user.getRole());

	    return userRepository.save(existingUser);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
		
	}
	
	@Override
	public Optional<User> loginUser(String email, String password) {

	    Optional<User> user = userRepository.findByEmail(email);

	    if (user.isPresent() && user.get().getPassword().equals(password)) {
	        return user;
	    }

	    return Optional.empty();
	}

}