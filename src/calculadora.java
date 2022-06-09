import java.util.Scanner; //Import necessario para utilizar a classe Scanner
public class calculadora {
    public static void main (String[]args){
        System.out.println("======= Calculadora=======");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero ");
        double num1 = entrada.nextDouble(); //le a opçao digitada

        System.out.println("Digite outro numero:");
        double num2 = entrada.nextDouble(); //le a opçao digitada
        System.out.println("======= Operação Matematica =======");
        System.out.println("+ Adicionar os numeros");
        System.out.println("- Subtrair os numeros" );
        System.out.println(" * multiplicar os numeros");
        System.out.println("======= Escolha uma opção =======");
        String oper = entrada.next(); // le a opçao digitada

        switch (oper) {
            case "+":
                double soma = num1 + num2;
                System.out.println("Voce escolheu adiçao ");
                System.out.println("O numero" + num1 + " + " + num2 + " = " + soma);

                break;
            case "-":
                double sub = num1 - num2;
                System.out.println("Voce escolheu subtraçao");
                System.out.println(" O numero " + num1 + " - " + num2 + " = " + sub);

                break;
            case "*":
                double mult = num1 * num2;
                System.out.println("Voce escolheu subtraçao");
                System.out.println(" O numero " + num1 + " * " + num2 + " = " + mult );

                break;
            default:
                System.out.println("Operação nao disponivel ou invalida ");


        }
        entrada.close();
    } // fim do metodo main
} // fim do classe calculadora

