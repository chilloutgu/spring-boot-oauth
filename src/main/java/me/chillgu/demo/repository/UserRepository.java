package me.chillgu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.chillgu.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
