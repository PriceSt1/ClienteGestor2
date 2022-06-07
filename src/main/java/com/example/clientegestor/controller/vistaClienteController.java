package com.example.clientegestor.controller;

import com.example.clientegestor.model.dao.PedidosDAO;
import com.example.clientegestor.model.entity.Pedidos;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class vistaClienteController {


    @javafx.fxml.FXML
    private TableColumn <Pedidos,Number> tvcCostoPedido;
    @javafx.fxml.FXML
    private TableView <Pedidos> tvTabla;
    @javafx.fxml.FXML
    private TableColumn<Pedidos,Number> tvcCodigoPedido;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,Number> tvcCantidad;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,String> tvcFechaPedido;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,String> tvcEstado;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,String> tvcFechaEsperada;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,String> tvcFechaEntrega;
    @javafx.fxml.FXML
    private TableColumn <Pedidos,String> tvcCodigoProducto;

    PedidosDAO pedidosDAO = new PedidosDAO();
    final ObservableList<Pedidos> pedidos = FXCollections.observableArrayList();


    public vistaClienteController() throws SQLException {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) throws Exception {
        pedidos.addAll(pedidosDAO.listAll());
        tvcCostoPedido.setCellValueFactory(celda -> celda.getValue().costoTotalProperty());
        tvcCodigoPedido.setCellValueFactory(celda -> celda.getValue().codigoPedidoProperty());
        tvcCantidad.setCellValueFactory(celda -> celda.getValue().cantidadProperty());
        tvcFechaPedido.setCellValueFactory(celda -> celda.getValue().fechaPedidoProperty());
        tvcEstado.setCellValueFactory(celda -> celda.getValue().estadoProperty());
        tvcFechaEsperada.setCellValueFactory(celda -> celda.getValue().estadoProperty());
        tvcFechaEntrega.setCellValueFactory(celda -> celda.getValue().fechaEntregaProperty());
        tvcCodigoProducto.setCellValueFactory(celda -> celda.getValue().codigoProductoProperty());

        tvTabla.setItems(pedidos);


    }
}
