package Entidade;

import java.util.Objects;

public class Usuario {

	private String name;
	private String cpf;
	private String email;
	private String telefone;
	
	
	
	public Usuario() {
	}

	
	public Usuario(String name, String cpf, String email, String telefone) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
	
	
	
	
}
