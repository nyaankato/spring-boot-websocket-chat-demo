package com.example.websocketdemo.repository;

import com.example.websocketdemo.model.ChatMessage;
import com.example.websocketdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
