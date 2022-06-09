public class teste {
    public static void main (String[]args){
        int controle, acumulador = 0;
        boolean condiçao;
        System.out.println("Numero da iteraçao\tCondiçao\tControle\tAcumulado");
        for (controle = 1; controle <= 10; controle++ ){
            acumulador +=controle;
            condiçao = controle <= 10;
            System.out.println("Interaçao" + controle + "\t\t\t" + condiçao + "\t\t\t" + controle + "\t\t\t" + acumulador);


        }
    }
}
