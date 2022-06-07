package com.example.clientegestor.model.entity;

import javafx.beans.property.*;

public class Pedidos {
        private IntegerProperty CodigoPedido;
        private StringProperty FechaPedido;
        private StringProperty FechaEsperada;
        private StringProperty FechaEntrega;
        private StringProperty Estado;
        private StringProperty CodigoProducto;
        private IntegerProperty Cantidad;
        private FloatProperty CostoTotal;

    public Pedidos() {
        CodigoPedido = new SimpleIntegerProperty();
        FechaPedido = new SimpleStringProperty();
        FechaEsperada = new SimpleStringProperty();
        FechaEntrega = new SimpleStringProperty();
        Estado = new SimpleStringProperty();
        CodigoProducto = new SimpleStringProperty();
        Cantidad = new SimpleIntegerProperty();
        CostoTotal = new SimpleFloatProperty();
    }

    public Pedidos(Integer codigoPedido, String fechaPedido, String fechaEsperada, String fechaEntrega, String estado, String codigoProducto, Integer cantidad, Float costoTotal) {
        this();
        setCodigoPedido(codigoPedido);
        setFechaPedido(fechaPedido);
        setFechaEsperada(fechaEsperada);
        setFechaEntrega(fechaEntrega);
        setEstado(estado);
        setCodigoProducto(codigoProducto);
        setCantidad(cantidad);
        setCostoTotal(costoTotal);

    }

    public int getCodigoPedido() {
        return CodigoPedido.get();
    }

    public IntegerProperty codigoPedidoProperty() {
        return CodigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.CodigoPedido.set(codigoPedido);
    }

    public String getFechaPedido() {
        return FechaPedido.get();
    }

    public StringProperty fechaPedidoProperty() {
        return FechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.FechaPedido.set(fechaPedido);
    }

    public String getFechaEsperada() {
        return FechaEsperada.get();
    }

    public StringProperty fechaEsperadaProperty() {
        return FechaEsperada;
    }

    public void setFechaEsperada(String fechaEsperada) {
        this.FechaEsperada.set(fechaEsperada);
    }

    public String getFechaEntrega() {
        return FechaEntrega.get();
    }

    public StringProperty fechaEntregaProperty() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.FechaEntrega.set(fechaEntrega);
    }

    public String getEstado() {
        return Estado.get();
    }

    public StringProperty estadoProperty() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado.set(estado);
    }

    public String getCodigoProducto() {
        return CodigoProducto.get();
    }

    public StringProperty codigoProductoProperty() {
        return CodigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.CodigoProducto.set(codigoProducto);
    }

    public int getCantidad() {
        return Cantidad.get();
    }

    public IntegerProperty cantidadProperty() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad.set(cantidad);
    }

    public float getCostoTotal() {
        return CostoTotal.get();
    }

    public FloatProperty costoTotalProperty() {
        return CostoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.CostoTotal.set(costoTotal);
    }
}
