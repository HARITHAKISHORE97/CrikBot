package com.example.demo.repository;

import com.example.demo.model.QuestionAndAnswerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionAndAnswerRepository extends CrudRepository<QuestionAndAnswerEntity,String> {



}
