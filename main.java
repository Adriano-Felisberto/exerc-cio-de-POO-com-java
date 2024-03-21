import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int esco;
        int n;
        int n2;
        int escolha;
        int resultado;


        Scanner ler = new Scanner(System.in);
        System.out.println("escolha utilizando os numeros para escolher logo abaixo qual operação vc deseja usar: ");
        System.out.println("[1]soma");
        System.out.println("[2]subtração");
        System.out.println("[3]multiplicação");
        System.out.println("[4]divisão");

        System.out.println("qual operação vc deseja utilizar? ");
        esco = ler.nextInt();
        
        if (esco == 1) {
            
            System.out.println("escolha o primeiro numero para a soma? ");
            n = ler.nextInt();

            System.out.println("qual o proximo numero? ");
            n2 = ler.nextInt();

            System.out.println("" + n + "+" + n2);
            int soma = n + n2;
            System.out.println("o resultado da soma pe de: "+ soma);
        }
        
        if (esco == 2) {
            System.out.println("escolha o primeiro numero para a subtração? ");
            n = ler.nextInt();

            System.out.println("qual o proximo numero? ");
            n2 = ler.nextInt();

            System.out.println("" + n + "-" + n2);
            int subtração = n - n2;
            System.out.println("o resultado da subtração é de: "+ subtração);
        }
        if (esco == 3) {
            System.out.print("vc seja apenas que mostre a tabuada? \n");
            System.out.print("[1] tabuada\n");
            System.out.print("[2] calculo normal\n");
            System.out.println("qual vc deseja utilizar? ");
            escolha = ler.nextInt();

            if (escolha == 1) {
                System.out.println("escolha o primeiro numero para a tabuada? ");
            n = ler.nextInt();

            for (int cc = 0; cc <= 10; cc++) {
                resultado = n * cc;
                System.out.println(n + " x " + cc + " = " + resultado);
            }
                
            }
            if (escolha == 2) {
                System.out.println("escolha o primeiro numero para a multiplicação? ");
            n = ler.nextInt();

            System.out.println("qual o proximo numero? ");
            n2 = ler.nextInt();

            System.out.println("" + n + "X" + n2);
            int multiplicação = n * n2;
            System.out.println("o resultado da multiplicação é de: "+ multiplicação);
            
        }
            }
            
        if (esco == 4) {
            System.out.println("escolha o primeiro numero para a divisão? ");
            n = ler.nextInt();

            System.out.println("qual o proximo numero? ");
            n2 = ler.nextInt();

            System.out.println("" + n + "/" + n2);
            int divisão = n / n2;
            System.out.println("o resultado da divisão é de: "+ divisão);
            
        }
        }

            
        }
