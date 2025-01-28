import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFinal;
        String nome;
        System.out.println("===Bem vindos ao claculo de pontos XP===");

        do {
            System.out.println("Digite um nome do seu Heroi no minímo três letras;");
            nome = sc.nextLine();
        }while(nome.length() < 3);

        System.out.println("Digite o total de Vitórias");
        int totalVitorias = sc.nextInt();

        System.out.println("Digite o total de Derrotas:");
        int totalDerrotas = sc.nextInt();

        totalFinal = (int) calcularXP(totalVitorias, totalDerrotas);
        String status = mostrarNivel(totalFinal);

        System.out.printf("O Herói %s, tem de saldo de %d Vitórias, esta no nivel %s:",nome,totalFinal,status);

    }
    static double calcularXP(int vitorias, int derrotas){
        int valorFinal;
        valorFinal = vitorias - derrotas;
        return valorFinal;
    }

    static String mostrarNivel(int totalFinal){
        String forca;
        if(totalFinal < 10 ){
            forca = ("Ferro");
        }else if(totalFinal > 11 && totalFinal < 20){
            forca = ("Bronze");
        }else if(totalFinal > 21 && totalFinal < 50){
            forca = ("Prata");
        }else if(totalFinal > 51 && totalFinal < 80){
            forca = ("Ouro");
        }else if(totalFinal > 81 && totalFinal < 90){
            forca = ("Diamante");
        }else if(totalFinal > 91 && totalFinal < 100){
            forca = ("Lendário");
        }else{
            forca = ("Super saiyajin Imortal");
        }
        return forca;
    }
}