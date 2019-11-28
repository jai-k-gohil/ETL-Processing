package com.jkProductions.batchprocessor.repository;

import com.jkProductions.batchprocessor.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by
 * @author jaikishorgohil
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
