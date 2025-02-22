package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class bhaskaraeq {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			double a, b, c, delta, x1, x2;
			
			System.out.println("Digite abaixo o valor de a: ");
			a = sc.nextDouble();
			sc.nextLine();
			System.out.println("");
			
			System.out.println("Digite abaxio o valor de b: ");
			b = sc.nextDouble();
			sc.nextLine();
			System.out.println("");
			
			System.out.println("Por fim, digite abaixo o valor de c: ");
			c = sc.nextDouble();
			sc.nextLine();
			System.out.println("");
			
				delta = Math.pow(b, 2.0) - 4 * a * c;
				x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
				x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
					System.out.println("O valor de delta é " + delta);
					System.out.println("O valor de x1 é " + x1);
					System.out.println("O valor de x2 é " + x2);
			
		
		sc.close();
	}

}
