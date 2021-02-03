package Nota;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		// Criado dois objetos para se guardar o valor das notas
		Nota notaA = new Nota();
		Nota notaM = new Nota();
		
		System.out.println("Digite Nota de algma das provas:");
		String strNota= read.nextLine(); // Criando um objeto para ler a Nota A
		// como o valor é lido em String uso de um parse para transformalo em int e assim salvando no objeto notaA
		notaA.setNota(Integer.parseInt(strNota)); 
		//System.out.println("Nota da prova foi "+notaA.getNota());
		
		System.out.println("Digite a nota que ficou na media");
		String strMedia= read.nextLine(); // criando objeto para ler valor notaM
		// como o valor é lido em String uso de um parse para transformalo em int e assim salvando no objeto notaM
		notaM.setNota(Integer.parseInt(strMedia));
		//System.out.println("Nota da Media foi "+ notaM.getNota());
		 
		// Criando objeto para salvar resultado
		Nota resultado = new Nota();
		// chamando função que calcula nota e salvando no objeto resltado do tipo nota
		 resultado.setNota(resultado.calculaNota(notaA.getNota(), notaM.getNota()));
		 System.out.println("A outra nota é :"+resultado.getNota());
		
	}

}
