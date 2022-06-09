import java.util.Scanner; //import necessario para utilizar a classe

public class Midia {
    public static void main (String[]args){
        // Intancia do objeto (buffer) utilizando a classe Scanner
        Scanner entrada = new Scanner(System.in);
        //Declaraçao de variavel
        String aluno;
        double nota1 , nota2 , nota3 ,  media;
        System.out.println("Digite seu nome: ");
        aluno = entrada.nextLine(); //Recebe o nome do aluno

        System.out.println("Digite tres notas");
        nota1 = entrada.nextDouble(); //Recebe a primeira nota
        nota2 = entrada.nextDouble(); //Recebe a segunda nota
        nota3 = entrada.nextDouble(); // Recebe a terceira nota

        media = (nota1 + nota2 + nota3) /3; // Calcula a media das notas

        System.out.println(aluno + " sua media é: " + media);//exibe a media


        System.out.println("vamos melhorar essa notas?!");

        //    entrada.close(); //Encerra a instancia
    } // fim do metodo main
} // fim da classe media

