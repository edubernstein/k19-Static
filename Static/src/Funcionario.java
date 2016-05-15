public class Funcionario {
	public String			nome;
	public double			salario;
	public static double	vale;
	
	public static void reajustaVale(double taxa) {
		Funcionario.vale += Funcionario.vale * taxa;
	}
}
