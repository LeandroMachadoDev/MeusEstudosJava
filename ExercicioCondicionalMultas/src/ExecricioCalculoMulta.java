import java.util.Scanner;
public class ExecricioCalculoMulta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a velocidade do veiculo: ");
		int velocidade = sc.nextInt();
		double multa = 0;
		double valorKm = 10;
		if (velocidade > 80) {
			multa = (velocidade - 80) * valorKm;
			System.out.printf("Voce recebeu uma multa por velocidade no valor de %.2f", multa);
		}
		else {
			System.out.println("Parabens voce esta dentro do limite ");
		}

	}

}
