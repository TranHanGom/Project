package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Content;
@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

}
