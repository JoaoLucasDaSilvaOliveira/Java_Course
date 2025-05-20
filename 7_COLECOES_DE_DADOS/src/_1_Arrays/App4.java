package _1_Arrays;

public class App4 {
    public static void main(String[] args) {
        //conhecendo arrays multidimensionais;
        int [][] arrayM = new int[3][3];
        arrayM[1][1] = 5;
        for (int i=0; i<arrayM.length; i++){
            for (int j=0; j<arrayM[i].length; j++){
                System.out.printf("%d  ", arrayM[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //inicialização rápida
        int [][] arrayR = { {1,2,3}, {4,5,6}, {7,8,9}};
        for (int i=0; i<arrayR.length; i++){
            for (int j=0; j<arrayR[i].length; j++){
                System.out.printf("%d  ", arrayR[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //arrays multidimensionais não isométricos
        int [][] arrayI = new int[3][]; // deixa a qtd de colunas para definir dps
        arrayI[0] = new int[2];
        arrayI[1] = new int[3];
        arrayI[2] = new int[1];
        for (int[] d1 : arrayI){
            for (int n : d1){
                System.out.printf("%d  ", n);
            }
            System.out.println();
        }
    }
}
