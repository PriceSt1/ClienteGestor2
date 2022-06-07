package com.example.clientegestor.model.dao;

import com.example.clientegestor.model.entity.LoginCliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LoginClienteDAO implements InterfaceDAO<LoginCliente> {
    private Connection cn;


    public LoginClienteDAO() {
        this.cn = DBConnection.getConnection();
    }

    @Override
    public Integer add(LoginCliente o) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean update(LoginCliente o) {
        return false;
    }

    @Override
    public List<LoginCliente> listAll() {
        return null;
    }

    @Override
    public String find(String user) {
        String Pass;

        String sql = "SELECT Pass FROM clientelogin WHERE User = ?;";
        PreparedStatement ps;
        try {
            ps = this.cn.prepareStatement(sql);
            ps.setString(1,user);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                Pass = rs.getString("Pass");
                rs.close();
                return Pass;
            }else {
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Integer findID(String user) throws Exception {
        int Id;

        String sql = "SELECT CodigoCliente FROM clientelogin WHERE User = ?;";
        PreparedStatement ps;
        try {
            ps = this.cn.prepareStatement(sql);
            ps.setString(1,user);
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                Id = rs.getInt("CodigoCliente");
                rs.close();
                return Id;
            }else {
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
