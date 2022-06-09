public class ForWhite2 {
    public static void main (String[]args){
        int contadorfor, contadorWhile;

        //for (Inicializaçao condiçao; decremento)
        for (contadorfor = 10; contadorfor > 0; contadorfor --)
         System.out.println("*");

        System.out.println("");
        contadorWhile = 10; // Inicializaçao do while

        //while(condiçao)
        while (contadorWhile > 0){
            System.out.println("*");
            contadorWhile--; //Decremento do while
        }
    }
}
