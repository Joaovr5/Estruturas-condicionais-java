package com.dio.aula;

public class CondicionaisEncadeadas {

	public static void main(String[] args) {
		
		//Resultado Escolar 
		
				int nota = 6;
				
				if(nota >= 7)
					System.out.println("Aprovado");
				
				else if(nota >= 5 && nota < 7)
					System.out.println("Recuperação");
				
				else
					System.out.println("Reprovado");

	}

}
