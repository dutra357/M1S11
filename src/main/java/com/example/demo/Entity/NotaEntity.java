package com.example.demo.Entity;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notas")
public class NotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "caderno_id", nullable = false)
    private NotaEntity notaEntity;
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private UsuarioEntity usuarioEntity;


    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "content", nullable = false)
    private String content;



    public NotaEntity(){}

    public NotaEntity(Long id, NotaEntity notaEntity, UsuarioEntity usuarioEntity, String title, String content) {
        this.id = id;
        this.notaEntity = notaEntity;
        this.usuarioEntity = usuarioEntity;
        this.title = title;
        this.content = content;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public NotaEntity getNotaEntity() {
        return notaEntity;
    }
    public void setNotaEntity(NotaEntity notaEntity) {
        this.notaEntity = notaEntity;
    }
    public UsuarioEntity getUsuarioEntity() {
        return usuarioEntity;
    }
    public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
        this.usuarioEntity = usuarioEntity;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NotaEntity that)) return false;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(notaEntity, that.notaEntity)) return false;
        if (!Objects.equals(usuarioEntity, that.usuarioEntity))
            return false;
        if (!Objects.equals(title, that.title)) return false;
        return Objects.equals(content, that.content);
    }
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (notaEntity != null ? notaEntity.hashCode() : 0);
        result = 31 * result + (usuarioEntity != null ? usuarioEntity.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
