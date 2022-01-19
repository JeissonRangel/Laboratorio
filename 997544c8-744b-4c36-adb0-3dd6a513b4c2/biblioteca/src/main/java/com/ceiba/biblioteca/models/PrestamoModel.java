package com.ceiba.biblioteca.models;
import javax.persistence.*;
import java.io.Serializable;

@Entity()
@Table(name = "prestamoLibroUsuario")
public class PrestamoModel implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column()
    private String fechaMaximaDevolucion;

    @Column(nullable = false,length = 10)
    private String isbn;

    @Column(nullable = false,length = 10)
    private String identificacionUsuario;

    @Column(nullable = false)
    private int tipoUsuario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaMaximDevolucion() {
        return fechaMaximaDevolucion;
    }

    public void setFechaMaximDevolucion(String fechaMaximDevolucion) {
        this.fechaMaximaDevolucion = fechaMaximDevolucion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
