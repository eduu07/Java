public class ForWhite {
    public static void main(String[]args){

        int contfor, contwhite;

        //for (inicializaçao; condiçao; incremento)
        for (contfor = 0; contfor < 5; contfor ++)
            System.out.println("Valor do contFor: " + contfor);

        contwhite = 0; //Inicializaçao do while

        //while (condiçao)
        while(contwhite < 5) {
            System.out.println("Valor do contWhile: " + contwhite);
            contwhite++; //Incremento do while
        }
    }
}
