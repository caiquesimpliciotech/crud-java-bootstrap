package tech.caique.crudusuarios.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios") // nome da tabela no banco
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    // Getters e Setters gerados automaticamente
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
