public class Contador {
    public static void main (String[]args){
        int contador; // declarando o contado
        contador = 1; // inicializando o contator

        while (contador <= 100){
            System.out.println(contador + " ");
            if (contador%30 == 0) System.out.println(" ");// quebra de linha para ver todos os numeros

            contador++; //mesma coisa que utilizar contador = contador + 1
        }
    } // fim do metodo main
} // fim da classe contador
