package com.ism.repositories.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlImpl implements DataBase{
    private String driver="com.mysql.cj.jdbc.Driver";//Implementation
    private String url="jdbc:mysql://localhost:3306/gestion_Hospi";
    private  String userBd="root";
    private String passwordBd="";
    private Connection conn=null;
    private PreparedStatement ps;

    @Override
    public PreparedStatement getPs() {
    return ps;
    }

    @Override
    public void connection() {
        try {
            if (conn==null) {       
                Class.forName(driver);
                conn = DriverManager.getConnection(
		     	url, userBd, passwordBd);
                } 
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void closeConnection() {
        try {
        conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }      
    }

    @Override
    public ResultSet executeSelect(String sql) {
        ResultSet res=null;
        try {
            initPreparedStatement(sql);
			res = ps.executeQuery(sql); 
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public int executeUpdate(String sql) {
        int nbr=0;
        try {
            initPreparedStatement(sql);
			nbr = ps.executeUpdate(); 
                                                                      
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nbr;
    }
    
    @Override
    public void initPreparedStatement(String sql) {
        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
