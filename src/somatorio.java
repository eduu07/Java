public class somatorio {
    public static void main(String[]args){
        int contator = 1;
        int acumulador = 0;

        while (contator <= 100){
            if (contator % 2 == 0)
                acumulador = acumulador + contator; // adicionar o contador par ao acumulador
            contator++; // incrementa o contador

        }
        System.out.println("A soma dos numeros pares de 1 a 100 é " + acumulador );

    } // fim do metodo main
} // fim da classe somatorio
