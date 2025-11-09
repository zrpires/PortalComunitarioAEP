package com.portal.community.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank(message = "O título é obrigatório")
//    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres")
//    @Column(nullable = false)
    private String titulo;

//    @NotBlank(message = "A empresa é obrigatória")
//    @Size(max = 100, message = "O nome da empresa deve ter no máximo 100 caracteres")
//    @Column(nullable = false)
    private String compania;

//    @NotBlank(message = "A descrição é obrigatória")
//    @Size(max = 1000, message = "A descrição deve ter no máximo 1000 caracteres")
//    @Column(length = 1000)
    private String descricao;

//    @Size(max = 500, message = "Os requisitos devem ter no máximo 500 caracteres")
//    @Column(length = 500)
    private String requer;

//    @Size(max = 50, message = "O salário deve ter no máximo 50 caracteres")
    private String salario;

//    @NotBlank(message = "O contato é obrigatório")
//    @Size(max = 100, message = "O contato deve ter no máximo 100 caracteres")
//    @Column(nullable = false)
    private String contato;

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRequer() {
        return requer;
    }

    public void setRequer(String requer) {
        this.requer = requer;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
