package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity//anotação pra dizer que vai ser uma tabela no banco de dados
public class Evento implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    
    @NotEmpty
    private String nome;
    
    @NotEmpty
    private String local;
    
    @NotEmpty
    private String data;
    
    @NotEmpty
    private String horario;
    
    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL) // relação de entidade onde 1 evento tem muitos convidados(lista de convidados)
    private List <Convidado> convidados;
    
    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    
}
