package com.example.demo.Entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name="nome")
    private String nome;


    @Column(name="login", columnDefinition = "varchar(255) not null", unique = true)
    private String login;
    @Column(name="senha", columnDefinition = "varchar(255) not null")
    private String senha;


    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<CadernoEntity> cadernos;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<NotaEntity> notas;{
    }


    public UsuarioEntity() {}
    public UsuarioEntity(Long usuarioId, String nome, String login, String senha, List<CadernoEntity> cadernos, List<NotaEntity> notas) {
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cadernos = cadernos;
        this.notas = notas;
    }



    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public List<CadernoEntity> getCadernos() {
        return cadernos;
    }
    public List<NotaEntity> getNotas() {
        return notas;
    }

}
