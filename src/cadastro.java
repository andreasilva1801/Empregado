
public class cadastro {
	public static void main(String args[] ){
		// TODO Auto-generated method stub
		empregado c1,c2,c3;
		
		c1 = new empregado();
		c2 = new empregado();
		c3 = new empregado();
		
		c1.nome = "ANDREA";
		c1.cargo = "faxineira";
		c1.salario = 1200;
		
		c2.nome = "Vitor Cunha";
		c2.cargo = "vendedor";
		c2.salario = 3200.12;
		
		c3.nome = "ana brito";
		c3.cargo = "vendedor";
		c3.salario = 1830.45;
		

		c1.exibirInformacao();
		c2.exibirInformacao();
		c3.exibirInformacao();
				

	}

}
