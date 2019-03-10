package com.example.demo.repository;

import com.example.demo.model.UserScoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserScoreRepository extends CrudRepository<UserScoreEntity,String> {

    UserScoreEntity findByName(String name);
}
