package com.example.clientegestor.model.dao;

import com.example.clientegestor.controller.vistaLoginController;
import com.example.clientegestor.model.entity.Pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidosDAO implements InterfaceDAO<Pedidos> {

    private Connection cn = null;

    public PedidosDAO() throws SQLException {
        this.cn = DBConnection.getConnection();
    }

    @Override
    public Integer add(Pedidos o) throws Exception {
        return null;
    }

    @Override
    public boolean delete(long id) throws Exception {
        return false;
    }

    @Override
    public boolean update(Pedidos o) throws Exception {
        return false;
    }

    @Override
    public List<Pedidos> listAll() throws Exception {
        Pedidos pedidos;
        List<Pedidos> listaPedidos = new ArrayList<>();
        vistaLoginController vlc = new vistaLoginController();

        String sql = "SELECT CodigoPedido, FechaPedido, FechaEsperada, FechaEntrega,Estado,CodigoProducto,Cantidad,CostoTotal FROM pedidosClientes WHERE CodigoCliente = ?";
        PreparedStatement ps = null;
        ps = this.cn.prepareStatement(sql);
        ps.setInt(1,vlc.getUserID());
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            pedidos = new Pedidos();
            pedidos.setCodigoPedido(rs.getInt("CodigoPedido"));
            pedidos.setFechaPedido(rs.getString("FechaPedido"));
            pedidos.setFechaEsperada(rs.getString("FechaEsperada"));
            pedidos.setFechaEntrega(rs.getString("FechaEntrega"));
            pedidos.setEstado(rs.getString("Estado"));
            pedidos.setCodigoProducto(rs.getString("CodigoProducto"));
            pedidos.setCantidad(rs.getInt("Cantidad"));
            pedidos.setCostoTotal(rs.getFloat("CostoTotal"));
            listaPedidos.add(pedidos);
        }

        return listaPedidos;
    }

    @Override
    public String find(String id) throws Exception {
        return null;
    }

    @Override
    public Integer findID(String id) throws Exception {
        return null;
    }
}
