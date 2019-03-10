package com.example.demo.repository;

import com.example.demo.model.CommentaryEntity;
import com.example.demo.model.CommentaryEntityDemo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaryRepositoryDemo extends CrudRepository<CommentaryEntityDemo, String> {

}
