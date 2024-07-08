

import java.util.Scanner;

public class contador{
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser mairo que o primeiro ") ;
		}

		int contagem = parametroDois - parametroUm;
		for(int i =1; i<=contagem; i++){
			System.out.println("Imprindo o numero " +i);
		}
	}
}