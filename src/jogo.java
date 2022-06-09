import java.util.Scanner; // Import necessario para utilizar a classe

public class jogo {
    public static void main(String[]args) {
        //Infancia do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Digite o numero de pontos do jogador: ");
        pontos = entrada.nextInt(); //recebe o numeros de pontos

        if (pontos >= 1000){

            System.out.println("Voce passou para a fase 2!!!");

        }

        System.out.println("seguindo ");

        entrada.close();

    }// fim do metodo main
} // fim da classe jogo

