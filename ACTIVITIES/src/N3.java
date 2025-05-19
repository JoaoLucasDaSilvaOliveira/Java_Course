public class N3 {
    public static void main(String[] args) {
        /*
            SOME OS NRO PARES DO INTERVALO DE 0 ~ 100
         */
        int sumEven=0;
        for (int i = 0 ; i<= 100; i++){
            if (i % 2 == 0){
                sumEven+=i;
            }
        }
        System.out.println("Somatório: "+sumEven);
    }
}
