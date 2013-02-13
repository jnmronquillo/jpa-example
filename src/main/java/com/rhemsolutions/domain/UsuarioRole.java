package com.rhemsolutions.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios_roles")
public class UsuarioRole extends EntityBase {

	private static final long serialVersionUID = 1L;
			
	public UsuarioRole() {}

	@ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Role role;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    public Role getRole() {
		return role;
	}
    
    public void setRole(Role role) {
		this.role = role;
	}
	    
}
