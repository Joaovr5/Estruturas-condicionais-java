package com.dio.aula;

public class SwitchCase {

	public static void main(String[] args) {
		
//		String sigla = "M";
//		
//		if(sigla == "P")
//			System.out.println("Pequeno");
//		else if(sigla == "M")
//			System.out.println("Medio");
//		else if(sigla == "G")
//			System.out.println("Grande");
//		else
//			System.out.println("Tamanho não definido");

		//Exemplo de uso para simplificação do código
		
		String plano = "T";
		
		switch(plano) {
		case "T": {
			System.out.println("5gb YouTube");
		}
		case "M": {
			System.out.println("Whats e Instagram grátis");
		}
		case "B": {
			System.out.println("100 minutos de ligação");
		}
		}
		//Nesses casos podendo ser feito o uso de "continue", "break" e "default"
	}

}
