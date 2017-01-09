package com.hqb.web.controller;

import com.hqb.web.dao.BookcaseDao;
import com.hqb.web.po.Bookcase;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by heqingbao on 17/1/9.
 */
public class BookcaseController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BookcaseDao dao = new BookcaseDao();
        List<Bookcase> list = dao.queryAll();
        req.setAttribute("itemsList", list);
        req.setAttribute("test", "hello");
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }
}
