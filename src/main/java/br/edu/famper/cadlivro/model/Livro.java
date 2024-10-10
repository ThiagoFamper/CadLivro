package br.edu.famper.cadlivro.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "tbl_livro")
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "livro_id")
    private Long codigo;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "autor", length = 100)
    private String autor;

    @Column(name = "ano_publicacao")
    private Integer ano_publicacao;

    @Column(name = "preco")
    private Double preco;
}
