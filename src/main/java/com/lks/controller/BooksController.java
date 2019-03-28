package com.lks.controller;

import com.lks.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by likaisong on 2019/3/28.
 */
@Controller
public class BooksController {
    @Resource
    private BookService bookService;

    @RequestMapping(value = "queryBooks")
    public ModelAndView queryBooks() {
        ModelAndView modelAndView = new ModelAndView();

        // 设置数据和视图
        modelAndView.addObject("books", bookService.getAllBooks());
        modelAndView.setViewName("/WEB-INF/views/jsp/bookList.jsp");
        return modelAndView;

    }
}
