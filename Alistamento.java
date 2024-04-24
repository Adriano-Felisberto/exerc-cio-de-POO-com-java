import java.util.Scanner;
//Aluno: Adriano Felisberto dos Santos
//Turma:3ºB
public class Alistamento {
    public static void main(String[] args) {
        int anoatual = 2024;
        int idade;
        String nome;

        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        nome = ler.nextLine();

        System.out.println("Em que ano você nasceu? ");
        int anonascimento = ler.nextInt();

        idade = anoatual - anonascimento;

        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            System.out.println(nome + ", você tem " + idade + " anos.");
            System.out.println("Faltam " + anosFaltantes + " anos para você se alistar.");
        } else if (idade == 18) {
            System.out.println(nome);

            System.out.println(nome + ", você tem " + idade + " anos.");
            System.out.println("Você precisa se alistar este ano.");
        } else {
            System.out.println(nome);
            System.out.println(nome + ", você tem " + idade + " anos.");
            System.out.println("Você já passou do período de alistamento em " + (idade - 18) + " anos.");
        }
    }
}
