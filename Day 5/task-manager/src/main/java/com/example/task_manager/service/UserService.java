package com.example.task_manager.service;

import com.example.task_manager.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findById(String id) {
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    
    public User save(User user) {
        return this.userRepository.save(user);
    }
    
    public User update(User user) {
        User userEntity = this.findById(user.getName());
        BeanUtils.copyProperties(user, userEntity, "id");
        return this.userRepository.save(userEntity);
    }
    
    public void delete(String id) {
        this.userRepository.deleteById(id);
    }
}
