package com.example.clientegestor.model.entity;

import javafx.scene.control.PasswordField;

public class Cliente {
    private int CodigoCliente;
    private String NombreCliente;
    private String NombreContacto;
    private String ApellidoContacto;
    private String Telefono;
    private String Fax;
    private String LineaDireccion1;
    private String LineaDireccion2;
    private String Ciudad;
    private String Region;
    private String Pais;
    private String CodigoPostal;
    private int CodigoEmpleadoRepVentas;
    private float LimiteCredito;

    public Cliente(int codigoCliente, String nombreCliente, String nombreContacto, String apellidoContacto, String telefono, String fax, String lineaDireccion1, String lineaDireccion2, String ciudad, String region, String pais, String codigoPostal, int codigoEmpleadoRepVentas, float limiteCredito) {
        CodigoCliente = codigoCliente;
        NombreCliente = nombreCliente;
        NombreContacto = nombreContacto;
        ApellidoContacto = apellidoContacto;
        Telefono = telefono;
        Fax = fax;
        LineaDireccion1 = lineaDireccion1;
        LineaDireccion2 = lineaDireccion2;
        Ciudad = ciudad;
        Region = region;
        Pais = pais;
        CodigoPostal = codigoPostal;
        CodigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
        LimiteCredito = limiteCredito;
    }

    public int getCodigoCliente() {
        return CodigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        CodigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }

    public String getNombreContacto() {
        return NombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        NombreContacto = nombreContacto;
    }

    public String getApellidoContacto() {
        return ApellidoContacto;
    }

    public void setApellidoContacto(String apellidoContacto) {
        ApellidoContacto = apellidoContacto;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getLineaDireccion1() {
        return LineaDireccion1;
    }

    public void setLineaDireccion1(String lineaDireccion1) {
        LineaDireccion1 = lineaDireccion1;
    }

    public String getLineaDireccion2() {
        return LineaDireccion2;
    }

    public void setLineaDireccion2(String lineaDireccion2) {
        LineaDireccion2 = lineaDireccion2;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }

    public int getCodigoEmpleadoRepVentas() {
        return CodigoEmpleadoRepVentas;
    }

    public void setCodigoEmpleadoRepVentas(int codigoEmpleadoRepVentas) {
        CodigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
    }

    public float getLimiteCredito() {
        return LimiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        LimiteCredito = limiteCredito;
    }
}
