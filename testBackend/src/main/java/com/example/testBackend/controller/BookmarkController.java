package com.example.testBackend.controller;

import com.example.testBackend.dto.UserDTO;
import com.example.testBackend.entity.Bookmark;
import com.example.testBackend.service.BookmarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("bookmarks")
public class BookmarkController {
    @Autowired
    BookmarkService bookmarkService;

    @PostMapping("/save")
    public boolean saveBookmarks(@RequestBody List<Bookmark> bookmarks){
        System.out.println(bookmarks);
        bookmarkService.saveBookmarks(bookmarks);
        return true;
    }

    @GetMapping("getBookmarks")
    public List<Bookmark> getBookmarks(){
        return bookmarkService.getBookmarks();
    }

    @PutMapping("updateBookmark")
    public boolean updateBookmark(@RequestBody Bookmark bookmark){
        return bookmarkService.updateBookmark(bookmark);
    }

    @DeleteMapping("deleteBookmark")
    public boolean deleteBookmark(@RequestBody Bookmark bookmark){
        return bookmarkService.deleteBookmark(bookmark);
    }




}
