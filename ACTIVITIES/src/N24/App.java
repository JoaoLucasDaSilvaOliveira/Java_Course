package N24;

public class App {
    public static void main(String[] args) {
        String text1 = "048.511.110-10";
        String text2 = "04851111010";
        String text3 = "048 511 110 10";
        System.out.println(validateCpf(text1));
        System.out.println(validateCpf(text2));
        System.out.println(validateCpf(text3));

        //testando outra forma de fazer isso:
//        String [] spl = text.split("[.-]");
//        System.out.println(Arrays.toString(spl));
//        System.out.println(spl.length);
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i< spl.length; i++){
//             if (spl[i].matches(\\d)
//            str.append(spl[i]);
//        }
//        System.out.println(str);
    }
    private static boolean validateCpf(String cpf){
        //da pra fazer assim:
            /*
            String regex1 = "\\d{3}.\\d{3}.\\d{3}-\\d{2}"; //"\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
            String regex2 = "\\d{3}\\d{3}\\d{3}\\d{2}"; //"\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d";
            String regex3 = "\\d{3}\\s\\d{3}\\s\\d{3}\\s\\d{2}"; //"\\d\\d\\d\\s\\d\\d\\d\\s\\d\\d\\d\\s\\d\\d";

            if (cpf.matches(regex1) || cpf.matches(regex2) || cpf.matches(regex3)){
                return true;
            }
            return false;*/
        //ou assim:
        return cpf.matches("\\d{3}([\\s.])?\\d{3}([\\s.])?\\d{3}([\\s-])?\\d{2}");
    }
}
