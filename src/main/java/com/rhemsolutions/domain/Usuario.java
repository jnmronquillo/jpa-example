package com.rhemsolutions.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
public class Usuario extends EntityBase {

	private static final long serialVersionUID = 1L;

	private String usuario;
	
	private String apellidos;

	private String nombres;
	
	private String email;
	
	private byte[] clave;
	
	private byte[] salt;

	@Transient
	private String aclave;
	
	@Transient
	private String reclave;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	private List<UsuarioRole> usuarioroles = new ArrayList<UsuarioRole>();

	
    public Usuario() {
    }
  
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getClave() {
		return clave;
	}

	public void setClave(byte[] clave) {
		this.clave = clave;
	}

	public byte[] getSalt() {
		return salt;
	}

	public void setSalt(byte[] salt) {
		this.salt = salt;
	}

	public String getAclave() {
		return aclave;
	}

	public void setAclave(String aclave) {
		this.aclave = aclave;
	}

	public String getReclave() {
		return reclave;
	}

	public void setReclave(String reclave) {
		this.reclave = reclave;
	}
		
	public List<UsuarioRole> getUsuarioroles() {
		return usuarioroles;
	}

	// addRol sets up bidirectional relationship
    public void addRole(Role role) {
        // Notice a JoinedUsuarioRol object
        UsuarioRole usuarioRol = new UsuarioRole();

        usuarioRol.setUsuario(this);
        usuarioRol.setRole(role);

        usuarioroles.add(usuarioRol);
    }

}