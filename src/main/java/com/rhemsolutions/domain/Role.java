package com.rhemsolutions.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
public class Role extends EntityBase implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descripcion;
	
	@OneToMany(mappedBy="role")
	private List<UsuarioRole> usuarioroles = new ArrayList<UsuarioRole>();

    public Role() {
    }

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
	public List<UsuarioRole> getUsuarioroles() {
		return usuarioroles;
	}

	// addUsuario sets up bidirectional relationship
    public void addUsuario(Usuario usuario) {
        // Notice a JoinedUsuarioRol object
        UsuarioRole usuarioRole = new UsuarioRole();

        usuarioRole.setUsuario(usuario);
        usuarioRole.setRole(this);

        usuarioroles.add(usuarioRole);
    }

}