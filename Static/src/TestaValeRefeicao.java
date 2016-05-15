public class TestaValeRefeicao {
	public static void main(String[] args) {
		System.out.println("Valor do vale: " + Funcionario.vale);
		Funcionario.vale = 10;
		System.out.println("Valor do vale: " + Funcionario.vale);
		Funcionario.reajustaVale(0.3);
		System.out.println("Valor do vale: " + Funcionario.vale);
	}
}
