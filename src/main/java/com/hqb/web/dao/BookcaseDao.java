package com.hqb.web.dao;

import com.hqb.web.po.Bookcase;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by heqingbao on 17/1/9.
 */
public class BookcaseDao {

    public List<Bookcase> queryAll() {

        List<Bookcase> list = new ArrayList<Bookcase>();

        try {
            Properties prop = new Properties();
            InputStream in = getClass().getClassLoader().getResourceAsStream("db.properties");
            prop.load(in);
            String dbClassName = prop.getProperty("driver");
            String dburl = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            Class.forName(dbClassName).newInstance();
            Connection conn = DriverManager.getConnection(dburl, username, password);

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from bookcase");
            while (rs.next()) {
                Bookcase bc = new Bookcase();
                bc.setId(rs.getInt("id"));
                bc.setName(rs.getString("name"));
                list.add(bc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
