package com.rekha.interviewtracker.repository;

import com.rekha.interviewtracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}