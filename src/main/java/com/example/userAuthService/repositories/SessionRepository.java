package com.example.userAuthService.repositories;

import com.example.userAuthService.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
    Session save(Session session);
}
