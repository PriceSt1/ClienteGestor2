package com.example.clientegestor.model.entity;

public class LoginCliente {
    private String user;
    private String pass;
    private int codigocliente;

    public LoginCliente() {

    }

    public LoginCliente(String user, String pass, int codigocliente) {
        this.user = user;
        this.pass = pass;
        this.codigocliente = codigocliente;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(int codigocliente) {
        this.codigocliente = codigocliente;
    }
}
