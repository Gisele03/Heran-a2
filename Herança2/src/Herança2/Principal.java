package Herança2;

public class Principal {
		
		public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("João", "1", 3.000, "(15)99111111", "Rua Silva", "10/06/1991");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Telefone: " + funcionario.getTelefone());
		System.out.println("Endereco: " + funcionario.getEndereco());
		System.out.println("DataNascimento: " + funcionario.getDataNascimento());
		
		Administrador administrador = new Administrador("João", "1", 3.000, "(15)99111111", "Rua Silva", "10/06/1991", 1);
		System.out.println("\nAdministrador:");
		System.out.println("Nome: " + administrador.getNome());
		System.out.println("Matricula: " + administrador.getMatricula());
		System.out.println("Salario: " + administrador.getSalario());
		System.out.println("Telefone: " + administrador.getTelefone());
		System.out.println("Endereco: " + administrador.getEndereco());
		System.out.println("DataNascimento: " + administrador.getDataNascimento());
		System.out.println("Cra: " + administrador.getCra());
		
		Engenheiro engenheiro = new Engenheiro("João", "1", 3.000, "(15)99111111", "Rua Silva", "10/06/1991", 2);
		System.out.println("\nEngenheiro:");
		System.out.println("Nome: " + engenheiro.getNome());
		System.out.println("Matricula: " + engenheiro.getMatricula());
		System.out.println("Salario: " + engenheiro.getSalario());
		System.out.println("Telefone: " + engenheiro.getTelefone());
		System.out.println("Endereco: " + engenheiro.getEndereco());
		System.out.println("DataNascimento: " + engenheiro.getDataNascimento());
		System.out.println("NumCrea: " + engenheiro.getNumCrea());
		
		Medico medico = new Medico("João", "1", 3.000, "(15)99111111", "Rua Silva", "10/06/1991", 3);
		System.out.println("\nMedico:");
		System.out.println("Nome: " + medico.getNome());
		System.out.println("Matricula: " + medico.getMatricula());
		System.out.println("Salario: " + medico.getSalario());
		System.out.println("Telefone: " + medico.getTelefone());
		System.out.println("Endereco: " + medico.getEndereco());
		System.out.println("DataNascimento: " + medico.getDataNascimento());
		System.out.println("Crm: " + medico.getCrm());
		
		
	}

}


