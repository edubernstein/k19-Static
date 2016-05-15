public class TestaContador {
	
	public static void main(String[] args) {
		System.out.println("Contador: " + Conta.contador);
		Conta c1 = new Conta();
		System.out.println("Número da primeira conta: " + c1.numero);
		System.out.println("Contador: " + Conta.contador);
		Conta c2 = new Conta();
		System.out.println("Número da segunda conta: " + c2.numero);
		System.out.println("Contador: " + Conta.contador);
		Conta.zeraContador();
		System.out.println("Contador: " + Conta.contador);
	}
}
