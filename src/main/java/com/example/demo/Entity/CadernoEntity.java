package com.example.demo.Entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cadernos")
public class CadernoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;


    //verificar com professor
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Long usuario_id;



    public CadernoEntity(){}
    public CadernoEntity(Long id, String nome, Long usuario_id) {
        this.id = id;
        this.nome = nome;
        this.usuario_id = usuario_id;
    }
    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getUsuario_id() {
        return usuario_id;
    }
    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CadernoEntity that)) return false;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(nome, that.nome)) return false;
        return Objects.equals(usuario_id, that.usuario_id);
    }
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (usuario_id != null ? usuario_id.hashCode() : 0);
        return result;
    }
}
