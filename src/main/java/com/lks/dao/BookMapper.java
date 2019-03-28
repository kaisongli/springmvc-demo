package com.lks.dao;

import com.lks.entities.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by likaisong on 2019/3/27.
 */
public interface BookMapper {
    /**
     * 获得所有图书
     */
    List<Book> getAllBooks();

    /**
     * 根据图书编号获得图书对象
     */
    Book getBookById(@Param("id") int id);

    /**
     * 添加图书
     */
    int add(Book entity);

    /**
     * 根据图书编号删除图书
     */
    int delete(int id);

    /**
     * 更新图书
     */
    int update(Book entity);
}
