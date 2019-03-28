package com.lks.service;

import com.lks.dao.BookMapper;
import com.lks.entities.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by likaisong on 2019/3/27.
 */
@Service
public class BookService {

    @Resource
    private BookMapper bookMapper;

    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    public Book getBookById(int id) {
        return bookMapper.getBookById(id);
    }

    public int add(Book entity) throws Exception {
        if (entity.getTitle() == null || entity.getTitle().equals("")) {
            throw new Exception("书名不能为空");
        }
        return bookMapper.add(entity);
    }

    @Transactional
    public int add(Book entity1, Book entityBak) {
        int rows = 0;
        rows = bookMapper.add(entity1);
        rows = bookMapper.add(entityBak);
        return rows;
    }

    public int delete(int id) {
        return bookMapper.delete(id);
    }

    /**
     * 多删除
     */
    public int delete(String[] ids) {
        int rows = 0;
        for (String idStr : ids) {
            int id = Integer.parseInt(idStr);
            rows += delete(id);
        }
        return rows;
    }

    public int update(Book entity) {
        return bookMapper.update(entity);
    }

}
