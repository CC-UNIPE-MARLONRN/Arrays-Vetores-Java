public class Main {

	public static void main(String[] args) {
		Methods<Integer> Array = new Methods<>();
		
		System.out.println(Array.VerTamanho());
		Array.VerValores();
		
		Array.AdicionarValor(1);
		Array.AdicionarValor(2);
		Array.AdicionarValor(3);
		
		System.out.println(Array.VerTamanho());
		Array.VerValores();
		
		Array.RemoverValor();
		Array.VerValores();
		Array.VerTamanho();
	}
}
