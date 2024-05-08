import java.util.Scanner;
//ALUNOAdriano Felisberto dos Santos 
//TURMA:3ºB
//ATIVIDA DA CLASSE PEIXE E MAMIFERO
class Animal {
    private String cor;
    private String andar;
    private String especie;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getAndar() {
        return andar;
    }

    public String toString() {
        return "Animal [especie=" + especie + ", ação=" + andar + ", cor=" + cor + "]";
    }
}

class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String cor, String andar, String especie, String caracteristica) {
        super.setCor(cor);
        super.setAndar(andar);
        super.setEspecie(especie);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return "Peixe [especie=" + super.getEspecie() + ", ação=" + super.getAndar() + ", cor=" + super.getCor() + ", caracteristica=" + caracteristica + "]";
    }
}

class Mamifero extends Animal {
    private String caracteristica;

    public Mamifero(String cor, String andar, String especie, String caracteristica) {
        super.setCor(cor);
        super.setAndar(andar);
        super.setEspecie(especie);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        return "Mamífero [especie=" + super.getEspecie() + ", ação=" + super.getAndar() + ", cor=" + super.getCor() + ", caracteristica=" + caracteristica + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner ler = new Scanner(System.in);
        System.out.println("Você quer a classe peixe ou mamífero com as numerações a seguir:");
        System.out.println("[1] PEIXE");
        System.out.println("[2] MAMIFERO");
        escolha = ler.nextInt();
        ler.nextLine();
        if (escolha == 1) {
            System.out.println("Qual a cor do peixe:");
            String corDoPeixe = ler.nextLine();

            System.out.println("Como ele se locomove?");
            String nadarDoPeixe = ler.nextLine();

            System.out.println("Qual a espécie?");
            String especieDoPeixe = ler.nextLine();

            System.out.println("Qual a característica?");
            String caracteristicaDoPeixe = ler.nextLine();

            Peixe peixe = new Peixe(corDoPeixe, nadarDoPeixe, especieDoPeixe, caracteristicaDoPeixe);
            System.out.println(peixe.toString());
        } else if (escolha == 2) {
            System.out.println("Qual a cor do mamífero:");
            String corDoMamifero = ler.nextLine();

            System.out.println("Como o mamífero se move?");
            String andarDoMamifero = ler.nextLine();

            System.out.println("Qual a espécie do mamífero?");
            String especieDoMamifero = ler.nextLine();

            System.out.println("Qual a característica?");
            String caracteristicaDoMamifero = ler.nextLine();

            Mamifero mamifero = new Mamifero(corDoMamifero, andarDoMamifero, especieDoMamifero, caracteristicaDoMamifero);
            System.out.println(mamifero.toString());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
