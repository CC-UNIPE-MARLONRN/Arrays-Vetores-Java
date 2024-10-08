import java.util.*;

public class Methods<Array> {

	private Object[] elementos;
	private int tamanho_atual;
	private static final int capacidade_inicial = 10;
	
	@SuppressWarnings("unchecked")
	public Methods() {
		this.elementos = (Array[]) new Object[capacidade_inicial];
		this.tamanho_atual = 0;
	}
	
	//Aumenta o tamanho do Array quando lotar
	private void RedimencionarArray(){
		elementos = Arrays.copyOf(elementos, elementos.length *2);
	}
	
	//Adiciona Valores
	public void AdicionarValor(Array Valor) {
		if(tamanho_atual == elementos.length) {
			RedimencionarArray();
		}
		elementos[tamanho_atual++] = Valor;
	}
	
	//Remove valores
	public void RemoverValor() {
		if(tamanho_atual <= 0) {
			System.out.println("Não há valores para Remover!");
		}
		
		Object[] temp = new Object[tamanho_atual - 1];
	    System.arraycopy(elementos, 0, temp, 0, tamanho_atual - 1);
	    
	    elementos = temp;
	    tamanho_atual--;
	}
	
	//Visualiza o ArrayList
	public void VerValores() {
		System.out.print("[");
		if(tamanho_atual > 0) {
		for(int i = 0; i < tamanho_atual - 1; i++) {
			System.out.printf("%d,", elementos[i]);
			System.out.print(" ");
		}
		System.out.printf("%d", elementos[tamanho_atual - 1]);
		}
		else System.out.print("Vetor Vazio");
		System.out.println("]");
	}
	
	//Vê o tamanho atual do Array
	public int VerTamanho() {
		return tamanho_atual;
	}
}


