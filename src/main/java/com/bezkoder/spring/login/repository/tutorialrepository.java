package com.bezkoder.spring.login.repository;
import java.util.List;

import com.bezkoder.spring.login.models.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface tutorialrepository extends JpaRepository<Tutorial, Integer> {
    Object findAll = null;
    List<Tutorial> findByPublished(boolean b);
    static List<Tutorial> findByTitleContaining(String title) {
      // TODO Auto-generated method stub
      return null;
    }
  }