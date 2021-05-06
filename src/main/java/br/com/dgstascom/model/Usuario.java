package br.com.dgstascom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	private Long pk_usuario;
	private String no_usuario;
	private String uk_login;
	private Boolean sn_ativo;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getPk_usuario() {
		return pk_usuario;
	}
	public void setPk_usuario(Long pk_usuario) {
		this.pk_usuario = pk_usuario;
	}
	public String getNo_usuario() {
		return no_usuario;
	}
	public void setNo_usuario(String no_usuario) {
		this.no_usuario = no_usuario;
	}
	public String getUk_login() {
		return uk_login;
	}
	public void setUk_login(String uk_login) {
		this.uk_login = uk_login;
	}
	public Boolean getSn_ativo() {
		return sn_ativo;
	}
	public void setSn_ativo(Boolean sn_ativo) {
		this.sn_ativo = sn_ativo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pk_usuario == null) ? 0 : pk_usuario.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (pk_usuario == null) {
			if (other.pk_usuario != null)
				return false;
		} else if (!pk_usuario.equals(other.pk_usuario))
			return false;
		return true;
	}
	
	
	
}
