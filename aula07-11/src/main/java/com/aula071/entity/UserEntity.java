package com.aula071.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
@Entity
@Table(name = "tb_usuarios")
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private Long id;
    private String username;
    private String password;
    private String role;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return role;
    }

    public void setRoles(String role) {
        this.role = role;
    }

    // Implementação dos métodos da interface UserDetails

    @Override
    public boolean isAccountNonExpired() {
        return true; // Pode adicionar lógica de expiração da conta, se necessário.
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Pode adicionar lógica de bloqueio de conta, se necessário.
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Pode adicionar lógica de expiração das credenciais, se necessário.
    }

    @Override
    public boolean isEnabled() {
        return true; // Pode adicionar lógica de ativação da conta, se necessário.
    }
}
