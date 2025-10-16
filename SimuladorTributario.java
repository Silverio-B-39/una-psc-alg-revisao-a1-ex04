package SimuladorTributario;

public class SimuladorTributario {

	public static double calcularImposto(double faturamento, int aliquota) {
		return faturamento * ((double) aliquota / 100.0);
	}

	public static double calcularDiferenca(double impostoAntigo, double impostoProposto) {
		return Math.abs(impostoProposto - impostoAntigo);
	}

	public void statusDialogo(boolean acessoAoGoverno) {
		System.out.println("\n-- Análise de Diálogo --");

		if (acessoAoGoverno) {
			System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
		} else {
			System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
		}
	}

	public static void main(String[] args) {

		final double FATURAMENTO_BASE = 50000000.00;

		System.out.println("=== Análise de Tributação de Fintechs (Simplificado Total) ===");

		System.out.printf("Faturamento Base: %.2f\n", FATURAMENTO_BASE);
		System.out.println();

		double antigoA = calcularImposto(FATURAMENTO_BASE, 9);
		double propostoA = calcularImposto(FATURAMENTO_BASE, 15);
		double difA = calcularDiferenca(antigoA, propostoA);

		System.out.println("-- Proposta A (9% -> 15%) --");
		System.out.printf("Imposto Antigo (9%%): %.2f\n", antigoA);
		System.out.printf("Imposto Proposto (15%%): %.2f\n", propostoA);
		System.out.printf("Aumento de Imposto: %.2f\n", difA);
		System.out.println();

		double antigoB = calcularImposto(FATURAMENTO_BASE, 15);
		double propostoB = calcularImposto(FATURAMENTO_BASE, 20);
		double difB = calcularDiferenca(antigoB, propostoB);

		System.out.println("-- Proposta B (15% -> 20%) --");
		System.out.printf("Imposto Antigo (15%%): %.2f\n", antigoB);
		System.out.printf("Imposto Proposto (20%%): %.2f\n", propostoB);
		System.out.printf("Aumento de Imposto: %.2f\n", difB);

		SimuladorTributario simulador = new SimuladorTributario();

		simulador.statusDialogo(true);
		simulador.statusDialogo(false);
	}
}