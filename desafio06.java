package fundamentos;
import java.util.Scanner;
public class desafio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		System.out.println("Vamos jogar, responda com S para sim e N para nao!");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vitima? ");
		char perg1 = entrada.nextLine().charAt(0);
		cont = perg1 == 'S' ? cont+1 : cont + 0;
		System.out.println("Esteve no local? ");
		char perg2 = entrada.nextLine().charAt(0);
		cont = perg2 == 'S' ? cont+1 : cont + 0;
		System.out.println("Mora perto da vitima? ");
		char perg3 = entrada.nextLine().charAt(0);
		cont = perg3 == 'S' ? cont+1 : cont + 0;
		System.out.println("Devia para vitima? ");
		char perg4 = entrada.nextLine().charAt(0);
		cont = perg4 == 'S' ? cont+1 : cont + 0;
		System.out.println("Ja trabalhou com a vitima ");
		char perg5 = entrada.nextLine().charAt(0);
		cont = perg5 == 'S' ? cont+1 : cont + 0;
		
		System.out.println(cont == 2 ? "suspeito": cont == 3||cont == 4 ? "cumplice" : cont == 5 ? "assassino" : "");
	}

}