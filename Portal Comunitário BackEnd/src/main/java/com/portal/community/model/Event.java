package com.portal.community.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank(message = "O título é obrigatório")
//    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres")
//    @Column(nullable = false)
    private String titulo;

//    @NotBlank(message = "A descrição é obrigatória")
//    @Size(max = 1000, message = "A descrição deve ter no máximo 1000 caracteres")
//    @Column(length = 1000)
    private String descricao;

//    @NotNull(message = "A data é obrigatória")
//    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate data;

//    @NotBlank(message = "O local é obrigatório")
//    @Size(max = 200, message = "O local deve ter no máximo 200 caracteres")
    private String localizacao;

//    @NotBlank(message = "O organizador é obrigatório")
//    @Size(max = 100, message = "O organizador deve ter no máximo 100 caracteres")
    private String organizador;

    public Event() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }
}
