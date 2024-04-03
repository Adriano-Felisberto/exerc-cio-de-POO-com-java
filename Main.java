import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Marca;
        int ano;
        String cor;
        String model = "esportivo";
        int motor = 400;
        String ligar = "LIGAR";
        String desligar = "DESLIGAR";
        String acelerar = "ACELERAR";
        String freiar = "FREIAR";
        String trocar = "TROCAR DE MACHA";

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual a cor do seu carro? ");
        cor = ler.nextLine();

        System.out.println("Qual a marca do seu carro? ");
        Marca = ler.nextLine();

        System.out.println("Qual o ano do seu carro? ");
        ano = ler.nextInt();

        System.out.println("então seu carro é uma "+ model + "e o moto tem "+ motor);
        System.out.println("o que vc pode fazer esse carro: "+ ligar + " "+ desligar + " "+ acelerar + " "+ freiar+ " "+ trocar);




    }
    }
