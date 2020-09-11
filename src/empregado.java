
public class empregado {
	String nome;
	String cargo;
	double salario;
	
	void exibirInformacao(){
		System.out.println(" CADASTRO FUNCIONARIO  ");
		System.out.println("Nome:"+nome);
		System.out.println("Cargo: "+cargo);
		System.out.printf("Salario  R$ %.2f",salario);
	}
	
}
