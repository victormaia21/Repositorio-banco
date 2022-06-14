package Entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Conta {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private double salario;
	private int numerodaconta;
	private Usuario usuario;
	private Date datacriacao;
	
	List<Conta>list = new ArrayList<>();
	public Conta() {
	}

	public Conta(double salario, int numerodaconta, Usuario usuario, Date datacriacao) {
		this.salario = salario;
		this.numerodaconta = numerodaconta;
		this.usuario = usuario;
		this.datacriacao = datacriacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNumerodaconta() {
		return numerodaconta;
	}

	public void setNumerodaconta(int numerodaconta) {
		this.numerodaconta = numerodaconta;
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public Date getDatacriacao() {
		return datacriacao;
	}

	public void setDatacriacao(Date datacriacao) {
		this.datacriacao = datacriacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numerodaconta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return numerodaconta == other.numerodaconta;
	}
	
	public void adicionar(double quantidade) {
		setSalario(salario + quantidade);
	}
	public void Sacar(double quantidade) {
		setSalario(salario - quantidade);
	}
	
	
	public void transferencia(List<Conta>list,int numerodaconta,double transferencia,int lugardetransferencia) {
		for(Conta d : list) {
			if(d.getNumerodaconta() == numerodaconta) {
				d.Sacar(transferencia);
				System.out.println(d);
				}
		}
		for(Conta c : list) {
			if(c.getNumerodaconta() == lugardetransferencia) {
				c.adicionar(transferencia);
				System.out.println(c);
			}
		}
	}
	public void criarcontacomdinheiro(char n,List<Conta>list, int numerodaconta,Usuario usuario, double valor) {
		
		    Conta conta = new Conta(valor, numerodaconta, usuario, new Date());
			list.add(conta);
			System.out.println(list);
	}
	public void criarcontasemdinheiro(char n,List<Conta>list, int numerodaconta,Usuario usuario, double valor) {
		Conta conta = new Conta(0.0, numerodaconta, usuario, new Date());
		list.add(conta);
		System.out.println(list);
	}
	
	public void depositar(List<Conta>list,double deposito,int numerodaconta) {
		for(Conta c : list) {
			if(c.getNumerodaconta() == numerodaconta) {
				c.adicionar(deposito);
				System.out.println(c);
			}
		}
	}
	public void  sacar(List<Conta>list,double deposito,int numerodaconta) {
		for(Conta c : list) {
			if(c.getNumerodaconta() == numerodaconta) {
				c.Sacar(deposito);
				System.out.println(c);
			}
		}
	}
	public void listas(List<Conta>list) {
		for(Conta c : list) {
			System.out.println(c);
		}
	}
	
	
	public String toString() {
        return "Data de criação " + sdf.format(datacriacao) + "\n"
        	 +	"Total: " + String.format("%.2f", salario) + "\n" 
			 + "Numero da conta: " + numerodaconta + "\n"
			 + "\n" 
			 + "DADOS \n"   
			 + "Nome: " + usuario.getName() + "\n"
			 + "Cpf: " + usuario.getCpf() + "\n"
			 + "Email: " + usuario.getEmail() + "\n"
			 + "Telefone: " + usuario.getTelefone()
			 + "\n" + "\n" + "\n" + "\n";
             
	}
	

}
