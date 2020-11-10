package com.srbruninho.apirestdemo.RestComSwagger.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cliente_id;

    private String cliente_Nome;
    private String cliente_sobrenome;
    private String cliente_email;
    private String cliente_sexo;

    public long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getCliente_Nome() {
        return cliente_Nome;
    }

    public void setCliente_Nome(String cliente_Nome) {
        this.cliente_Nome = cliente_Nome;
    }

    public String getCliente_sobrenome() {
        return cliente_sobrenome;
    }

    public void setCliente_sobrenome(String cliente_sobrenome) {
        this.cliente_sobrenome = cliente_sobrenome;
    }

    public String getCliente_email() {
        return cliente_email;
    }

    public void setCliente_email(String cliente_email) {
        this.cliente_email = cliente_email;
    }

    public String getCliente_sexo() {
        return cliente_sexo;
    }

    public void setCliente_sexo(String cliente_sexo) {
        this.cliente_sexo = cliente_sexo;
    }
}
