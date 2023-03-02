package com.example.testBackend.repo;

import com.example.testBackend.entity.Bookmark;
import com.example.testBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepo extends JpaRepository<Bookmark,String> {
}
