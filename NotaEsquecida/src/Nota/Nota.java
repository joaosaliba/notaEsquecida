package Nota;

public class Nota {
	private int nota;
	
	public int getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	
	public int calculaNota(int nA, int nM) {
		
		// como sabe-se o valor da media � soma das duas notas dividivo por 2
		// ao fazer o caminho inverso chegaremos  que (m�dia *2) - notaA = notaB 
		int resultado;
		resultado = nM*2;
		resultado = resultado -nA;
		return resultado;
	}
}
