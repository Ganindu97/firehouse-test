package com.example.testBackend.service;

import com.example.testBackend.entity.Bookmark;
import com.example.testBackend.repo.BookmarkRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BookmarkService {
    @Autowired
    BookmarkRepo bookmarkRepo;

    public List<Bookmark> getBookmarks(){
        return bookmarkRepo.findAll();
    }

    public boolean saveBookmarks(List<Bookmark> bookmarks){
        bookmarkRepo.saveAll(bookmarks);
        return true;
    }

    public boolean updateBookmark(Bookmark bookmark){
        bookmarkRepo.save(bookmark);
        return true;

    }

    public boolean deleteBookmark(Bookmark bookmark){
        bookmarkRepo.delete(bookmark);
        return true;
    }
}
