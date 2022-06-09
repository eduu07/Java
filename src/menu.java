
import java.util.Scanner; //Import necessario para utilizar a classe Scanner

public class menu {
    public static void main(String[]args) {

        System.out.println("====== Menu de Opções ======");
        System.out.println("1 - Cadastrar Produtos");
        System.out.println("2 - Listas De  Produtos");
        System.out.println("3 - Sair Do Sistema");
        System.out.println("====== escolha uma opçao ======");

        Scanner entrada = new Scanner(System.in);
        int menu = entrada.nextInt(); // Le a opçao digitada


        switch (menu){
            case 1:
                System.out.println("Voce escolheu o menu1");
                System.out.println("Voce escolheu a opçao cadastrar produtos,");




                break;

            case 2:
                System.out.println("Voce escolheu a menu 2");
                System.out.println("Que é a opçao Listar Produtos");
                break;

            case 3:
                System.out.println("Voce escolheu o menu 3");
                System.out.println("Que é a opçao Sair Do Sistema");
                break;
            default:
                System.out.println("Item de menu invalido");

        }
        entrada.close();
    } // fim do metodo main
} // fim da classe menu

