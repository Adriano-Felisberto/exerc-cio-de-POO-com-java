import java.util.Scanner;

public class Salario {
    //Adriano Felisberto dos Santos
    //Turma:3ºB
    public static void main(String[] args) {
        float sala;
        Scanner ler = new Scanner(System.in);
        System.out.println(("Quanto você recebe? "));
        sala = ler.nextFloat();

        if (sala <= 645){
            System.out.println("Até um salario");
        }
        if (sala > 645 && sala < 1935){
            System.out.println("Até 3 salarios Minimos");
        }
        if (sala > 1935 && sala < 3225) {
            System.out.println("Até 2 salarios Minimos");
        }
        if (sala > 3225) {
            System.out.println("Acima de 5 Salarios minimos");
        }

    }
    }

