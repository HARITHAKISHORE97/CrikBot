package com.example.demo.repository;

import com.example.demo.model.CommentaryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaryRepository extends CrudRepository<CommentaryEntity,String> {

    CommentaryEntity findById(int id);
}
