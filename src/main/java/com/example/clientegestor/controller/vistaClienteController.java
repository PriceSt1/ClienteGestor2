package com.example.clientegestor.controller;

import com.example.clientegestor.model.dao.PedidosDAO;
import com.example.clientegestor.model.entity.Pedidos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class vistaClienteController implements Initializable {


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


    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            pedidos.addAll(pedidosDAO.listAll());
            tvcCostoPedido.setCellValueFactory(celda -> celda.getValue().costoTotalProperty());
            tvcCodigoPedido.setCellValueFactory(celda -> celda.getValue().codigoPedidoProperty());
            tvcCantidad.setCellValueFactory(celda -> celda.getValue().cantidadProperty());
            tvcFechaPedido.setCellValueFactory(celda -> celda.getValue().fechaPedidoProperty());
            tvcEstado.setCellValueFactory(celda -> celda.getValue().estadoProperty());
            tvcFechaEsperada.setCellValueFactory(celda -> celda.getValue().estadoProperty());
            tvcFechaEntrega.setCellValueFactory(celda -> celda.getValue().fechaEntregaProperty());
            tvcCodigoProducto.setCellValueFactory(celda -> celda.getValue().codigoProductoProperty());

        } catch (Exception e) {
            e.printStackTrace();
        }

        tvTabla.setItems(pedidos);


    }
    public vistaClienteController() throws SQLException {
    }


}
